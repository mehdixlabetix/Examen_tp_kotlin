package com.vimal.examen_tp_kotlin.api

import com.vimal.examen_tp_kotlin.model.CategoryResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getCategories(): Call<CategoryResponse>
}