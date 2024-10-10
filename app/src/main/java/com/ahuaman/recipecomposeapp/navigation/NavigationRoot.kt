package com.ahuaman.recipecomposeapp.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import com.ahuaman.recipecomposeapp.domain.home.HomeViewIntent
import com.ahuaman.recipecomposeapp.fromJson
import com.ahuaman.recipecomposeapp.presentation.screens.HomeScreen
import com.ahuaman.recipecomposeapp.presentation.screens.IntroScreen
import com.ahuaman.recipecomposeapp.presentation.vm.HomeViewModel
import com.ahuaman.recipecomposeapp.toJson
import kotlinx.serialization.Serializable

@Composable
fun NavigationRoot(controller: NavHostController = rememberNavController()) {
    NavHost(
        navController = controller,
        startDestination = RootScreens.IntroScreen
    ) {
        composable<RootScreens.IntroScreen> {
            IntroScreen(
                onClickNavigateHome = {
                    controller.navigate(RootScreens.DashboardScreen)
                }
            )
        }
        composable<RootScreens.DashboardScreen> {
            val keyboardController = LocalSoftwareKeyboardController.current

            val viewModel = hiltViewModel<HomeViewModel>()
            val states by viewModel.intent.collectAsStateWithLifecycle()

            LaunchedEffect(key1 = true) {
                viewModel.getRecipes()
            }

            HomeScreen(
                onQueryChange =  { query ->
                    viewModel.processIntent(HomeViewIntent.OnQueryChangedIntent(query))
                },
                onClickRecipe = { recipe ->
                    controller.navigate(RootScreens.RecipeDetailScreen(recipe.toJson()))
                },
                onSearch = { query ->
                    viewModel.processIntent(HomeViewIntent.SearchRecipesIntent(query))
                    //close keyboard
                    keyboardController?.hide()
                },
                searchQuery = states.query,
                recipes = states.recipes
            )
        }

        composable<RootScreens.RecipeDetailScreen> {
            val recipeId = it.arguments?.getString("recipeId")
            val recipe =  recipeId?.fromJson<RecipeDomain>()
            Text(text = recipe?.title ?: "No title")
        }
    }
}


@Serializable
sealed class RootScreens {
    @Serializable
    data object IntroScreen: RootScreens()
    @Serializable
    data object DashboardScreen: RootScreens()
    @Serializable
    data class RecipeDetailScreen(val recipeId: String): RootScreens()
}