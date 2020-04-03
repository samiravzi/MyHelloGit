package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        showMessage("How you doing?")

=======
        showMessage("Hiiiiii Maryam!")
>>>>>>> 2e73cb469f79160bf10b53bf35925950e435e63e
    }

    private fun showMessage(text: String) {
        System.out.println("msg: "+text)
    }

    private fun sum(a: Int, b: Int) : Int =  a + b

}
