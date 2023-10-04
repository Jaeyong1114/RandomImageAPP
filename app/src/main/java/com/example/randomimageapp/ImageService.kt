package com.example.randomimageapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImageService {
    @Headers("Authorization: Client-ID mz36pHR_22jtcb_39pa8m_boR3qFZxLSsaVqg-x-ioI")
    @GET("photos/random")
    fun getRandomImage() : Call<ImageResponse>
}