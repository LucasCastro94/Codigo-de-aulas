package OrientaçãoTheObjeto

import java.lang.reflect.Field

class carro(val modelo: String, val VelocidadeMax: Int)
{
    var velocidadeAtual : Int = 0
        /*
    set(value){
        if(value>VelocidadeMax)
        {
            throw Exception("Velocidade maior do que permitida")
        }else this.velocidadeAtual = value
    }
}  */      //LOOP INFINITO toda vez q uso o this ele passa pelo SET

set(value){
    if(value>VelocidadeMax)
    {
        throw Exception("Velocidade maior do que permitida")

    }else
    field = value
}
}



fun main()
{
 val c1 = carro("Porche",20)
    c1.velocidadeAtual = 50
    println(c1.velocidadeAtual)

}