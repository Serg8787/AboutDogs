package com.example.homework2_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 3000)


        // Анимация между SplashActivity и MainActivity
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);


        // Анимация текста
        val anim = AnimationUtils.loadAnimation(this,R.anim.text);
        tvAboutDogSplashActivity.startAnimation(anim);


         // С помощью библиотеки Glide работает гифка
        Glide.with(this).load(R.drawable.icons8_dog3).into(ivSplash);
    }
}