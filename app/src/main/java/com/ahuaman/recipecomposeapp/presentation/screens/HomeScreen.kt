package com.ahuaman.recipecomposeapp.presentation.screens

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahuaman.recipecomposeapp.R
import com.ahuaman.recipecomposeapp.composables.ItemRecipe
import com.ahuaman.recipecomposeapp.data.mock.SampleDataSource
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import com.ahuaman.recipecomposeapp.ui.theme.RecipeComposeAppTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalSharedTransitionApi::class)
@Composable
fun HomeScreen(
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    onClickRecipe: (RecipeDomain) -> Unit,
    searchQuery: String,
    recipes: List<RecipeDomain>,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedVisibilityScope
) {
    when {
        else -> {
            Column(modifier = Modifier
                .fillMaxSize()) {
                //Header of the screen
                Box(modifier = Modifier
                    .fillMaxWidth()
                ) {
                    Card(
                        shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp),
                    ) {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .blur(9.dp)
                                .clip(RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp))
                                .height(250.dp),
                            painter = painterResource(id = R.drawable.image_background_home),
                            contentDescription = null,
                            contentScale = androidx.compose.ui.layout.ContentScale.Crop
                        )
                    }

                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 80.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(R.string.what_do_you_want),
                            color = Color.White,
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )

                        Text(
                            text = stringResource(R.string.to_cook_today),
                            color = androidx.compose.ui.graphics.Color.White,
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }

                    SearchBar(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.TopCenter).semantics { traversalIndex = 0f }
                            .padding(horizontal = 16.dp)
                            .offset(y = 200.dp)
                            .clip(RoundedCornerShape(10.dp)),

                        inputField = {
                            SearchBarDefaults.InputField(
                                query = searchQuery,
                                onQueryChange = {
                                    onQueryChange(it)
                                },
                                onSearch = {
                                    onSearch(searchQuery)
                                },
                                expanded = false,
                                onExpandedChange = {
                                  //TODO: Implement search suggestions
                                },
                                placeholder = { Text(stringResource(R.string.search)) },
                                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                            )
                        },
                        expanded = false,
                        onExpandedChange = {
                            //TODO: Implement search suggestions
                        }
                    ) {

                    }

                }

                //Body of the screen
                Column(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {

                    Spacer(modifier = Modifier.height(40.dp))

                    //Title // popular recipes
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = stringResource(R.string.popular_recipes),
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )

                    when {

                        else -> {
                            //show list of recipes
                            LazyVerticalGrid(
                                userScrollEnabled = true,
                                columns = GridCells.Fixed(2),
                                contentPadding = PaddingValues(16.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                                verticalArrangement = Arrangement.spacedBy(16.dp),
                            ){
                                items(recipes) { recipe ->
                                    ItemRecipe(
                                        model = recipe,
                                        onClick = { onClickRecipe(recipe) },
                                        sharedTransitionScope = sharedTransitionScope,
                                        animatedContentScope = animatedContentScope
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }

}


@OptIn(ExperimentalSharedTransitionApi::class)
@Preview
@Composable
fun HomeScreenPrev() {
    SharedTransitionLayout {
        NavHost(
            navController = rememberNavController(),
            startDestination = "home"
        ) {
            composable("home") {
                HomeScreen(
                    onQueryChange = {},
                    onClickRecipe = {},
                    onSearch = {},
                    searchQuery = "Hola",
                    recipes = SampleDataSource.listRecipes,
                    sharedTransitionScope = this@SharedTransitionLayout,
                    animatedContentScope = this@composable
                )
            }
        }
    }
}