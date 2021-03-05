package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println(" ==========================")
    for (valor in values){
        println("for:  " + valor)
    }

    println(" ==========================")
    values.forEach {
        println(it)
    }

    //ou foreach com lambda
    println(" ==========================")
    values.forEach { valor ->
        println("foreach " +valor)
    }


    //ou for
    println(" ==========================")
    for(index in values.indices){
        println(values[index])
    }

    println(" ==========================")
    //ordenou por padrao do menor para maior
    values.sort()
    for (valor in values){
        println(valor)
    }


}