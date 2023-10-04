package com.example.randomimageapp.mvc

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.randomimageapp.databinding.ActivityMvcBinding
import com.example.randomimageapp.mvc.provider.ImageProvider

class MvcActivity : AppCompatActivity(), ImageProvider.Callback {

    private lateinit var binding: ActivityMvcBinding

    private val model = ImageCountModel()
    private val imageProvider = ImageProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvcBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.view = this


        }
        binding.loadButton.setOnClickListener {
            loadImage()
        }
    }


    fun loadImage() {
        imageProvider.getRandomImage()

    }

    override fun loadImage(url: String, color: String) {
        model.increase()
        with(binding){
            imageView.run{
                setBackgroundColor(Color.parseColor(color))
                load(url)

            }
            imageCountTextView.text = "불러온 이미지수 : ${model.count}"
        }

    }
}