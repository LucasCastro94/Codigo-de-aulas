package MeusApp

import jdk.internal.org.objectweb.asm.tree.analysis.Value
import kotlin.random.Random as Random


fun main()
{

dated().filtrando(40).forEach{ println(it.nome) }


}

class pessoa (val nome: String, val idade:Int)

private class dated
{
    val lista: List<pessoa> = listOf(

        pessoa("Lucas",22),
        pessoa("leo",12),
        pessoa("marcelo",40),
        pessoa("elana",44),
        pessoa("jose",40),
        pessoa("artur",44)
    )

    fun filtrando(idade: Int) : List<pessoa>
    {
        val filtrada = lista.filter { it.idade>idade}

        return  filtrada
    }
}

