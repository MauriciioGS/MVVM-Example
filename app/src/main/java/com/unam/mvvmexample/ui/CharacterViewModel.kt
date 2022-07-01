package com.unam.mvvmexample.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.unam.mvvmexample.data.model.CharacterModel
import com.unam.mvvmexample.data.model.CharacterProvider

class CharacterViewModel : ViewModel() {

    val characterModel = MutableLiveData<CharacterModel>()

    fun anyCharacter() {
        val character = CharacterProvider.characters.random()
        characterModel.postValue(character)
    }
}