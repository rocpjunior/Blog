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

class Favoritos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favoritos)

        val botaoInicio = findViewById<Button>(R.id.btnInicio)
        val botaoProcurar = findViewById<Button>(R.id.btnProcurar)
        val botaoEscrever = findViewById<Button>(R.id.btnEscrever)
        val botaoPerfil = findViewById<Button>(R.id.btnPerfil)
        val botaoNotificacoes = findViewById<FloatingActionButton>(R.id.fabNotificacoes)

        botaoInicio.setOnClickListener(this::telaInicio)
        botaoProcurar.setOnClickListener(this::telaProcurar)
        botaoEscrever.setOnClickListener(this::telaEscrever)
        botaoPerfil.setOnClickListener(this::telaPerfil)
        botaoNotificacoes.setOnClickListener(this::telaNotificacoes)
    }

    fun telaInicio (view: View) {
        val intent = Intent(this, Inicio::class.java)
        startActivity(intent)
    }

    fun telaProcurar (view: View) {
        val intent = Intent(this, Procurar::class.java)
        startActivity(intent)
    }

    fun telaEscrever (view: View) {
        val intent = Intent(this, Escrever::class.java)
        startActivity(intent)
    }

    fun telaPerfil (view: View) {
        val intent = Intent(this, Perfil::class.java)
        startActivity(intent)
    }

    fun telaNotificacoes (view: View) {
        val intent = Intent(this, Notificacoes::class.java)
        startActivity(intent)
    }
}