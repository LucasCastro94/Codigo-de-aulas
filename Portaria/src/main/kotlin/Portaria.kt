class Portaria {

    private val Console = Console() //Private so fica dentro de portaria ngm acessa // Instanciando a função console

    fun controle()
    {
        val idade = Console.readInt("Qual é a sua idade: ") // Escrevendo msg e recebendo idade    fun(readInt)

        if(idade<18)
        {
            println("Negado, Entrada não permitida para menores de 18 anos")
            return
        }

        val TipoConvite = Console.ReadString("Qual tipo de convite: ") // Escrevendo msg e recebendo tipo de convite        fun(ReadString)

        if(TipoConvite.lowercase() == "normal" || TipoConvite.lowercase() == "premium" ||TipoConvite.lowercase() == "luxo")
        {
            val Valida = Console.validaCod("Informe o codigo do ingresso: ")
            if((TipoConvite == "normal" || TipoConvite == "premium") && (Valida.lowercase().startsWith("xl")) )
            {
                println("WELCOME!")
            }
            else if(TipoConvite == "luxo" && Valida.lowercase().startsWith("lx"))
            {
                println("Welcome")
            }
            else{
                println("Acesso negado!")
            }
        }else{
            println("Acesso negado,Convite invalido")
        }

    }

// normal e premium começa com XL e luxo com LX


}