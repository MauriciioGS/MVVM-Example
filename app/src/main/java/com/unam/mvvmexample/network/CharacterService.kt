package com.unam.mvvmexample.network

import com.unam.mvvmexample.model.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class CharacterService {
    private val retrofit = RetrofitBuilder.getRetrofit()

    suspend fun getCharacters() : List<CharacterModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ApiClient::class.java).getAllCharacters()
            response.body() ?: emptyList()
        }
    }
}