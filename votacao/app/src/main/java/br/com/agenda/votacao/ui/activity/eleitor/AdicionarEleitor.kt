package br.com.agenda.votacao.ui.activity.eleitor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.agenda.votacao.databinding.ActivityAdicionarEleitorBinding

class AdicionarEleitor : AppCompatActivity() {
    private val binding by lazy {
        ActivityAdicionarEleitorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Adicionar novo eleitor"
        setContentView(binding.root)

        configurarBotaoSalvar()
    }

    private fun configurarBotaoSalvar() {
        val botaoSalvar = binding.buttonSalvar

        botaoSalvar.setOnClickListener {
            //depois criar a logica de salvar
            finish()
        }
    }


}