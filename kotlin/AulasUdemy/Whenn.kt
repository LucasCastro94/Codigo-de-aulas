fun operacao (a: Int, b: Int , c: String)  : Int
{   //estrutura when
    when (c)
    {
        "soma" -> {return a + b}

        "multiplicacao" -> {return a*b}

        else -> {println("opcao invalida")
            return 0}


    }
}

fun operador2(num1: Int)
{
    //range no when
    when {
        num1 in 1..99 ->
            println("é maior que zero e menor que 100")
    }


}


fun main ()
{
  println( operacao(10,20,"soma"))
    println(operacao(10,20,"multiplicacao"))
    operacao(10,20,"somaaa")
    operador2(5)
}