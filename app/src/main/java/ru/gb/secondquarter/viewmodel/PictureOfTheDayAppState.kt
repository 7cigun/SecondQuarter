package ru.gb.secondquarter.viewmodel

import ru.gb.secondquarter.repository.PictureOfTheDayResponseData

sealed class PictureOfTheDayAppState {
    data class Success(val pictureOfTheDayResponseData: PictureOfTheDayResponseData):PictureOfTheDayAppState()
    data class Error(val error:Throwable):PictureOfTheDayAppState()
    data class Loading(val progress:Int?):PictureOfTheDayAppState()
}
