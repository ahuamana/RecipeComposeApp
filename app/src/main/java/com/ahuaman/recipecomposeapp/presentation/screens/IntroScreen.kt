package com.ahuaman.recipecomposeapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahuaman.recipecomposeapp.R
import com.ahuaman.recipecomposeapp.ui.theme.PrimaryColorRecipes
import com.ahuaman.recipecomposeapp.ui.theme.RecipeComposeAppTheme

@Composable
fun IntroScreen(
    modifier: Modifier = Modifier,
    onClickNavigateHome: () -> Unit
) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.intro_splash),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black.copy(alpha = 0.7f)
        ){}


        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_start),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "60k+",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold))
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(text = "Premium recipes",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.googlesans_regular, FontWeight.Normal))
            )

        }

        //Content in bottom of the screen
        Column(
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxSize(),
        ) {
            val annotatedString = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.White,
                    fontSize = 50.sp,
                    fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                    letterSpacing = 10.sp,
                )) {
                    append("Let's")
                }
            }

            val secondAnnotatedString = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.White,
                    fontSize = 50.sp,
                    fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                    letterSpacing = 10.sp,

                )) {
                    append("Cooking")
                }
            }


            //Image
            Text(text = annotatedString,)
            Text(text = secondAnnotatedString)


            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Find the best recipes",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.googlesans_regular, FontWeight.Normal))
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColorRecipes),
                shape = RoundedCornerShape(10),
                onClick = { onClickNavigateHome() }) {
                Row(
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Start Cooking",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.googlesans_bold, FontWeight.Bold)),
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(painter = painterResource(id = R.drawable.ic_right_arrow), contentDescription = null, tint = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(60.dp))

        }

    }
}

@Preview
@Composable
fun IntroScreenPrev() {
    RecipeComposeAppTheme {
        IntroScreen(
            onClickNavigateHome = {}
        )
    }
}