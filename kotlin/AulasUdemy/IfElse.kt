fun maiorIdade(idade: Int) {
    if (idade >= 18) {
        println("É maior de idade " + idade)
    } else {
        println("É menor de idade " + idade)
    }
}


fun SalariosBonus(cargo: String, salario: Float) {



    if (cargo == "operador") {

        println("salario (operador) com bonus é :" + (salario * 1.05))
    } else if (cargo == "gerente") {

        println("salario (gerente) com bonus é :" + (salario * 1.25))
    }

    else {


        println("Salario ("+cargo+")"+" o salario é:"+salario)
    }
}


fun main() {

    maiorIdade(18)
    maiorIdade(15)
    maiorIdade(32)


    SalariosBonus("operador", 1500f)
    SalariosBonus("gerente", 10000f)
    SalariosBonus("free lance", 10000f)
    SalariosBonus("acionista", 100000f)



}