package com.example.recipe_application.view

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.recipe_application.databinding.ActivityScreenLoginBinding
import com.example.recipe_application.viewmodel.UserViewModel

class ScreenLogin : AppCompatActivity(), View.OnClickListener {
    lateinit var loginbinding : ActivityScreenLoginBinding
    lateinit var userViewModel : UserViewModel
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var sharedPreferencesEditor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginbinding = ActivityScreenLoginBinding.inflate(layoutInflater)
        setContentView(loginbinding.root)
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        loginbinding.buttonLogin.setOnClickListener(this)
        sharedPreferences = getSharedPreferences("Email_Password", Context.MODE_PRIVATE)
    }
    override fun onClick(v: View) {
        val textEmail = loginbinding.editTextTextEmailAddress.text.toString()
        val textPassword = loginbinding.editTextTextPassword.text.toString()
        val result = userViewModel.userViewModelCheck(textEmail, textPassword)
        if (result) {
            sharedPreferencesEditor = sharedPreferences.edit()
            sharedPreferencesEditor.putString("email",  textEmail)
            sharedPreferencesEditor.putString("password",  textPassword)
            sharedPreferencesEditor.apply()
            Toast.makeText(v.context, "Login Successful!", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(v.context, "Login Fail", Toast.LENGTH_LONG).show()
        }
    }

}