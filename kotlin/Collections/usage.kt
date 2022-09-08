package Collections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes (val nome: String, val quantidade: Int)

fun ExisteIngrediente(List: List<Ingredientes>,nome: String) : Boolean
{
 return   List.filter { it.nome == nome }.any()
}

fun main() {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),

        Receita("Panqueca", 500),
        Receita("Lasanha", 2000),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?

    println("Existem receitas na lista?: " + if (data.any()) "Sim" else "Não") //(Any = Existe algo na val data)

    // Quantas receitas tenho na coleção?

    println("Tenho: " + data.count() + " receitas na coleção")

    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome.contains("Lasanha") }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome.contains("Lasanha") }} receitas de Lasanha.")// conta em data com parametro nome que contem ("Lasanha")

    var totallasanha: Int = 0
    var achou: Int = 0

    for (i in data) {
        if (i.nome.equals("Lasanha")) {
            achou = 1
            totallasanha++
        }
        if (achou == 0) println("Não existe receita de lasanha")

    }

    println("Total de receita de lasanha: " + totallasanha)

    // Qual a primeira e última receita?

    println("Primeira receita:" + data.first().nome)
    println("Primeira receita:" + data.last().nome)


// Qual a soma de calorias?

    var sumCaloreis = data.sumBy { it.calorias }   //facilidade dentro de coleção (sumDouble para double)
    //sum pode ser utilizado para calcular uma lista ex listof(1,3,4,5,6).sum() sumby é utilizado para objetos quando nao temos somente uma lista de inteiros

    var caloriatotal: Int = 0


    for (i in data) {
        caloriatotal = caloriatotal + i.calorias
    }
    println("Total de calorias " + caloriatotal)

    // Me dê as duas primeiras receitas
    println("Primeira receita:" + data.first())
    println("Segunda receita:" + data[1])

    val firstTwo = data.take(2) // metodo do curso pega os 2 primeiro de data

    for(x in firstTwo.withIndex())  //WithIndex = com indice
    {
        println("${x.index+1} - ${x.value.nome}") //indice de x +1  - x.valor de nome
    }

    // Sei como fazer panqueca? E sushi?

    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()   // seifazerpanqueca = filtrar em data com parametro nome == panqueca. existe algum true or false
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}") //pega seifazerpanqueca e confere se é true ou false

    achou = 0
    var achou2: Int = 0
    for (i in data) {
        if (i.nome.equals("Panqueca")) {
            achou = 1
            println("Sei fazer panqueca")
        }
        if (i.nome.equals("Sushi")) {
            achou2 = 1
            println("Sei fazer sushi")
        }
    }
    if (achou == 0) println("Não sei fazer panqueca")
    if (achou2 == 0) println("Não sei fazer Sushi")

    // Quais são as comidas com mais de 500 calorias?

    println("-------------------------------------")
    println("Comidas acima de 500 calorias")
    for (i in data) {
        if (i.calorias > 500) {
            println(i.nome)
        }
    }
    data.filter { it.calorias > 500 }.forEach { println(it.nome) } //filtro em data com parametro em calorias é >500 . faça enquanto achar, exiba o nome
    println("--------------------------------------")
    // Qual a receita mais calórica? E a menos calórica?



    var maiorcaloria: Int = -99
    var menorcaloria: Int = 999999
    lateinit var nomeMaior: String
    lateinit var nomeMenor: String
    for (i in data) {
        if (i.calorias > maiorcaloria) {
            maiorcaloria = i.calorias
            nomeMaior = i.nome.toString()

        }
        if (i.calorias < menorcaloria) {
            menorcaloria = i.calorias
            nomeMenor = i.nome.toString()
        }
    }
    println("Maior caloria " + nomeMaior + " " + maiorcaloria)
    println("Menor caloria " + nomeMenor + " " + menorcaloria)


    // Faça uma lista com o nome dos pratos

    var listapratos = arrayListOf<String>()
    var listasetpratos = mutableSetOf<String>()
    for (i in data) {
        listapratos.add(i.nome.toString())
        listasetpratos.add(i.nome.toString())
    }
    println("-------------------------")
    println("Lista com todos pratos")
    for (i in listapratos) {
        println(i)
    }
    println("-------------------------")
    // Qual a média de calor de todas as receitas?
    println("A media de caloria de todas receitas é " + caloriatotal / data.count().toFloat())

    // Lista de dados simples
    //professor
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.") // pega a lista e tira todos repetidos
    println("Máximo: ${listaInteiros.maxOrNull()}.")  // maior numero da lista
    println("Mínimo: ${listaInteiros.minOrNull()}.")  // menor numero da lista

    // Eliminar receitas com mesmo nome
    println("-----------------------------")
    println("Lista sem repetir nomes de mesmo pratos")
    for (i in listasetpratos) {
        println(i)
    }
    println("-----------------------------")
    // Ordenar uma lista
    //professor
    listaInteiros.sorted()
    listaInteiros.sortedDescending()
    // Inverter uma lista
    println("-----------------------------")
    println("Lista em inversa")
    for (i in listapratos.reversed()) {
        println(i)
    }
    println("-----------------------------")

    //Par (chave, valor) de comidas com mais de 500 calorias (nome e calorias)

     data.filter { it.calorias>500 }.map { Pair(it.nome, it.calorias)}.forEach{(println("${it.first} - ${it.second}"))}
    // filtrar em data em calorias > 500 .map criar chave e valor, faça enquanto achar



    //Qual das receitas tem farinha como ingredientes

    var resultado = data.filter { ExisteIngrediente(it.ingredientes,"Farinha")}.forEach{(println(it.nome))}

    //filter precisa de um dado boleano entao necessidade da crianção de uma função
   //  fun ExisteIngrediente(List: List<Ingredientes>,nome: String) : Boolean   << funçao (existeIngre..)RECEBE>> list é do tipo lista <ingredientes>, recebe nome do tipo String e retorna um Boolean
    // {
    //    return   List.filter { it.nome == nome }.any()   filtro em list com parametro nome é = nome que vai receber?. verdade ou falso
    // }

}



