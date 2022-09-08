package MeusExercicios

fun converteAno(Ano: Int)  //uma função capaz de transformar anos em dias,neses,horas,minutos e segundos
{
    var dias: Int = 365
    var meses: Int = 12
    var horas: Int = 8760
    var minutos: Int = 525600
    var segundos: Int = 31536000
    println("Em ${Ano} Ano/s Existem..")
    println("Dias:" + Ano * dias)
    println("Meses:" + Ano * meses)
    println("Horas:" + Ano * horas)
    println("Minutos:" + Ano * minutos)
    println("Segundos:" + Ano * segundos)

}

fun retorna(str: String): Int                 //uma funçao que retorna o tanto de caracter
{
    return str.length
}
//fun retorna (str:String) = str.length    //metodo 1 linha

fun calccubo(cubo: Int)       //uam função que calcula um numero ao cubo
{
    println("Valor ao cubo:"+cubo*cubo*cubo)
}
//fun calccubo(cubo: Int) = cubo*cubo*cubo  //metodo 1 linha

fun convertkm(Km: Float) : Float  // converte milha em KM
{
    return Km*1.6f
}
//fun convertkm(Km: Float) = Km*1.6f   //metodo 1 linha

fun trocaA(str: String) : String  //uma função que troca todas letras "A" de uma string e retorna a String toda em letra minuscula
{
return str.lowercase().replace("a","X")
}



fun main() {
    converteAno(2)
    println("Quantidade de letra:"+retorna("Kleberson"))
    calccubo(2)
   println(""+ convertkm(100f) + "Km")
    println(trocaA("PASTELoucoca"))

}