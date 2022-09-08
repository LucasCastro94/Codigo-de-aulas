fun main ()
{
    println ("Hello word!")

    var idade: Int = 32
    var nome: String = "Lucas"
    var altura: Float = 1.92f
    var sexo: Char = 'M'
    var salario: Float = 950f
    var extra: Float = 1000f
    var salario_bruto = salario + extra

//exibindo
    println ("Nome salvo é "+nome)
    println ("Idade salva é "+idade)
    println ("Altura:"+altura)
    println("Sexo:"+sexo)
    println("Salario bruto: "+salario_bruto)


    //Pegando entrada

    var Entrada = readLine()


    //variaves mutaveis

    var idade2: Int =33
    var Peso2: Float = 22f

    //variaveis imutaveis nao se altera

    val Idade3: Int = 21



    var palavra: String = """testando a linha
      |segunda linha
      |terceira linha
      |quarta
  """.trimMargin()

    //exibindo

    print(palavra)

}