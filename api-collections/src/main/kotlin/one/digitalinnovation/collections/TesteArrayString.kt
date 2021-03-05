package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3) {""}
    nomes[0] = "wilian"
    nomes[1] = "maria"
    nomes[2] = "olivia"

    println("++++++++++++++++++++++++++++nomes Array")
    for (nome in nomes){
        println(nome)
    }

    println("++++++++++++++++++++++++++++sort nomes Array")
    nomes.sort()
    nomes.forEach { nome ->
        println(nome)
    }
        //pode declara desse jeito abaixo sem ser verboso
    val nomes2 = arrayOf("Tekila", "Zaza", "Pedro")

    println("++++++++++++++++++++++++++++ sort nomes2 arrayOf")
    nomes2.sort()
    nomes2.forEach { nome ->
          println(nome)
    }
}