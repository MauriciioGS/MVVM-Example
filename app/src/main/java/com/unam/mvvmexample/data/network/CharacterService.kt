package com.unam.mvvmexample.data.network

import com.unam.mvvmexample.data.model.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharacterService {
    private val retrofit = RetrofitBuilder.getRetrofit()

    suspend fun getCharacters() : List<CharacterModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ApiClient::class.java).getAllCharacters()
            response.body() ?: emptyList()
        }
    }
}