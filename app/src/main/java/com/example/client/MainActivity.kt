package com.example.client

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.librarietest2.DaInterstitial
import com.example.librarietest2.Sclav

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    DaInterstitial.getIn

         //DaInterstitial.getInstance().init(this,"testarerec")


        startActivity(Intent(this,Sclav::class.java))
    }
}
