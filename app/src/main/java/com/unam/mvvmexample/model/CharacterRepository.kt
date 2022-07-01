package com.unam.mvvmexample.model

import com.unam.mvvmexample.network.CharacterService

class CharacterRepository {
    private val api = CharacterService()

    suspend fun getAllCharacters() : List<CharacterModel>{
        val response = api.getCharacters()
        CharacterProvider.charcters
    }
}