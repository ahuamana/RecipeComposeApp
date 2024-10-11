package com.ahuaman.recipecomposeapp

import android.text.Html
import android.text.Spanned
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

//toJson

val json = Json {
    prettyPrint = true
    isLenient = true
    ignoreUnknownKeys = true
    coerceInputValues = true
}

inline fun <reified T> T.toJson(): String {
    return json.encodeToString(this)
}


//fromJson

inline fun <reified T> String.fromJson(): T {
    return json.decodeFromString(this)
}

//fromJson from Any to specific type

inline fun <reified T> Any.fromJson(): T {
    return json.decodeFromString(this.toString())
}

//toHtml

fun formatSummary(summary: String): Spanned {
    return Html.fromHtml(summary, Html.FROM_HTML_MODE_COMPACT) // For older Android versions, use Html.fromHtml(summary)
}

