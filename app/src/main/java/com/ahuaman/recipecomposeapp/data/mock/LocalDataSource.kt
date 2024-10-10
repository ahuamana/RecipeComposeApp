package com.ahuaman.recipecomposeapp.data.mock

import com.ahuaman.recipecomposeapp.domain.RecipeDomain

interface LocalDataSource {
    fun getRecipes() : List<RecipeDomain>
}