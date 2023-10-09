package com.example.randomimageapp.mvvm.repository

import com.example.randomimageapp.mvvm.model.Image
import io.reactivex.Single

interface ImageRepository {

    fun getRandomImage() : Single<Image>
}