package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*findViewById<View>(R.id.open_shadhin_btn).setOnClickListener {
            ShadhinMusicSdkCore.openShadhin(this,"8801855290761")
        }

        findViewById<View>(R.id.open_noor_btn).setOnClickListener {
            Noor.openNoor(this,"8801855290761")
        }*/
    }


}