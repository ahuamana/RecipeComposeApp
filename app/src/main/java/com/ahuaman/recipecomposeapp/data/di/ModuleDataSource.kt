package com.ahuaman.recipecomposeapp.data.di

import com.ahuaman.recipecomposeapp.data.mock.LocalDataSource
import com.ahuaman.recipecomposeapp.data.mock.LocalDataSourceImpl
import com.ahuaman.recipecomposeapp.data.remote.RemoteDataSource
import com.ahuaman.recipecomposeapp.data.remote.RemoteDataSourceImpl
import com.ahuaman.recipecomposeapp.data.repository.RepositoryRecipes
import com.ahuaman.recipecomposeapp.data.repository.RepositoryRecipesImpl
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.Serializable
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleDataSource {

    @Singleton
    @Binds
    abstract fun provideLocalDataSource(localDataSource: LocalDataSourceImpl): LocalDataSource

    @Singleton
    @Binds
    abstract fun provideRemoteDataSource(remoteDataSource: RemoteDataSourceImpl): RemoteDataSource

    @Singleton
    @Binds
    abstract fun provideRepositoryRecipes(repositoryRecipes: RepositoryRecipesImpl): RepositoryRecipes

}