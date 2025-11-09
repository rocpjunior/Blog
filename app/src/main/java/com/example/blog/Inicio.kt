package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        val botaoProcurar = findViewById<Button>(R.id.btnProcurar)
        val botaoEscrever = findViewById<Button>(R.id.btnEscrever)
        val botaoFavoritos = findViewById<Button>(R.id.btnFavoritos)
        val botaoPerfil = findViewById<Button>(R.id.btnPerfil)
        val botaoNotificacoes = findViewById<FloatingActionButton>(R.id.fabNotificacoes)

        botaoProcurar.setOnClickListener(this::telaProcurar)
        botaoEscrever.setOnClickListener(this::telaEscrever)
        botaoFavoritos.setOnClickListener(this::telaFavoritos)
        botaoPerfil.setOnClickListener(this::telaPerfil)
        botaoNotificacoes.setOnClickListener(this::telaNotificacoes)
    }


    fun telaProcurar (view: View) {
        val intent = Intent(this, Procurar::class.java)
        startActivity(intent)
    }

    fun telaEscrever (view: View) {
        val intent = Intent(this, Escrever::class.java)
        startActivity(intent)
    }

    fun telaFavoritos (view: View) {
        val intent = Intent(this, Favoritos::class.java)
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