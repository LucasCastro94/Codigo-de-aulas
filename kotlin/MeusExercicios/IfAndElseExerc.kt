package MeusExercicios

fun funExercida(funcao: String, exp: Float)
{   var salario: Float =0f

    if (funcao == "Gerente")
        {
           if(exp<2)
           {
            salario=2000f
               println("Salario do ${funcao} é igual a:"+salario)
           }
            else{ salario=3000f
               println("Salario do ${funcao} é igual a:"+salario)

           }
        }

    else if(funcao=="Coordenadores")
    {
      if(exp<1)
      {
          salario=1500f
          println("Salario do ${funcao} é igual a:"+salario)
      }else{
          salario=1800f
          println("Salario do ${funcao} é igual a:"+salario)
      }
    }

    else if(funcao=="Engenheiro de software")
    {
        salario=1000f
        println("Salario do ${funcao} é igual a:"+salario)
    }
    else if(funcao=="Estagiarios")
    {
          salario=500f
        println("Salario do ${funcao} é igual a:"+salario)
    }
    else println("Função desconhecida:"+funcao)
}

fun main()
{
funExercida("Coordenadores",0.2f)
    funExercida("Estagiarios",1f)
    funExercida("pedreiro",5f)
}