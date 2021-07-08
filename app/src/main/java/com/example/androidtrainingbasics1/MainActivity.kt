package com.example.androidtrainingbasics1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    companion object{
        private const val TAG = "MainActivity"
    }
    private lateinit var submitButton  : Button
    private lateinit var name : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_main)

        submitButton = findViewById(R.id.btn_submit)
        name = findViewById(R.id.et_name)


//        submitButton.setOnClickListener{
//
//        }

        submitButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Working", Toast.LENGTH_SHORT).show()
                val value = name.text.toString()
                if (value == ""){
                    Toast.makeText(this@MainActivity, "Please provide your name", Toast.LENGTH_SHORT).show()

                }
                else{
                    Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_SHORT).show()
                }
            }

        })

    }

    override fun onStart() {
        Log.d(TAG, "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: ")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }


}