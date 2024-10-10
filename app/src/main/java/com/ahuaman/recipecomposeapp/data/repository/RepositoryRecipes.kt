package com.ahuaman.recipecomposeapp.data.repository

import com.ahuaman.recipecomposeapp.domain.RecipeDomain

interface RepositoryRecipes {
    fun getRecipes() : List<RecipeDomain>
    fun searchByName(name: String) : List<RecipeDomain>
}