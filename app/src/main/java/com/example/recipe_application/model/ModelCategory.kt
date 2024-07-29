package com.example.recipe_application.model

class ModelCategory(
    private var category_id:Int,
    private var category_name: String,
    private var category_image_path: String
) {
    init {
        this.category_id = category_id
        this.category_name = category_name
         this.category_image_path= category_image_path
    }
    fun get_Cate_ID(): Int {
        return this.category_id
    }
    fun get_Cate_Imagepath(): String {
        return this.category_image_path
    }
    fun get_Cate_name(): String {
        return this.category_name
    }
}