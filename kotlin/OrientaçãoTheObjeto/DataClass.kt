class quadrado1(val area: Float)
{

}
data class Triangulo(val area: Float) // DataClass facilita a visualização de dados de uma classe // transita daodos

fun main()
{
   val q1 = quadrado1(10f)
    val q2 = quadrado1(10f)

    val t1= Triangulo(60f)
    val t2= Triangulo(60f)


    println(q1)
    println(t1)

    println(q1==q2)
    println(t1==t2) // Dataclass faz a comparação de valor e nao endereço de memoria

    // Utilizando o copy com dataclass
       val t3= t2.copy()

    println(""+t3+"<--Copiado")

}