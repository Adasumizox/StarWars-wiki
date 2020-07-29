package com.adasumizox.android.starwarswiki.domain

data class Person (
    val name: String = "",
    val height: Int = 0,
    val mass: Int = 0,
    // I guess Enum should be good
    val hair_color: String = "",
    val skin_color: String = "",
    val eye_color: String = "",
    val birth_year: String = "",
    val gender: String = "",
    val homeworld: String = "",
    val films: List<String> = emptyList(),
    val species: List<String> = emptyList(),
    val vehicles: List<String> = emptyList(),
    val starships: List<String> = emptyList(),
    val created: String = "",
    val edited: String = "",
    val url: String = ""
)