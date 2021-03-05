package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(2501.0, 1000.0, 2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
    }

    println("===============================")
    println("Maior salario é ${salarios.maxOrNull()}")
    println("Menor salario é ${salarios.minOrNull()}")
    println("Media salario é ${salarios.average()}")

    //filter faz busca no array
    val salarioMaiorque2500 = salarios.filter { it > 2500.0 }

    println("===============================")
    println("Salario  maior que 2500:")
    salarioMaiorque2500.forEach{println(it)}

    //contando valores entre range entre valores
    println("===============================")
    println("Range")
    println(salarios.count { it in 2000.0 .. 5000.0 })

    //contando valores entre range entre valores
    println("===============================")
    println("valor especifico")
    println(salarios.find { it == 2250.0 })

    //testando com valor que não existe retorna null
    println(salarios.find { it == 2050.0 })

    println("===============================")
    println("encontra valor com expressao verdadeira")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })

}