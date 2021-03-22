package com.wilber.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

   private fun setListeners(){

       alturaEDT?.doAfterTextChanged { text ->
           Toast.makeText(this, text.toString(), Toast.LENGTH_LONG).show()
       }

       pesoEDT.doOnTextChanged{text, start, before, count ->   titleTXT?.text = text}


       calcularBTN.setOnClickListener{

           calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
       }
   }

    //private fun abrirNovaTelaComResultados(imc: String, faixa: String) {
    private fun abrirNovaTelaComResultados(imc: String) {
        val result = Intent(this, ResultActivity::class.java)
        result.putExtra(ResultActivity.IMC_ID, imc)
    //    result.putExtra(ResultActivity.FAIXA_DE_PESO, faixa)
        startActivity(result)
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        var vimc = 0F

        if (peso != null && altura != null) {
            vimc = peso / (altura * altura)
        //    titleTXT.text = "Seu IMC é \n %.2f".format(vimc)
            abrirNovaTelaComResultados( "%.2f".format(vimc))
        }else{

        }


    }
}