package com.example.recipe_application.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recipe_application.model.ModelUser


class UserViewModel :ViewModel() {
    private val _stateUser = MutableLiveData<ModelUser>()
    val stateUser: LiveData<ModelUser> get() = _stateUser

    fun updateState(newUser: ModelUser) {
        _stateUser.value = newUser
    }
    fun userViewModelCheck(gmail:String,pass:String):Boolean{

        return ModelUser(gmail,pass).getGmail().equals("nguoidep433@gmail.com") &&
                ModelUser(gmail,pass).getPassword().equals("1234")
    }

}