package com.example.a28_glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            loadImage()
        }
    }

    private fun loadImage() {
        val url = "https://picsum.photos/500"
        Glide
            .with(this)
            .load(url)
            .centerCrop()
            //.placeholder(R.drawable.ic_launcher_foreground)
            .into(imageView)
    }
}