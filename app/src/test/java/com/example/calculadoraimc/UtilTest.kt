package com.example.calculadoraimc

import org.junit.Assert.*
import org.junit.Test


class UtilTest {
    // Criado teste para verificar se os valores entrados
    // e tendo o resultado esperado está sendo renderizado a frase correta
    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }
    // Criado teste para verificar se os valores estao vazios ou nulos
    // e o resultado esperado está sendo renderizado a frase correta
    @Test
    fun testGetImcResult_embranco_aviso() {
        val semPeso = getImcResult("", "1.80")
        assertEquals(semPeso.result, Result.BLANK)

        val semAltura = getImcResult("80", "")
        assertEquals(semAltura.result, Result.BLANK)
    }
}