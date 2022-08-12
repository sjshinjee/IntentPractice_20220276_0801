package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        moveBtn.setOnClickListener {    //얘 활성화 되어 있으면 가상화면 안 움직이더라
//          val myIntent = Intent(this,SecondActivity::class.java)
//          val myName = dataEdt.text.toString()
//          myIntent.putExtra("myName", myName)
//         //     .putExtra("데이터2", "데이터2")
//          //    .putExtra("데이터3", "데이터3")
//          startActivity(myIntent)
//      }

                editBtn.setOnClickListener {
                    val myIntent = Intent(this, EditActivity::class.java)
                    startActivityForResult(myIntent,100)  //1000은 requestCode 출발 목적코드다 coz 수정화면이 실제로는 많으므로
                                                           // 실무에서는 위에 val REQ_FOR_EDIT처럼 변수를 주고 1000대신에 그 변수명을 써준다
                                }
             }


    //수정한 데이터 확인 후  UI반영
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {   //onActivityReult누르고 자동완성 시켜주면 나옴
        super.onActivityResult(requestCode, resultCode, data)  //여기까지 자동완성 된다 requestCode:출발목적코드  resultCode:실제수정여부확인코드
        //data:수정된 데이터 첨부된 intent
        //그리고 if문으로 분기처리를 해줘야 함/ 가장 먼저 분기처리를 해 줘야하는 것은 실제로 수정이 안료되었는지 부터 물어

        //실제로 수정이 이뤄졌는가
        if (resultCode == RESULT_OK){
            //출발 목적이 맞는가
            if (requestCode == 100){
                //then 수정된 데이터를 바탕으로 UI반영
                val name = data?.getStringExtra("name")  //이 친구는 null값이 가능하므로 error가 뜨므로 일단 ?넣어서 해결 7/27일에 수업할 거임
                val phoneNum = data?.getStringExtra("phoneNum")
                nameTxt.text = name
                phoneNumTxt.text = phoneNum
            }
        }
    }



}
