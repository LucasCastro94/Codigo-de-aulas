package MeusApp

fun main()
{   var SomaManual=0
    var somagauss: Float =0f
    var contador=0f

    for (i in 10..20)
    { contador++

      SomaManual+=i

        println(i)

    }
    //formula de gauss Ex: somar todos numeros de 10 a 20 a regra consiste em somar o primeiro valor com ultimo, vezes a divisao por 2 da quantidade total de numeros (10-20= 11 numeros)
    // 20+10 = 30  11/2 = 5.5 -->  30*5.5 = 165


    somagauss = (10f+20f) * (contador/2)

    println("Gauss "+somagauss)
    println("Manual "+SomaManual)

   contador=0f
    SomaManual=0



    for (i in 1..20 step 3)
    { contador++

        SomaManual+=i

        println(i)

    }
    // Nesse exemplo foi pulando de 3 em 3--> 1.4.7.10...19 .. mesma coisa pega o primeiro numero soma com ultimo, vezes a divisao por 2 da quantidade de numeros
    // 1+19 = 20   (1,4,7,10,13,16,19) = 7 numeros / 2 = 3,5    20*3,5=70
    somagauss = (1f+19f) * (contador/2f)
    println("Gauss: "+somagauss)
    println("Manual: "+SomaManual)

    //Formula gauss so pode ser utilizada quando existe um padrao de sequencia


}