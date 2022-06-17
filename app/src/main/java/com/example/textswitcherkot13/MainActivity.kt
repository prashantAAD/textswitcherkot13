package com.example.textswitcherkot13

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textSwitcher: TextSwitcher
    private lateinit var bk:Button
    private lateinit var nt:Button
    private val textArray= arrayOf("prashant chauhan","maulik chauhan","aarav chauhan","tina chauhan")
    private var pos:Int=-1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         bk=findViewById(R.id.back)
         nt=findViewById(R.id.next)
        textSwitcher=findViewById(R.id.textSwitcher)

        textSwitcher.setFactory {
            val textView = TextView(this@MainActivity)
            textView.textSize = 20F
            textView.gravity = Gravity.CENTER
            textView
        }
        bk.setOnClickListener {
            if (pos>0){
                pos-=1
                textSwitcher.setText(textArray[pos])
            }
        }
        nt.setOnClickListener {
            if (pos<textArray.size-1){
                pos+=1
                textSwitcher.setText(textArray[pos])
            }
        }

    }
}