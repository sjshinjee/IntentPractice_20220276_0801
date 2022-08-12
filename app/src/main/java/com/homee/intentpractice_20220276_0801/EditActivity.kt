package com.homee.intentpractice_20220276_0801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        finishBtn.setOnClickListener {
            val name = nameEdt.text.toString()
            val phoneNum = phoneEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("name",name)
                .putExtra("phoneNum", phoneNum)
            setResult(RESULT_OK, resultIntent)
            finish()
        }

    }
}