package com.vimal.examen_tp_kotlin.view

import com.vimal.examen_tp_kotlin.model.Category

interface ItemView {
    fun showCategories(items: List<Category>)
    fun showError(message: String)
}