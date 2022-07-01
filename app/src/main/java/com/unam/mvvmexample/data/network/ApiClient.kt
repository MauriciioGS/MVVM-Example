package com.unam.mvvmexample.data.network

import com.unam.mvvmexample.data.model.CharacterModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET
    suspend fun getAllCharacters() : Response<List<CharacterModel>>
}