package com.example.blog

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        val nomeCompleto = findViewById<EditText>(R.id.edNomeCompleto)
        val email = findViewById<EditText>(R.id.edEmail)
        val dataNascimento = findViewById<EditText>(R.id.edDataNascimento)
        val genero = findViewById<EditText>(R.id.edGenero)
        val senha = findViewById<EditText>(R.id.edSenha)
        val SenhaDenovo = findViewById<EditText>(R.id.edSenhaDenovo)

        botaoCriarCadastro.setOnClickListener(this::telaCriarNovoCadastro)
        botaoVoltar.setOnClickListener(this::telaLogin)
    }

    fun telaCriarNovoCadastro (view: View) {
        val edNomeCompleto = findViewById<EditText>(R.id.edNomeCompleto)
        val edEmail = findViewById<EditText>(R.id.edEmail)
        val edDataNascimento = findViewById<EditText>(R.id.edDataNascimento)
        val edGenero = findViewById<EditText>(R.id.edGenero)
        val edSenha = findViewById<EditText>(R.id.edSenha)
        val edSenhaDenovo = findViewById<EditText>(R.id.edSenhaDenovo)

        var NomeCompleto = edNomeCompleto.text.toString()
        var Email = edEmail.text.toString()
        var DataNascimento = edDataNascimento.text.toString()
        var Genero = edGenero.text.toString()
        var Senha = edSenha.text.toString()
        var SenhaDenovo = edSenhaDenovo.text.toString()

            if(NomeCompleto.isEmpty() && Email.isEmpty() && DataNascimento.isEmpty() && Genero.isEmpty() && Senha.isEmpty() && SenhaDenovo.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else{
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
        }
    }
    fun telaLogin (view: View) {
        val intent = Intent(this, Login::class.java)
        finish()
    }
}