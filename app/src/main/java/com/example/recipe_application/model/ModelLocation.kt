package com.example.recipe_application.model

class ModelLocation(
    private var location_id:Int,
    private var location_name :String
) {
    init {
        this.location_id = location_id
        this.location_name = location_name
    }
    fun get_location_id():Int{
        return this.location_id
    }
    fun get_location_name():String{
        return this.location_name
    }
}