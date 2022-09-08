package Exercise

import org.junit.Assert
import org.junit.Test

class CountVowelAndConsonants {

   @Test
   fun CountVowel()
    {
        Assert.assertEquals(11,CountVowel("Todo projeto a base de teste"))
    }

   @Test fun CountConsonants()
    {
        Assert.assertEquals(14,CountConsonants("Programar e nunca desistir!"))
    }

   @Test fun VowelAndConsonants()
   {
       val Phrase = "Ola mundo, tudo bem ?"

       Assert.assertEquals(7, CountVowel(Phrase))
       Assert.assertEquals(8, CountConsonants(Phrase))
   }

    @Test fun CountVowelFilter()
    {
        Assert.assertEquals(8,CountVowelFilter("Minha frase preferida"))
    }


    }
