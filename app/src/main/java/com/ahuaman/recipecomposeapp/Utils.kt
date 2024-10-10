package com.ahuaman.recipecomposeapp

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


