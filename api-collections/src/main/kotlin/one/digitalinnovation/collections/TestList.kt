package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1400.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2400.0, tipoContratacao = "PJ")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{   println(it)    }

    println("**********  buscando um nome- caso maria")
    println(funcionarios.find { it.nome == "Maria"})

    println("**********  usando sortedby pelo salario")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("**********  usando groupby pelo tipo de contratacao")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}


    println("**********  adicionando novo funcionario")
    //usando api collection nao consegue fazer adicao de funcionario

}
