

fun main ()
{   // integrando informaçoes a classe

    //criando variavel e atribuindo a classe pessoa
    var pessoa: pessoa1 = pessoa1("mateus",12091994)

    var pessoal: pessoa2 = pessoa2("lucas",15111994)



    println(pessoa.nome)
    println(pessoa.saudacao())
    println(pessoal.nome)
    println(pessoal.datanasc)
    println(pessoal.olamundo())



}
//Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos,
// que representam, respectivamente, as características e comportamentos desse objeto
class pessoa1 (var nome: String,var datanasc: Int)
{
    fun saudacao()
    {
        println("Ola seja bem vindo, "+nome)
    }
}



class pessoa2(var nome: String,)  //classe tem que define var ou val
{
    var datanasc: Int? = null // para usar no construtor é obrigado definir a variavel e por em null
    constructor(nome: String,datanasc: Int) : this(nome)
    {
        println("Hello Word!")
    }

    fun olamundo()
    {
        println("Ola mundo!")
    }
}
