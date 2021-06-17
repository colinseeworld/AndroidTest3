package com.example.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity(), Communicator{

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentOne())
                .commit()
    }

    override fun passData(name: String, email: String, phone: String) {

        val bundle = Bundle()
        bundle.putString("NAME",name)
        bundle.putString("EMAIL",email)
        bundle.putString("PHONE",phone)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentThree = FragmentThree()
        fragmentThree.arguments = bundle
        transaction.replace(R.id.fragment_container, fragmentThree)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }

//    override fun passData2(house: String, city: String, country: String) {
//        val bundle2 = Bundle()
//        bundle2.putString("HOUSE",house)
//        bundle2.putString("CITY",city)
//        bundle2.putString("COUNTRY",country)
//
//        val transaction = this.supportFragmentManager.beginTransaction()
//        val fragmentThree = FragmentThree()
//        fragmentThree.arguments = bundle2
//        transaction.replace(R.id.fragment_container, fragmentThree)
//        transaction.addToBackStack(null)
//        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//        transaction.commit()
//    }
}
