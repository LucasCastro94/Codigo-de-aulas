package Collections

fun main(args: Array<String>) {
    // List - Array, Set, Hashmap

    val lista1 = listOf<String>("Teste", "Paulo", "heitor", "Mercearia")

    val lista2= mutableListOf<String>("Teste2","Nanci","Elena","Padaria")  // diferença de mutable para list é que tem (add,remove,addAll) lista2.add/remove/addAll

   val a1 = arrayListOf<String>("Santander","Banco do brasil", "Itau") // array vem do java funciona igualmente o mutable aceita add,remove e addall

    val s1 = setOf<String>("Barcelona","Barcelona","Madri","Madri") // A diferença de set para listof é que ele nao armazena valores iguais, nao exibi e nao é permitido alterações

    val s2 = mutableSetOf<String>("Barcelona","Barcelona","Madri","Madri") // Igualmente setof com diferença de alteração (add,remove,addAll) exemplo a baixo

s2.add("Coca cola")
    s2.remove("Madri")
s2.addAll(lista2)

    val h1 = hashMapOf<String,String>(Pair("Key", "value"), Pair("Brasil", "Brasilia")) //Hashmapof é aberto para alterações (add,remove,addAll etc)

    //                 Referencia par de 2 strings sao: chave e o valor, a chave sempe exibi o valor ex>>> (key = "Brasil" entao value = "Brasilia"

    println(h1.entries)// printando as entradas
    println(h1["Brasil"]) // Printando o valor de chave do brasil  (OBS: para acessar a chave sempre usar a variavel em seguida de colchetes fechados)

    //Hashmap para mapof na pratica nao tem diferença nenhuma!!

   val m1 = mapOf<String,String>(Pair("Key", "value"), Pair("Brasil", "Brasilia")) // Mapof nao permite alterações
    val m2 = mutableMapOf<String,String>(Pair("Key", "value"), Pair("Brasil", "Brasilia")) // Perimite alterações





}