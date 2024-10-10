package com.ahuaman.recipecomposeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahuaman.recipecomposeapp.screens.HomeScreen
import com.ahuaman.recipecomposeapp.screens.IntroScreen
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
            //TODO: Integrate viewmodel
            HomeScreen(
                onQueryChange =  { query ->
                    //TODO: Implement search
                },
                onClickRecipe = { recipeId ->
                    //TODO: Navigate to recipe details
                }
            )
        }
    }
}


@Serializable
sealed class RootScreens {
    @Serializable
    data object IntroScreen: RootScreens()
    @Serializable
    data object DashboardScreen: RootScreens()
}