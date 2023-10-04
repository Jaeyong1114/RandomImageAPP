package com.example.randomimageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.randomimageapp.databinding.ActivityMainBinding
import com.example.randomimageapp.mvc.MvcActivity

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also{
            setContentView(it.root)
            it.view = this
        }

        binding.mvcButton.setOnClickListener {
            openMvc()
        }

        binding.mvpButton.setOnClickListener {
            openMVP()
        }
        binding.mvvmButton.setOnClickListener {
            openMVVM()
        }
        binding.mviButton.setOnClickListener {
            openMVI()
        }





    }


    fun openMvc(){
        startActivity(Intent(this,MvcActivity::class.java))

    }
    fun openMVP(){

    }
    fun openMVVM(){

    }
    fun openMVI(){

    }
}