package com.example.calculadoraimc

import kotlinx.android.synthetic.main.activity_main.*

// Função que realiza o calculo do IMC baseado
// nos valos de Altura e Peso e retorna a frase de acordo com o Enum
internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {

    if(pesoTxt.isNullOrEmpty()   || alturaTxt.isNullOrEmpty()) {
        return IMCResult(Result.BLANK)
    }

    val peso = pesoTxt.toFloat()
    val altura = alturaTxt.toFloat()
    val imc = peso / (altura * altura)

    if (imc < 16){
        return IMCResult(Result.MAGREZA_III)
    } else if (imc < 17){
        return IMCResult(Result.MAGREZA_II)
    } else if (imc < 18.5){
        return IMCResult(Result.MAGREZA_I)
    } else if (imc < 25){
        return IMCResult(Result.OK)
    } else if (imc < 30){
        return IMCResult(Result.SOBREPESO)
    } else if (imc < 35){
        return IMCResult(Result.OBESIDADE_I)
    } else if (imc < 40){
        return IMCResult(Result.OBESIDADE_II)
    } else {
        return IMCResult(Result.OBESIDADE_III)
    }
}
// Criado um data class que ira receber dentro do IMCResult os resultados do enum
data class IMCResult(val result: Result)

// Criado emum para ter mapeado todos os possiveis valores
// de texto de acordo com o resultado do IMC
enum class Result(val label: String) {
    BLANK("Inserir os valores de peso e altura corretamente"),
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade GHrau II (severa)"),
    OBESIDADE_III("Obesidade GHrau III (mórbida)")
}