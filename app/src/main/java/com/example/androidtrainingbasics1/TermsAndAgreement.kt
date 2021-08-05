package com.example.androidtrainingbasics1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class TermsAndAgreement : AppCompatActivity() {
    private lateinit var etEmail : TextView
    private lateinit var etTermsAndAgreement: TextView
    private lateinit var btnSignup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_agreement)

        etEmail = findViewById(R.id.tv_email)
        etTermsAndAgreement =  findViewById(R.id.tv_terms_and_agreement)
        btnSignup = findViewById(R.id.btn_sign_up)

        //From Main Activity
        var emailFromActivityA = intent.extras?.get(MainActivity.EXT_EMAIL)
        if (emailFromActivityA != null){
            emailFromActivityA = emailFromActivityA as String

            val text = getString(R.string.your_email_email).replace("<email>",emailFromActivityA)
            etEmail.setText(text)
        }
        else{
            etEmail.visibility = View.GONE
        }

        etTermsAndAgreement.setText(getString(R.string.terms_and_agreement))
        btnSignup.setOnClickListener{
            setResult(Activity.RESULT_OK)
            finish()
        }



    }
}