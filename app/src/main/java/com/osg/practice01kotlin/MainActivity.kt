package com.osg.practice01kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener( object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var num1 = Integer.parseInt(et1.text.toString())
                var num2 = Integer.parseInt(et2.text.toString())
                tv.text= (num1*num2).toString()
            }
        })

        btn2.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        })
    }

}