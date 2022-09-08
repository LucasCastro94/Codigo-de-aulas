package ColecaoAndFuncao

fun main()
{   // Map é uma coleção do tipo (Chave e valor) ela funciona em pares, cada chave tem um valor associado, não se pode definir 2 valores para mesma chave
     //                CHAVE->VALOR /Pair é uma função que recebe 2 valores
    val map1 = mapOf<String,String>(Pair("Paris","França"),Pair("Madri","Espanha"),Pair("Brasilia","Brasil"),Pair("Madri","Venezuela"))
                                                                                                              // 2 madri nas chave vai pegar somente o ultimo valor vemezuela

/*
    println(map1["Paris"]) // imprimindo a chave paris
    println(map1["Brasilia"])
    println(map1.entries) //Imprimindo todas entradas
    println(map1.values) // imprimindo todos valores
*/
    var map2= mutableMapOf<String,String>(Pair("Santos","Santos SP"),Pair("Flamengo","Rio de janeiro"))

    map2["Palmeiras"] = "São Paulo"  //Adicionando ao MutableMapOf
    map2.remove("Santos") // removendo Santos da lista

    println(map2) // exibindo map2

    println(map2.contains("Palmeiras")) // Existe a chave palmeiras true or false

    map2.clear() // Limpando a classe
}