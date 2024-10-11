package com.ahuaman.recipecomposeapp.presentation.screens

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.parseAsHtml
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.ahuaman.recipecomposeapp.R
import com.ahuaman.recipecomposeapp.composables.HtmlText
import com.ahuaman.recipecomposeapp.data.mock.SampleDataSource
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
import com.ahuaman.recipecomposeapp.formatSummary

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    model: RecipeDomain,
    sharedTransitionScope:SharedTransitionScope,
    animatedContentScope: AnimatedVisibilityScope
) {
    with(sharedTransitionScope){
        Column(modifier = modifier) {
            AsyncImage(
                modifier = Modifier
                    .sharedElement(
                        state = sharedTransitionScope.rememberSharedContentState(key = "image-${model.image}"),
                        animatedVisibilityScope = animatedContentScope)
                    .fillMaxWidth()
                    .height(300.dp),
                model = model.image, contentDescription = model.summary,
                contentScale = androidx.compose.ui.layout.ContentScale.Crop
            )

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .offset(y = (-60).dp)
                    .fillMaxWidth(),
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = model.title,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                        modifier = Modifier.padding(16.dp),
                        color = Color.Black
                    )
                    //Details who made the recipe
                    Row(modifier = Modifier.padding(horizontal = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_author_katie),
                            modifier = Modifier.size(24.dp).clip(shape = CircleShape).border(1.dp, Color.Black, shape = CircleShape),
                            contentDescription = "Author",
                        )
                        Spacer(modifier = Modifier.size(8.dp))

                        Text(
                            text = model.author?:"Unknown",
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.size(8.dp))
                        //icon check
                        Icon(
                            painter = painterResource(id = R.drawable.ic_check_rectangular_form),
                            tint = Color(0xFF4CAF50),
                            modifier = Modifier
                                .height(20.dp),
                            contentDescription = "Check",
                        )

                        Spacer(modifier = Modifier.size(8.dp))

                        //circular view with background color
                        Card(
                            modifier = Modifier.size(5.dp).clip(CircleShape),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF9EA29E)
                            )
                        ){}
                        Spacer(modifier = Modifier.size(8.dp))

                        //icon star
                        Icon(
                            painter = painterResource(id = R.drawable.ic_start),
                            tint = Color(0xFFFFC107),
                            contentDescription = "Rating",
                        )
                        //Text rating
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(
                            text = model.healthScore.toString(),
                            color = Color.Black
                        )
                    }

                    //Ingredients
                    Text(
                        text = "Ingredients",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                        modifier = Modifier.padding(horizontal = 16.dp),
                        color = Color.Black
                    )

                    //preparation
                    HtmlText(html = model.summary, modifier = Modifier.padding(16.dp))
                }
            }

        }
    }

}


@OptIn(ExperimentalSharedTransitionApi::class)
@Preview
@Composable
private fun DetailScreenPreview() {
    SharedTransitionLayout {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = "details"
        ) {
            composable("home") {
                Text(text = "Home", color = Color.Black)
            }

            composable("details") {
                DetailScreen(
                    modifier = Modifier.fillMaxSize(),
                    model = SampleDataSource.listRecipes.first(),
                    sharedTransitionScope = this@SharedTransitionLayout,
                    animatedContentScope = this@composable
                )
            }
        }

    }

}