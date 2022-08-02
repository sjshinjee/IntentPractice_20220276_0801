package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      moveBtn.setOnClickListener {
          val myIntent = Intent(this,SecondActivity::class.java)
          val myName = dataEdt.text.toString()
          myIntent.putExtra("myName", myName)
         //     .putExtra("데이터2", "데이터2")
              .putExtra("데이터3", "데이터3")
          startActivity(myIntent)
      }

        }
    }
