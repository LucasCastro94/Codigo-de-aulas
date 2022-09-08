package ColecaoAndFuncao

fun main() {

    var lista1: List<Int> = listOf(12, 32, 44, 55, 77) // List é um tipo de coleção  Litsof é imutavel

    println(lista1[2]) //valor de index [posicao]
    println(lista1.size) //quantos elementos na lista




    var lista2: MutableList<Int> = mutableListOf(123, 22,1,33,43)  //MutableList é mutavel possiver (Adicionar,remover,editar)
    lista2.add(8)
    lista2.add(10) //adiciona 10 a lista
    lista2.remove(22) // remove o elemento 22 da lista
    lista2.removeAt(0) // remove o index 0 da lista
    lista2.contains(80) // contains retorna um true or false se existe o elemento na lista
    lista2.clear() // limpa toda a lista










}