package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDone.setOnClickListener {
            yourName()
        }
    }
    private fun yourName(){
        var ourname = editName.text.toString()
        name.text = "Hello, $ourname"
        whatname.text = "Hi, my name is $ourname"
    }
}