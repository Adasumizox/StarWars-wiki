package com.adasumizox.android.starwarswiki.network.person

import com.adasumizox.android.starwarswiki.domain.Person
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonService {
    @GET("/people/{personId}")
    suspend fun getPerson(@Path("personId") personId: Int): Person
    @GET("/people")
    suspend fun getPeople(): List<Person>
}