package com.example.recipe_application.model

class ModelFood(
    private var food_isBestFood: Boolean,
    private var food_category_id:Int,
    private var food_description: String,
    private var food_id:Int,
    private var food_image_path: String,
    private var food_location_id: Int,
    private var food_price:Double,
    private var food_price_id: Int,
    private var food_star: Double,
    private var food_time_Id: Int,
    private var food_time_value: Int,
    private var food_name: String,

) {
    init {
        this.food_id = food_id
        this.food_name = food_name
        this.food_image_path= food_image_path
        this.food_description = food_description
        this.food_price_id = food_price_id
        this.food_location_id= food_location_id
        this.food_star = food_star
        this.food_time_Id = food_time_Id
        this.food_isBestFood = food_isBestFood
        this.food_price = food_price
        this.food_category_id = food_category_id
        this.food_time_value = food_time_value

    }
    fun get_Food_isBestFood(): Boolean {
        return this.food_isBestFood
    }
    fun get_Food_categoryID(): Int{
        return this.food_category_id
    }
    fun get_Food_name(): String {
        return this.food_name
    }
    fun get_Food_description(): String {
        return this.food_description
    }
    fun get_Food_price(): Double {
        return this.food_price
    }
    fun get_Food_image_path(): String {
        return this.food_image_path
    }
    fun get_Price_ID(): Int {
        return this.food_id
    }
    fun get_Food_Star(): Double {
        return this.food_star
    }
    fun get_Food_location_id(): Int {
        return this.food_location_id
    }
    fun get_Food_Price_ID(): Int {
        return this.food_price_id
    }
    fun get_Food_TimeID():Int{
        return this.food_time_Id
    }
    fun get_Food_TimeValue(): Int {
        return this.food_time_value
    }
}

