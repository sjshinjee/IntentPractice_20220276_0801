package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // MainActivity에서 보내준 데이터(수화물)을 찾는 코드
        val myName = intent.getStringExtra("myName")
        dataTxt.text = myName


        backBtn.setOnClickListener {
 //           val myIntent = Intent(this, MainActivity::class.java)
   //         startActivity(myIntent)
            finish()
        }
    }
}