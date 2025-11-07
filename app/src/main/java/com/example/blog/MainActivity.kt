package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val botaoTermos = findViewById<Button>(R.id.btnTermos)
        botaoTermos.setOnClickListener(this::janelaTermos)
    }

    fun janelaTermos (view: View) {
        val fragmento = Termo()
        fragmento.show(supportFragmentManager, "AlertFragmento")
    }
}