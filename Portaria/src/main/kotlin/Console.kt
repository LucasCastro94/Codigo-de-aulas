class Console {

    fun readInt(msg: String): Int {
        var retorno: Int? = null // definindo retorno como nulo

        do {
            print(msg)  //msg vem de portaria
            val info = readLine()

            if (info != null && info != "") {

                retorno = info.toIntOrNull()    // retorno é = info-> Int ou Null

                if (retorno == null || retorno <= 0) {
                    println("Valor invalido")

                }

            } else println("Valor invalido")

        } while (retorno == null || retorno <= 0)

        return retorno
    }


    fun ReadString(msg: String): String {
        var retorno: String? = null
        do {
            print(msg)  //msg vem de portaria
            val info = readLine()

            if (info != null && info != "") {
                retorno = info.lowercase()
            } else {
                println("Valor invalido")
            }


        } while (retorno == null)
        return retorno


    }

    fun validaCod(str: String): String {
        println(str)
        val cod = readLine()!!

        return cod

    }

}