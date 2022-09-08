package MeusApp

sealed class result                                         //Sealed funciona como open com diferença de privar seu uso apenas dentro desse arquivo
{
    class sucess (val message: String) : result()
    class error(val message: String, ErrorCode: Int) : result()
}

class Repo()
{
    fun execute() : result
    {
     return result.sucess("Tudo Ok")
    }
}

fun main()
{
val r1 = Repo()
    val Resulted: result = r1.execute()
    when (Resulted)
    {
        is result.sucess -> {
            println("Sucesso")
        }
        is result.error -> {
            println("Erro")
    }
    }
}