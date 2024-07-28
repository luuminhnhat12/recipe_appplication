package com.example.recipe_application.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipe_application.R
import com.google.firebase.auth.FirebaseAuth

class BaseActivity : AppCompatActivity() {
    lateinit var myAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        myAuth = FirebaseAuth.getInstance()
    }
}