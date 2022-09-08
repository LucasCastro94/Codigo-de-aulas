package OrientaçãoTheObjeto

class Computer (val ModelProcess: String)
{

 inner class Memory (val level: Int)   //Inner = Defini uma classe como interna
    {
        fun getMemory() : Int
        {

            println(ModelProcess)     // tem acesso ao modelprocess somente por causa do inner

            return 1024
        }
    }

}

fun main()
{
    val C : Computer.Memory = Computer("Intel").Memory(8024)

   C.getMemory()
}