package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val maria = Gerente(nome = "Maria do Carmo ", cpf = "123455", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
