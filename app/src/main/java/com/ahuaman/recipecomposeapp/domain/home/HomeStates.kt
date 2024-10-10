package com.ahuaman.recipecomposeapp.domain.home

import com.ahuaman.recipecomposeapp.domain.RecipeDomain

data class HomeStates(
    val isLoading: Boolean = false,
    val recipes: List<RecipeDomain> = emptyList(),
    val query: String = ""
) {
    companion object {
        fun default() = HomeStates()
    }
}

