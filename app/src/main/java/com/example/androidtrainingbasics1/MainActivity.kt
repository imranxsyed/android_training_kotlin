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
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {

    companion object{
        const val EXT_EMAIL = "EXT_EMAIL"
        const val TERMS_AND_AGREEMENT_REQUEST = 1234
    }

    private lateinit var etEmail : EditText
    private lateinit var btnSumbit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmail = findViewById(R.id.ed_email)
        btnSumbit = findViewById(R.id.btn_submit)

        btnSumbit.setOnClickListener{
          val email =  etEmail.text.toString()
            if (email != ""){
                val intent = Intent()
                //destination
                intent.setClass(this, TermsAndAgreement::class.java)
                //data
                intent.putExtra(EXT_EMAIL,email)
                startActivityForResult(intent, TERMS_AND_AGREEMENT_REQUEST)
            }
            else{
                Toast.makeText(this, "Please provide your email address", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==  TERMS_AND_AGREEMENT_REQUEST && resultCode == Activity.RESULT_OK){
            Toast.makeText(this, "Your Are signed up", Toast.LENGTH_SHORT).show()
            etEmail.visibility = View.GONE
            btnSumbit.visibility = View.GONE

        }
    }
}