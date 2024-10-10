package com.ahuaman.recipecomposeapp.presentation.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahuaman.recipecomposeapp.data.repository.RepositoryRecipes
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import com.ahuaman.recipecomposeapp.domain.home.HomeStates
import com.ahuaman.recipecomposeapp.domain.home.HomeViewIntent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repositoryRecipes: RepositoryRecipes
) : ViewModel() {

    private val _intent = MutableStateFlow(HomeStates.default())
    val intent = _intent.asStateFlow()

    fun processIntent(intent: HomeViewIntent) = viewModelScope.launch {
        when(intent) {
                is HomeViewIntent.SearchRecipesIntent -> {
                    searchByName(intent.query)
                }

                is HomeViewIntent.OnQueryChangedIntent -> {
                    onQueryChangeAndSearch(intent.query)
                }
            }
        }

    private fun onQueryChangeAndSearch(query: String) = viewModelScope.launch {
        val currentState = _intent.value
        _intent.value = currentState.copy(query = query)
        searchByName(query)
    }

    private fun searchByName(name: String) = viewModelScope.launch {
        val currentState = _intent.value
        _intent.value = currentState.copy(isLoading = true)

        val recipes = repositoryRecipes.searchByName(name)
        _intent.value = currentState.copy(isLoading = false, recipes = recipes)
    }

    fun getRecipes() = viewModelScope.launch {
        val currentState = _intent.value
        _intent.value = currentState.copy(isLoading = true)

        val recipes = repositoryRecipes.getRecipes()
        _intent.value = currentState.copy(isLoading = false, recipes = recipes)
    }

}