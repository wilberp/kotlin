package com.wilber.imc_app

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ColorInt
import kotlinx.android.synthetic.main.activity_result.*
import java.time.format.TextStyle
import kotlin.text.toFloat as textToFloat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setListeners()
    }
    companion object{
        const val FAIXA_DE_PESO = "Peso"
        const val IMC_ID = "imc"
    }

    private fun setListeners(){
        closeBTN?.setOnClickListener {
            onBackPressed()
            //retorna para a tela anterior
        }

        //exibe os valores passados pela tela anterior
        resultTXT?.text = intent.getStringExtra(IMC_ID)
        val vimc:String = intent.getStringExtra(IMC_ID).toString()
        defineFaixaClassificacao(vimc)
        //resultTextTXT?.text = intent.getStringExtra(FAIXA_DE_PESO)
    }

    private fun defineFaixaClassificacao(imc: String){

        if(imc < "18,5") {
            resultTextTXT?.text = "MAGREZA"
            resultTextTXT?.textSize = 32F
            resultTextTXT?.setTextColor(Color.CYAN)
            resultTextTXT?.setBackgroundColor(Color.BLACK)
        }
        else if(imc in "18,5".."24,9") {
            resultTextTXT?.text = "NORMAL"
            resultTextTXT?.textSize = 32F
            resultTextTXT?.setTextColor(Color.GREEN)
            resultTextTXT?.setBackgroundColor(Color.BLACK)
        }
        else if(imc in "25,0".."29,9") {
            resultTextTXT?.text = "SOBREPESO"
            resultTextTXT?.textSize = 32F
            resultTextTXT?.setTextColor(Color.YELLOW)
            resultTextTXT?.setBackgroundColor(Color.BLACK)
        }
        else if(imc in "30,0".."39,9") {
            resultTextTXT?.text = "OBESIDADE"
            resultTextTXT?.textSize = 32F
            resultTextTXT?.setTextColor(Color.RED)
            resultTextTXT?.setBackgroundColor(Color.BLACK)
        }
        else{
            resultTextTXT?.text = "OBESIDADE MORBIDA"
            resultTextTXT?.textSize = 32F
            resultTextTXT?.setTextColor(Color.MAGENTA)
            resultTextTXT?.setBackgroundColor(Color.BLACK)
        }
    }
}