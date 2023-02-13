package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show()
        toast("Hello World")
    }

    private fun toast(message: String){
        return Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}