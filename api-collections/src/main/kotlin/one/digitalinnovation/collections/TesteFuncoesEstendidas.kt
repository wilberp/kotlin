package one.digitalinnovation.collections

fun main(){
    val salario = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("======================")
    println(salario.somatoria())

    println("======================")
    println(salario.media())
}