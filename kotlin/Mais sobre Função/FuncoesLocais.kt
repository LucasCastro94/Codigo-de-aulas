package `Mais sobre Função`
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.log
import kotlin.time.hours
import kotlin.time.minutes

fun Log(str:String)
{
    println(str)
}


fun top () {

    fun Log(str: String) {                                         //Iniciar uma função dentro de outra função para se manter privada nesse arquivo
        val calendar = Calendar.getInstance()                      //instanciando o calendario
       // val formatted = SimpleDateFormat("HH:mm:ss")        // atribuindo a variavel ao formato de horas
        //println("$str - ${formatted.format(calendar.time)}")      // mostra a STR (variavel formato de horas . format( var calendar. tempo


        val formatted = SimpleDateFormat("EEE")
        println("$str - ${formatted.format(calendar.time)}")

        if(formatted.format((calendar.time))=="Ter")
        {
            println("é segunda")
        }


    }
    Log("Inicio")                          //inicia função log mostra hora
    val interval = 1..10000000
    var sum: Double = 0.0
    for (i in interval) {
        sum += 1
    }
    Log("Fim")                            // finaliza mostra horas


}
    fun main()
    {
      top()
        `Mais sobre Função`.Log("teste")  //utilizando nome da packge para chamar uma funçao de fora com mesmo nome

    }
