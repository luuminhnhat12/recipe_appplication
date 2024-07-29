package com.example.recipe_application.model

class ModelPrice(
    private var price_id:Int,
    private var price_value :String
) {
    init {
        this.price_id = price_id
        this.price_value = price_value
    }
    fun get_price_id():Int{
        return this.price_id
    }
    fun get_price_value():String{
        return this.price_value
    }
}