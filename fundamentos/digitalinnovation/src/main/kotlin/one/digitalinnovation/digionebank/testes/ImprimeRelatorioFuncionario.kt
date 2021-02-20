package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    //metodo statico invocado via classe
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString()
            )
        }
    }
}