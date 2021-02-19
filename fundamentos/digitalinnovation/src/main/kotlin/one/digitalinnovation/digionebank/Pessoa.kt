package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "wils"
    var cpf: String = "277"
    //faz com que os campos não seja mutaveis no caminho
    private set
}

fun main(){
    val pessoa = Pessoa()
//    pessoa.cpf = "1234"
    println(pessoa.nome)
    println(pessoa.cpf)
}
