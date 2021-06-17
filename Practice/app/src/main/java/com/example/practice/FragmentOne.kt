package com.example.practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_one, container, false)

        communicator = activity as Communicator

        view.next.setOnClickListener {
            communicator.passData(view.edit_text_name.text.toString(),
                view.edit_text_email.text.toString(),
                view.edit_text_phone.text.toString())

//            activity?.supportFragmentManager
//                ?.beginTransaction()
//                ?.replace(R.id.fragment_container,FragmentTwo())
//                ?.addToBackStack("")
//                ?.commit()
        }
        return view
    }
}