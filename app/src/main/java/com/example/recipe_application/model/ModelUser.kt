package com.example.recipe_application.model

class ModelUser(private var gmail: String, private var password: String) {

    // Hàm khởi tạo
    init {
        this.gmail = gmail
        this.password = password
    }

    // Getter cho gmail
    fun getGmail(): String {
        return this.gmail
    }

    // Getter cho password
    fun getPassword(): String {
        return this.password
    }

}