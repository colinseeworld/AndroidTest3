package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo : Fragment() {
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_two, container, false)

        communicator = activity as Communicator

        view.nextPage.setOnClickListener {
//            communicator.passData2(view.edit_text_house.text.toString(),
//                view.edit_text_city.text.toString(),
//                view.edit_text_country.text.toString())

            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container,FragmentThree())
                ?.addToBackStack("")
                ?.commit()
        }

        return view
    }
}