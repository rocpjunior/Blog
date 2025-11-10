package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EsqueciSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_esqueci_senha)
        val botaoVoltar = findViewById<FloatingActionButton>(R.id.fabVoltarPaginaLogin)
        val botaoConfirmarSenha = findViewById<Button>(R.id.btnConfirmarSenha)
        val botaoCancelarSenha = findViewById<Button>(R.id.btnCancelarSenha)

        botaoVoltar.setOnClickListener(this::telaFazerLogin)
        botaoConfirmarSenha.setOnClickListener(this::telaFazerLogin)
        botaoCancelarSenha.setOnClickListener(this::telaLogin)
    }

    fun telaLogin (view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun telaFazerLogin (view: View) {
        val intent = Intent(this, FazerLogin::class.java)
        startActivity(intent)
    }
}