package com.ahuaman.recipecomposeapp.domain.home

sealed class HomeViewIntent {
    data class SearchRecipesIntent(val query: String) : HomeViewIntent()
    data class OnQueryChangedIntent(val query: String) : HomeViewIntent()
}
