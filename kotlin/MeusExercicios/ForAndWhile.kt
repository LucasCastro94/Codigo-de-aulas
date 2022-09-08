package MeusExercicios

fun Soma1a500()
{   var soma=0
    for(i in 1..500)
    {
        soma+=i
    }

    println(soma)
}

/*
Uma função que recebe um numero inteiro e imprima uma escada com tamanho de N numeros
EX: 4
X
XX
XXX
XXXX
*/
fun Escadinha()
{
    println("Quantos degraus deve ter a escada:")
    var numero = readLine()!!.toInt()

    for(i in 1..numero)
    {     println()
       for(j in 1..i)
       {
           print('X')
       }

    }
}


//considere uma caixa de agua de 2 mil litros, quantos balões de 7 litros cabem na caixa de agua sem o valor ser excedido?
fun CaixaAgua()
{
    val caixa = 2000
    var Litrosbaloes = 0
    var quantidadeBaloes = 0

    while(Litrosbaloes+7<caixa)
    {

        quantidadeBaloes++
        Litrosbaloes+=7


    }

    println("O total de litros adicionado na caixa foi:"+Litrosbaloes)
    println("Quantidade de balões necessario foi:"+quantidadeBaloes)



}


// FizzBuzz. Imprima os numeros de 1 a 50 em ordem crescente de acordo com a regra abaixo
// a) Quando um numero for divisivel por 3 imprima Buzz , b) Quando for divisivel por 5 imprimir Fizz
// c) Quando for divisivel por 3 e 5, imprimir FizzBuzz
fun Fizbus()
{
    for(i in 1..50)
    {
        if(i%3==0 && i%5==0)
        {
            println("I=${i} FizzBuzz")
        }
        else if (i%3==0)
        {
            println("I=${i} Buzz")
        }
        else if(i%5==0)
        {
            println("I=${i} Fizz")
        }
    }
}

fun inverteString()
{
  print("Informe uma palavra:")
    val palavra: String = readLine()!!
    var i =0
    var k = palavra.length-1

    while(k>=i)
    {
        print(palavra[k])
        k--
    }


}

fun verificaXandO(palavra: String) : Boolean
{


    var i=0
   var contaX =0
    var contaO =0

    while(i<=palavra.length-1)
    {
        if(palavra.lowercase()[i]=='x')
        {
            contaX++
        }
        else if( palavra.lowercase()[i]=='o')
        {
            contaO++
        }
        i++
    }

    return contaX==contaO && contaO!=0


}


/*
Ana e paula recebem 10.000 reais de salario
Investiram 5% do seus salarios em bolsa de valores
Ana investiu na empresa que trabalha recebera 100% a mais de investimento de sua empresa como incentivo e tera o lucro de 0,2% ao mês
Paula investira de maneira propria e rendera 0.8% ao mês
Com quantos meses paula vai ter um retorno maior que ana?
*/
fun ANaAndPaula()
{
    val salario = 10000f
    var rendAna=0f
    var rendPaula=0f
    var meses=0


    do{
        meses++
        rendAna+=(salario*0.05f*2)+(rendAna*0.002f)
        rendPaula+=(salario*0.05f)+(rendPaula*0.008f)

        //println("${meses}Mês..Ana ${rendAna}$........Paula ${rendPaula}$")


   }while (rendPaula<rendAna)

   println("Paula demorara ${meses}Meses para render mais que Ana equivalente a ${meses/12}Anos")


}

fun main()
{
   // Soma1a500()
    //Escadinha()
    //CaixaAgua()
    //Fizbus()
    //inverteString()
    //println(verificaXandO("xooxoxx"))
    //ANaAndPaula()

}