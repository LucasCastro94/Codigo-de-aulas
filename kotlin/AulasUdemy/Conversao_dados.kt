

/*
TAMANHO DO TIPO DE DADOS
Double 64
float 32
Long 64
Int 32
Short 16
Byte 8
 */

import java.lang.Exception

fun main ()
{
    var Num1: Int = 32000
    var num2: Float = 2.5f
    var mult: Float

    //convertendo um inteiro para o tipo float
    mult = Num1.toFloat()*num2

    println(mult)

    var str1: String = "12"
    var somando: Int

    //convertendo String para um inteiro
    somando = str1.toInt()*2

    println(somando)

//Criando o comando exceções

    try
    {
        println("loleoe".toInt())
    } catch (e: Exception){
        println("Tentativa falha na conversão de uma String para int")

    }



}