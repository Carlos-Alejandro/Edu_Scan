package com.example.edu_scan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.edu_scan.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Encuentra la ImageView y carga la imagen utilizando Glide
        val imageView: ImageView = findViewById(R.id.img_splash_icon)
        Glide.with(this)
            .load(R.drawable.img_splash_icon)
            .into(imageView)

        // Retraso de 5 segundos antes de pasar a la pantalla de login
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()  // Finaliza la SplashActivity para que no se pueda volver atrás
        }, 5000)  // 5000 milisegundos = 5 segundos
    }
}
