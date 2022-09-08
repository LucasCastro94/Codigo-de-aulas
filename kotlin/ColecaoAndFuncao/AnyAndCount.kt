package ColecaoAndFuncao

fun main() {

    var data = GeraDados()

    // any --> Existe algo dentro dessa lista?  retorna true e false     /// ANY
    println("Tenho dados?: ${if(data.any())"Sim" else "Não"}") //true
    println(listOf<Int>().any())  // False

    //////////////////////////////////////////////////////////////////////////////////// COUNT
    println(data.count())  // Count retorna a quantidade de elementos (Quantas receitas?)

   ///////////////////////////////////////////////////////////////////////////////////// FIRST e LAST
    //First e Last recebe o primeiro elemento do conjunto e last o ultimo
    println("Primeira receita:"+data.first())
    println("Ultima receita:"+data.last())

    //pegar somente um atributo da primeira receita
    println("Nome:"+data.first().nome) // poderia pegar caloria ou ingredientes

    // em caso de lista nula
    println(arrayOf<Int>().firstOrNull())

    ////////////////////////////////////////////////////////////////////////////////// TAKE e TAKELAST

    println(data.take(2)) //Exibe os 2 primeiros elementos do conjunto
    println(data.takeLast(2)) // Exibe os 2 Ultimos elementos do conjunto

    ////////////////////////////////////////////////////////////////////////////////// SUM e SUMOF

   println(arrayOf<Int>(20,50,60,50).sum()) // sum soma uma lista de numeros

    println(data.sumOf { it.caloria }) // sumOf soma uma propriedade especifica
    //                  it = se refere a um objeto que esta sendo interado

    ////////////////////////////////////////////////////////////////////////////////// FILTER
   //sei fazer hamburguer?                                                                                             *filter precisa de predicado que retorne um boolean*
    println(data.filter { it.nome=="Hamburguer" }) // Filter passa por dentro do objeto (it.xxx) um por um

   //quantas receitas acima de 500 calorias?
    println("-->"+data.filter { it.caloria>500 })

    //Apenas algumas funções aceita predicado --> {it.xx } como sunOf,Filter,any,count,forEach,MaxOf,MinOf etc

   //data.sumOf { it.caloria } soma caloria
    //data.filter { it.nome=="a"} pesquise algum nome == a
    //data.any {it.caloria>200} existe alguma caloria >200
    //data.count{it.caloria>200} cont as caloria acima de 200
    //data.forEach{it.caloria}



///////////////////////////////////////////////////////////////////////////////////////// FOREACH
// forEach = Para cada item na minha lista
data.forEach{ println(it.nome) } // passara por todos elementos Nome da receita

//Combinando 2 funções forEach com Filter
    data.filter { it.caloria>1000}.forEach{ println("Receita acima de 1k Cal:"+it.nome) }



////////////////////////////////////////////////////////////////////////////////////////// MAX e MIN

    println(data.minOf{it.caloria}) // Menor de ( caloria )
    println(data.maxOf { it.caloria }) // Maior de (caloria)


   val MinMax = arrayOf<Int>(20,30,50,60)
    println(MinMax.maxOrNull()) // Retorna o maior o nulo
    println(MinMax.minOrNull()) // Retorna o menor ou nulo


    println(data.maxByOrNull { it.caloria }) // Retorna o elemento que pertence a maior caloria nao o valor



//////////////////////////////////////////////////////////////////////////////////////////////////////////  MAP
/* Diferença de filter e map, filter aplica um filtro no conjunto de elementos
    map faz uma transformação ele não usa a estrutura original, map tem acesso ao it e a todas propriedades
    é possivel criar novas estruturas com oq ja existe
*/

 println(data.map { it.nome }) // pegando o it.nome e mapeando,vai ficar somente os nomes na exibição




/////////////////////////////////////////////////////////////////////////////////////////////////////// AVERAGE  -> valor medio

    println(arrayOf<Int>(1,4,10,5).average())  // Imprimindo o valor medio

    println(data.map { it.caloria }.average()) // Utilizando o map para pegar a media da caloria



////////////////////////////////////////////////////////////////////////////////////////////////////////












}

fun GeraDados(): List<Receita> {  // Geradados* retorna uma Lista<Receitas>
    return listOf(  //retorne a lista de receita
        Receita(
            //     Nome          caloria        Lista de ingredientes
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            ),
        ),

        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )


        )


    )
}

data class Receita(var nome: String, var caloria: Int, var ingrediente: List<Ingrediente> = listOf()) //classe receita
data class Ingrediente(val Nome: String, val Qtd: Int) //Classe Ingrediente