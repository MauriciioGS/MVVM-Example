package com.unam.mvvmexample.domain

import com.unam.mvvmexample.data.model.CharacterModel
import com.unam.mvvmexample.data.model.CharacterRepository

class GetCharactersUseCase {
    private val repository = CharacterRepository()

    suspend operator fun invoke() : List<CharacterModel>? = repository.getAllCharacters()
}