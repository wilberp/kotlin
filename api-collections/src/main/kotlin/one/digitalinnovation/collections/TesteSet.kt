package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1400.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2400.0, tipoContratacao = "PJ")

    //o set é conjunto
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //uniao de conjunto 1 e 2
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("============================ subtract")
    //subtrair do conjunto 3 o que ta no conjunto 2m, no caso maria

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("============================ intersect")
    //retorna de comum que tem no conjunto 3 e conjunto 2m, no caso maria

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}