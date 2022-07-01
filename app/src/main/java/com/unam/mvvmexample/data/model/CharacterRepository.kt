package com.unam.mvvmexample.data.model

import com.unam.mvvmexample.data.network.CharacterService

class CharacterRepository {
    private val api = CharacterService()

    suspend fun getAllCharacters() : List<CharacterModel>{
        val response = api.getCharacters()
        CharacterProvider.characters = response
        return response
    }
}