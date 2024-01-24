package com.vimal.examen_tp_kotlin.presenter

import com.vimal.examen_tp_kotlin.view.ItemView

interface ItemPresenter {
    fun attachView(view: ItemView)
    fun detachView()
    fun loadCategories()
}