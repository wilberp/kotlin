package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0]= 1000.02
    salarios[1] = 3000.03
    salarios[2] = 569.08

    salarios.forEach {println(it)}
    println("++++++++++++++++++++++++++++salarios")

    //serve para mudar valor no indice, é preparado para dar indice na interação
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {println(it)}

    println("++++++++++++++++++++++++++++salarios2 sort")
    //pode-se usar o doublearrayof
    val salarios2 = doubleArrayOf(5000.0, 1250.0, 1500.0)
    salarios2.sort()
    salarios2.forEach { salario2 ->
        println(salario2)
    }
}