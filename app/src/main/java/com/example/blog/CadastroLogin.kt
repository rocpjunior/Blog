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

class CadastroLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro_login)

        val botaoCriarCadastro = findViewById<Button>(R.id.btnCriarNovoCadastro)
        val botaoVoltar = findViewById<FloatingActionButton>(R.id.fabVoltarLogin)

        botaoCriarCadastro.setOnClickListener(this::telaCriarNovoCadastro)
        botaoVoltar.setOnClickListener(this::telaLogin)
    }

    fun telaCriarNovoCadastro (view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun telaLogin (view: View) {
        val intent = Intent(this, Login::class.java)
        finish()
    }
}