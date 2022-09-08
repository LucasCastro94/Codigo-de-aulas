package ColecaoAndFuncao

fun main()
{
//Set tambem faz parte de coleção, a diferença de set para list é--> List é um conjunto ordenado sempre adiciona ao final da lista
// Set nao é um conjunto ordenado, e o set nao permite valores duplicados nem chamar por index

   val set1: Set<Int> = setOf<Int>(1,1,2,2,3,3)


    val set2: MutableSet<String> = mutableSetOf<String>("Barcelona","Corinthians") // diferença de SetOf para MutableSet é poder (adicionar,remover e editar)

    set2.add("Real madri")
    set2.add("Santos")  //adicionando na lista
    set2.remove("Santos") // removendo da lista
    println(set2.contains("Corinthians")) // true or false

    println(set2)

}