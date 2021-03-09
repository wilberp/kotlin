package one.digitalinnovation.collections

fun main(){

    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContratacao = "CLT")
    val maria = Funcionario(nome = "Maria", salario = 1400.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2400.0, tipoContratacao = "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("++++++++++++++++++++++++++")
    repositorio.findAll().forEach{println(it)}

    println("+++++++++++++++++remove +++++++++")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}




}