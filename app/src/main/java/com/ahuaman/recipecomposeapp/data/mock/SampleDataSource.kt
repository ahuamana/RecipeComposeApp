package com.ahuaman.recipecomposeapp.data.mock

import com.ahuaman.recipecomposeapp.domain.IngredientDomain
import com.ahuaman.recipecomposeapp.domain.RecipeDomain

object SampleDataSource {

    val listRecipes = listOf(
        RecipeDomain(
            id = "1",
            title = " Lamb Pilaf",
            image = "https://www.themealdb.com/images/media/meals/kos9av1699014767.jpg",
            summary = "Description 1",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 1",
            healthScore = 4.5f,
        ),
        RecipeDomain(
            id = "2",
            title = "Strawberries Romanoff",
            image = "https://www.themealdb.com/images/media/meals/oe8rg51699014028.jpg",
            summary = "Description 2",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 2",
            healthScore = 4.5f
        ),

        RecipeDomain(
            id = "3",
            title = "Fish Soup",
            image = "https://www.themealdb.com/images/media/meals/7n8su21699013057.jpg",
            summary = "Description 3",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 3",
            healthScore = 3.5f
        ),

        RecipeDomain(
            id = "4",
            title = "Cabbage Soup",
            image = "https://www.themealdb.com/images/media/meals/60oc3k1699009846.jpg",
            summary = "Description 4",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),

        RecipeDomain(
            id = "5",
            title = "Beetroot Soup",
            image = "https://www.themealdb.com/images/media/meals/zadvgb1699012544.jpg",
            summary = "Description 4",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),
        RecipeDomain(
            id = "6",
            title = "Fettucine alfredo",
            image = "https://www.themealdb.com/images/media/meals/uquqtu1511178042.jpg",
            summary = "Description 4",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),

        RecipeDomain(
            id = "7",
            title = "Beef stroganoff",
            image = "https://www.themealdb.com/images/media/meals/svprys1511176755.jpg",
            summary = "Description 4",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Ingredient 1",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg",
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),

    )
}