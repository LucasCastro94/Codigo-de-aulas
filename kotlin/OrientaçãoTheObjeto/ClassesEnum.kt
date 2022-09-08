package OrientaçãoTheObjeto

import javax.print.attribute.standard.Media

enum class Prioridade1(val id: Int)
{
    Baixa(10),Media(20),Alta(30)
}

fun main ()
{
for (c in Prioridade1.values())
    {
        println(" "+c+"-"+c.id)

        if(c.toString()=="Alta")
        {
            println("Alta localizada com valor de "+c.id)
        }
    }
}