package com.vimal.examen_tp_kotlin.model

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
    var isFavourite: Boolean = false
)

data class CategoryResponse(
    val categories: List<Category>
)