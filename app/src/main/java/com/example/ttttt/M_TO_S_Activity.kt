package com.example.ttttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_m__to__s_.*

class M_TO_S_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m__to__s_)

        convert_BTN.setOnClickListener {

            var mins = minute_ed.text.toString().toInt()
            var m_to_n =mins*60;

            resl.setText(m_to_n.toString())




        }



    }
}
