package com.example.fullscreenintentnotification

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            showNotification()
        }

        btn_2.setOnClickListener {
            scheduleNotification(false)
        }

        btn_3.setOnClickListener {
            scheduleNotification(true)
        }

    }

}