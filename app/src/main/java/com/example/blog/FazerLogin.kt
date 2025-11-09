package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FazerLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fazer_login)
        val botaoVoltar = findViewById<FloatingActionButton>(R.id.fabVoltar)
        val botaoEntrar = findViewById<Button>(R.id.btnEntrar)
        val botaoEsqueciASenha = findViewById<Button>(R.id.btnEsqueciSenha)

        botaoVoltar.setOnClickListener(this::telaLogin)
        botaoEntrar.setOnClickListener(this::telaInicio)
        botaoEsqueciASenha.setOnClickListener(this::telaEsqueciASenha)
    }

    fun telaLogin (view: View) {
        val intent = Intent(this, Login::class.java)
        finish()
    }

    fun telaInicio (view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun telaEsqueciASenha (view: View) {
        val intent = Intent(this, EsqueciSenha::class.java)
        startActivity(intent)
    }
}