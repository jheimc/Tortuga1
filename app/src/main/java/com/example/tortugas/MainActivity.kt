package com.example.tortugas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun radiobuttonClick(view:View){

        if(view == rb_leo){

            tortuga.setImageResource(R.drawable.tmntleo)
        }
        if (view == rb_don) {
            tortuga.setImageResource(R.drawable.tmntdon)
        }
        if(view ==rb_mike){
            tortuga.setImageResource(R.drawable.tmntmike)
        }
        if(view == rb_ralph){
            tortuga.setImageResource(R.drawable.tmntraph)
        }



    }



}
