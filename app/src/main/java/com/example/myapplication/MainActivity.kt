package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMessage("How you doing?")

    }

    private fun showMessage(text: String) {
        System.out.println("msg: "+text)
    }

    private fun sum(a: Int, b: Int) : Int =  a + b

}
