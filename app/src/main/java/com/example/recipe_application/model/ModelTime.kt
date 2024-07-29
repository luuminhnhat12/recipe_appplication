package com.example.recipe_application.model

class ModelTime(
    private var time_id:Int,
    private var time_value :String
) {
    init {
        this.time_id = time_id
        this.time_value = time_value
    }
    fun get_time_id():Int{
        return this.time_id
    }
    fun get_time_value():String{
        return this.time_value
    }
}