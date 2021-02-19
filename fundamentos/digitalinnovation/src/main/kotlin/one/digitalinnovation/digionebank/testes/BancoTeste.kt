package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome="DigiOne", numero = 12)

    //copia somente algum campo
    val banco2 = digiOneBank.copy(nome="WillsBank ")

    println (banco2.info())
}