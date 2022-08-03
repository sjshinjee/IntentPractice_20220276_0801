package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      moveBtn.setOnClickListener {
//          val myIntent = Intent(this,SecondActivity::class.java)
//          val myName = dataEdt.text.toString()
//          myIntent.putExtra("myName", myName)
//         //     .putExtra("데이터2", "데이터2")
//          //    .putExtra("데이터3", "데이터3")
//          startActivity(myIntent)
//      }

        editBtn.setOnClickListener {
            val myIntent = Intent(this, EditActivity::class.java)
            startActivityForResult(myIntent, 1000)

        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)  // requestCode:출발목적코드  resultCode:실제수정여부확인코드
        //data:수정된 데이터 첨부된 intent
        //그리고 if문으로 분기처리를 해줘야 함/ 가장 먼저 분기처리를 해 줘야하는 것은 실제로 수정이 안료되었는지 부터 물어
        if (resultCode == RESULT_OK){
            if (requestCode == 1000){
                //then 수정된 데이터를 바탕으로 UI반영
                val name = data?.getStringExtra("name")
                val phoneNum = data?.getStringExtra("phoneNum")
                nameTxt.text = name
                phoneNumTxt.text = phoneNum
            }
        }
    }
    }
