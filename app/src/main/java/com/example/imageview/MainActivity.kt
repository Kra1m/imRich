package com.example.imageview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var change = true

//        binding.btnChangeImage.setOnClickListener {
//            if (change){
//                binding.imgChange.setImageResource(R.drawable.nikolai)
//                change = false
//            }else {
//                binding.imgChange.setImageResource(R.mipmap.ic_image)
//                change = true
//            }
//        }


        binding.btnImage.setOnClickListener{
            if (change){
                binding.btnImage.setImageResource(R.drawable.im_rich2)
                change = false
            }else{
                binding.btnImage.setImageResource(R.drawable.im_rich1)
                change = true
            }
        }


    }
}