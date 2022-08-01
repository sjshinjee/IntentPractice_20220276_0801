package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        backBtn.setOnClickListener {
 //           val myIntent = Intent(this, MainActivity::class.java)
   //         startActivity(myIntent)
            finish()
        }
    }
}