package com.example.randomimageapp.mvvm.repository

import com.example.randomimageapp.RetrofitManager
import com.example.randomimageapp.mvvm.model.Image
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ImageRepositoryImpl : ImageRepository {
    override fun getRandomImage() = RetrofitManager.imageService.getRandomImageRx()
        .subscribeOn(Schedulers.io()) //io 쓰레드에서 실행
        .observeOn(AndroidSchedulers.mainThread()) // 결과를 메인쓰레드에서 실행
        .flatMap{ item ->
            Single.just(Image(item.urls.regular, item.color))

    }
}