package com.example.mycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Glide
        .with(this)
        .load("https://gravatar.com/avatar/f13523fddc0768734e59a8ac40961e70?s=400&d=robohash&r=x")
        .into(findViewById<ImageView>(R.id.imageView))

    }

}