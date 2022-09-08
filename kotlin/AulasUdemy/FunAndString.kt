fun somando(n1: Int, n2: Int): Int
//fun declara função , somando = nome da funçao, entre parenteses esta o parametro: identificador ex: n1 e o tipo ex: int, por ultimo retorno do tipo Int
{
    return n1 * n2
}

//fun somando(n1: Int,n2: Int) = n1+n2  // Unica linha


fun HelloWord() {
    println("Hello Word")
}

// fun HelloWord2() = println("Ola mundo")             Unica Linha

fun GoodAfternoon(str: String): String {
    return "Ola " + str + " Boa Tarde, tudo bem ?"
}

//fun GoodAfternoon(str: String) = "Ola " + str + " Tudo bem?"   //Unica linha

fun main() {
    println(somando(25, 3)) // posso por numero direto ou usar uma variavel
    HelloWord()
    println(GoodAfternoon("Lucas"))

    val MeuNome: String = "Lucas fernandes"

    println("O tamanho da palavra meunome é: "+MeuNome.length) // Quantas letras existe nessa string conta espaço tbm

    println(MeuNome.startsWith("luc",true)) // Compara inicialização da string ingorecase serve para ignora letra maiuscula de minuscula
    println(MeuNome.endsWith("Des",true)) // compara final de string true para ignorar letras maiuscula e minuscula
    println(MeuNome.substring(2,5)) // inicia a string na posiçao 2 e finaliza na 5
    println(MeuNome.replace("Lucas","Leo")) // Substitui uma palavra da string por outra desejavel
    println(MeuNome.lowercase()) // transforma a String toda em MINUSCULA
    println(MeuNome.uppercase())// transforma a String toda em MAIUSCULA
   println("       TESTANDO ESPAÇOS          ".trim()) //Trim remove os espaços antes ou depois das palavras
}