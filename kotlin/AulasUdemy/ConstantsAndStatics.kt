package AulasUdemy

class Constants
{
    companion object{  // companion pode ou nao ter um nome
        val target = "pessoa desse bloco"
    fun Teste99()
    {
        var num: Int = 30

        println(num*num)
    }
    }

    object chamando{   /// somente object é necessario definir um nome no caso em exemplo: "chamando"
        fun Teste100()
        {
            val num: Int = 50

            println(num+num)
        }

        object chamando2{   // é possivel usar um object dentro de outro
            fun Somadenovo()
            {
                val num: Int = 200
                println(num+num)
            }
        }


    }
}

fun main()
{
  println(Constants.target) // exibe a classe sem instancia
    Constants.Teste99()
    Constants.chamando.Teste100()
    Constants.chamando.chamando2.Somadenovo()

}