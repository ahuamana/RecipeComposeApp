package com.ahuaman.recipecomposeapp.data.mock

import com.ahuaman.recipecomposeapp.domain.IngredientDomain
import com.ahuaman.recipecomposeapp.domain.RecipeDomain
object SampleDataSource {

    val listRecipes = listOf(
        RecipeDomain(
            id = "1",
            title = "Lamb Pilaf",
            image = "https://www.themealdb.com/images/media/meals/kos9av1699014767.jpg",
            summary = "<strong>Lamb Pilaf:</strong> A delightful blend of tender lamb and fragrant rice, enriched with spices for a flavorful experience.",
            author = "Katie Nolan",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Lamb",
                    image = "https://www.themealdb.com/images/ingredients/Lamb.png"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Rice",
                    image = "https://www.themealdb.com/images/ingredients/Rice.png"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Spices",
                    image = "https://www.themealdb.com/images/ingredients/Parsley.png"
                )
            ),
            instructions = "Instructions 1",
            healthScore = 4.5f
        ),
        RecipeDomain(
            id = "2",
            title = "Strawberries Romanoff",
            author = "Katie Nolan",
            image = "https://www.themealdb.com/images/media/meals/oe8rg51699014028.jpg",
            summary = "<strong>Strawberries Romanoff:</strong> A luscious dessert featuring ripe strawberries drenched in a creamy, sweet sauce. Perfect for a romantic evening.",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Strawberries",
                    image = "https://www.themealdb.com/images/ingredients/Strawberries.png"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Cream",
                    image = "https://www.themealdb.com/images/ingredients/Sour%20Cream.png"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Sugar",
                    image = "https://www.themealdb.com/images/ingredients/Sugar.png"
                )
            ),
            instructions = "Instructions 2",
            healthScore = 4.5f
        ),
        RecipeDomain(
            id = "3",
            title = "Fish Soup",
            image = "https://www.themealdb.com/images/media/meals/7n8su21699013057.jpg",
            summary = "<strong>Fish Soup:</strong> A hearty and warming soup made with fresh fish, vegetables, and aromatic herbs.",
            author = "Katie Nolan",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Fish",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Vegetables",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Herbs",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                )
            ),
            instructions = "Instructions 3",
            healthScore = 3.5f
        ),
        RecipeDomain(
            id = "4",
            title = "Cabbage Soup",
            author = "Katie Nolan",
            image = "https://www.themealdb.com/images/media/meals/60oc3k1699009846.jpg",
            summary = "<strong>Cabbage Soup:</strong> A nutritious and filling soup packed with vegetables, perfect for a light meal.",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Olive Oil",
                    image = "https://www.themealdb.com/images/ingredients/Olive%20Oil.png"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Carrots",
                    image = "https://www.themealdb.com/images/ingredients/Carrots.png"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Onions",
                    image = "https://www.themealdb.com/images/ingredients/Onion.png"
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),
        RecipeDomain(
            id = "5",
            title = "Beetroot Soup",
            author = "Katie Nolan",
            image = "https://www.themealdb.com/images/media/meals/zadvgb1699012544.jpg",
            summary = "<strong>Beetroot Soup:</strong> A vibrant and earthy soup that brings the sweet flavor of beetroot to the forefront.",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Beetroot",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Vegetable Stock",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Garlic",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),
        RecipeDomain(
            id = "6",
            title = "Fettucine Alfredo",
            author = "Katie Nolan",
            image = "https://www.themealdb.com/images/media/meals/uquqtu1511178042.jpg",
            summary = "<strong>Fettucine Alfredo:</strong> A classic Italian pasta dish, rich and creamy, that makes for a comforting dinner option.",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Fettucine",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Butter",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Parmesan Cheese",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        ),
        RecipeDomain(
            id = "7",
            title = "Beef Stroganoff",
            author = "Katie Nolan",
            image = "https://www.themealdb.com/images/media/meals/svprys1511176755.jpg",
            summary = "<strong>Beef Stroganoff:</strong> A savory dish featuring tender strips of beef in a creamy mushroom sauce, served over noodles.",
            extendedIngredients = listOf(
                IngredientDomain(
                    id = "1",
                    name = "Beef",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "2",
                    name = "Mushrooms",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                ),
                IngredientDomain(
                    id = "3",
                    name = "Noodles",
                    image = "https://www.themealdb.com/images/media/meals/llcbn01574260722.jpg"
                )
            ),
            instructions = "Instructions 4",
            healthScore = 7f
        )
    )
}