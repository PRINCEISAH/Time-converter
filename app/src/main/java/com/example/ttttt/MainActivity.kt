package com.example.ttttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        m_to_s.setOnClickListener {

            var intient_m_to_s=Intent(this,M_TO_S_Activity::class.java)
            startActivity(intient_m_to_s)
        }
    }
}
