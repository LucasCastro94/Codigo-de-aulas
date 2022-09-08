package ColecaoAndFuncao

fun main() {

    var dados = AlunosDados()


    //////////////////////////////////////////////////////////// DISTINCT

    val valor: List<Int> = listOf (1,2,5, 3, 3, 3, 5, 5, 7, 8, 9, 10, 12)  //distinct serve para letra tbm ('a', 'a','b' == a,b)
    println(valor.distinct()) // distinct exibi numeros ou letras sem repetir


    println(valor.sorted())  // Organiza do menor para o maior
    println(valor.sortedDescending()) //Organiza do maior para menor

    println(valor.reversed()) // inverte toda a lista

}


fun AlunosDados(): List<Alunos> {
    return listOf(
        Alunos(
            "Lucas", "445-909-55-8",
            listOf(
                Notas(10, 10),
                Notas(10, 5),
                Notas(4, 8)

            )


        ),
        Alunos("Leo santos", "558-999-808-3"),
        Alunos("Mateus elisode", "994-333-444-2"),
        Alunos(
            "Bruna lima", "999-555-888-8",
            listOf(Notas(6, 8), Notas(8, 9), Notas(8, 4))
        )

    )


}

data class Alunos(var nome: String, var cpf: String, var Notas: List<Notas> = listOf())
data class Notas(val N1: Int, val N2: Int)