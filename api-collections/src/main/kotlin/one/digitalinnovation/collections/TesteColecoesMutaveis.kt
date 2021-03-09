package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1400.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2400.0, tipoContratacao = "PJ")

// mutablelist - é um supertipo list  - uma lista mutavel, apois iniciar consegue fazer mudanças
    println("+++++++++++++ List +++++++++++++")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("++++++++++++ List ++++++++++++++")

    funcionarios.add(pedro)

    funcionarios.forEach{println(it)}

    println("++++++++++++List ++++++++++++++")

    funcionarios.remove(joao)

    funcionarios.forEach{println(it)}

    // nao sao mutaveis
    println("++++++++++++ SET ++++++++++++++")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)

    funcionarioSet.forEach{println(it)}

    println("++++++++++++ SET remove ++++++++++++++")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{println(it)}
}