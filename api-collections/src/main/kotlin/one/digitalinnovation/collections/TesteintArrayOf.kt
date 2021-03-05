package one.digitalinnovation.collections

fun main(){
    //intArrayOf  serve para que nã sejas necessario iniciar com valor o array.
    val values = intArrayOf(2, 3, 5, 1, 10, 7, 12)

    values.forEach {
        println(it)
    }

    println(" ==========================")

    values.sort()
    values.forEach {
        println(it)
    }
}