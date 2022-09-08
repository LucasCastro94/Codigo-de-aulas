fun main()
{
    var Nome: String = "Lucas fernandes de castro"

    for(c in Nome)
    {
        print("  "+c)
    }

    println("")
    for(i in 1..10)
    {
        println(i)
    }
    println("")

    // step = va de N em N
    for(i in 1..10 step 2)
    {
        println(i)
    }

    // Conta de tras para frente
    for (i in 10 downTo 0)
        print(" "+i )
}