package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "wils"
    var cpf: String = "277"
    //faz com que os campos não seja mutaveis no caminho
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val pessoa = Pessoa()
//    pessoa.cpf = "1234"
      println(pessoa.pessoaInfo())
}
