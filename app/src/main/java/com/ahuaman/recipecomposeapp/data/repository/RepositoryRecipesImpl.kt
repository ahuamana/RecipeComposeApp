package com.ahuaman.recipecomposeapp.data.repository

import com.ahuaman.recipecomposeapp.data.mock.LocalDataSource
import com.ahuaman.recipecomposeapp.data.remote.RemoteDataSource
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import javax.inject.Inject

class RepositoryRecipesImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : RepositoryRecipes {

    override fun getRecipes(): List<RecipeDomain> {
        return localDataSource.getRecipes()
    }
}