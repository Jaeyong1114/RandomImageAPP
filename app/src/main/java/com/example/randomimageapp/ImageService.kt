package com.example.randomimageapp

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImageService {
    @Headers("Authorization: Client-ID mz36pHR_22jtcb_39pa8m_boR3qFZxLSsaVqg-x-ioI")
    @GET("photos/random")
    fun getRandomImage() : Call<ImageResponse> //레트로핏 자체로 받을때는 Call 로받았음 

    @Headers("Authorization: Client-ID mz36pHR_22jtcb_39pa8m_boR3qFZxLSsaVqg-x-ioI")
    @GET("photos/random")
    fun getRandomImageRx() : Single<ImageResponse> //Rx 로 받을때는 Single로 받아옴
}