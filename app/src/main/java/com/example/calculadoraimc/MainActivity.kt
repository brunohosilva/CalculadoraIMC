package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Função que pega os valores dos inputs de peso e de altura
        // chama a função getImcResult do arquivo Utils que faz o calculo do IMC
        // Mostra a frase final para o usuário de acordo com o resultado do IMC

        btn_make_calc.setOnClickListener {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()
            val imcResult = getImcResult(pesoTxt, alturaTxt)
            txt_result_imc.text = imcResult.result.label
        }
    }
}