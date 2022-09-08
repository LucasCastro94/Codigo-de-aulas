package Exercise

fun reverseUsingSB(str: String) : String {


    println("Convertido:"+StringBuilder(str).reverse().toString())
    return StringBuilder(str).reverse().toString()

}

fun reverseUsingLoop(str: String) : String {
    var Phrase = StringBuilder()
    val tam = str.length

    for(i in tam-1 downTo 0)
    {
        Phrase.append(str[i])
    }
    println("Convertido:"+Phrase)
    return Phrase.toString()
}