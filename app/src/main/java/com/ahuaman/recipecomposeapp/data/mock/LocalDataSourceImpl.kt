package com.ahuaman.recipecomposeapp.data.mock

import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor() : LocalDataSource {
    override fun getRecipes(): List<RecipeDomain> {
        return SampleDataSource.listRecipes
    }

    override fun searchByName(name: String): List<RecipeDomain> {
        return SampleDataSource.listRecipes.filter {
            it.title.contains(name, ignoreCase = true)
        }
    }
}