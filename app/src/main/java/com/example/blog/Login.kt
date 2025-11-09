package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val botaoCriarCadastro = findViewById<Button>(R.id.btnCriarCadastro)
        val botaoFazerLogin = findViewById<Button>(R.id.btnFazerLogin)

        botaoCriarCadastro.setOnClickListener(this::telaCriarCadastro)
        botaoFazerLogin.setOnClickListener(this::telaFazerLogin)
    }

    fun telaCriarCadastro (view: View) {
        val intent = Intent(this, CadastroLogin::class.java)
        startActivity(intent)
    }

    fun telaFazerLogin (view: View) {
        val intent = Intent(this, FazerLogin::class.java)
        startActivity(intent)
    }
}