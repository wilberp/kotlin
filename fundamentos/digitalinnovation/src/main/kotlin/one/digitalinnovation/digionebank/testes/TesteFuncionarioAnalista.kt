package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){

    val wil = Analista(nome = "wilian peres ", cpf = "12345", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(wil)
}