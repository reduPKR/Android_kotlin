package br.com.agenda.votacao.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.agenda.votacao.databinding.ActivityMenuInicialBinding
import br.com.agenda.votacao.ui.activity.eleitor.AdicionarEleitor

class Menu : AppCompatActivity() {
    private val binding by lazy {
        ActivityMenuInicialBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Menu votação"
        setContentView(binding.root)

        iniciarBotoes()
    }

    private fun iniciarBotoes() {
        botaoAdicionarEleitor()
    }

    private fun botaoAdicionarEleitor() {
        val botao = binding.buttonAdicionarEleitor
        botao.setOnClickListener {
            val intent = Intent(this, AdicionarEleitor::class.java)
            startActivity(intent)
        }
    }
}