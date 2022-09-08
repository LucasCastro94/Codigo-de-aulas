// vararg = varios parametros --> é como se fosse um vetor de tamanho indefinido
fun Somamedia(vararg notas: Float)
{
    // se variavel notas não estiver vazio faça
    if(notas.isNotEmpty())
    {
     var soma: Float = 0f

        // i recebe valor de notas[]
        for(i in notas)
        {
            soma += i

        }

        var media_aluno = (soma / notas.size)

        if (media_aluno>5)
        {
            println("Aluno Aprovado Media final:"+media_aluno)
        }else
            println("Aluno reprovado Media final:"+media_aluno)
    }

}

//  <T> serve para receber qualquer tipo de dado indefinido
fun <T> DiversidadeDados(vararg Dados: T )
{
   for (i in Dados)
   {
       println(i)
   }

}


fun main () {

    Somamedia(10f, 10f, 10f)

    //Exibindo qualquer tipo de dado
    DiversidadeDados("TesteString",23,44f,'c',false,true)




}


