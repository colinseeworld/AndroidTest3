package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_three.view.*

class FragmentThree : Fragment() {

    var inputName: String? = ""
    var inputEmail: String? = ""
    var inputPhone: String? = ""

    var inputHouse: String? = ""
    var inputCity: String? = ""
    var inputCountry: String? = ""

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_three, container, false)

        inputName = arguments?.getString("NAME")
        inputEmail = arguments?.getString("EMAIL")
        inputPhone = arguments?.getString("PHONE")

//        inputHouse = arguments?.getString("HOUSE")
//        inputCity = arguments?.getString("CITY")
//        inputCountry = arguments?.getString("COUNTRY")

        view.user_input.text = inputName + "\n" + inputEmail + "\n" + inputPhone
//        view.user_input2.text = inputHouse + "\n" + inputCity + "\n" + inputCountry

        view.submit.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.add(R.id.fragment_container, ThankYouFragment())
                ?.addToBackStack("")
                ?.commit()
        }

        return view
    }
}