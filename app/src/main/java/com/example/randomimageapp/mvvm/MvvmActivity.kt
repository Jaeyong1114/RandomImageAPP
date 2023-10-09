package com.example.randomimageapp.mvvm

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.randomimageapp.databinding.ActivityMvvmBinding
import com.example.randomimageapp.mvvm.repository.ImageRepositoryImpl

class MvvmActivity : AppCompatActivity() {

    private val viewModel : MvvmViewModel by viewModels{
        MvvmViewModel.MvvmViewModelFactory(ImageRepositoryImpl())
    }
    private lateinit var binding: ActivityMvvmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvvmBinding.inflate(layoutInflater).apply{
            setContentView(root)
            lifecycleOwner= this@MvvmActivity
            view =this@MvvmActivity
            viewModel = this@MvvmActivity.viewModel

        }
    }

    fun loadImage(){

        viewModel.loadRandomImage()


    }
}