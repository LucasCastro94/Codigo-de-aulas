package OrientaçãoTheObjeto

open class Maquina1(val marca: String)  //Open sigfinica que essa classe pode ser herdada
{
    fun MinhaMarca()
    {
        println("Minha marca é "+marca)
    }

    class Computador1(marca: String, val nucleos: Int) : Maquina1(marca)
    {


        fun Ligar()
        {
            println("Ligado")
        }
        fun Processar()
        {
            println("i9 total de nucleos "+nucleos)
        }

    }
}

fun main()
{
    // C: é do tipo Maquina1.Computador1
    val c: Maquina1.Computador1 = Maquina1.Computador1("intel",16)

    c.Ligar()
    c.Processar()
    c.MinhaMarca()

   //  Witch serve para facilitar a visualizaçao da funçao ao inves de ter q por C. no exemplo acima.
   /*
     with(c)
           { Ligar()
              Processar()
                MinhaMarca()

            }
    */


}