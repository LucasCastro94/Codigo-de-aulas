package Exercise

import org.junit.Assert
import org.junit.Test


fun CountVowel (str: String) : Int
{
    val vowel = "aeiou"
    var vowel_count=0
    for(i in str) {
        if (i.lowercase() in vowel) {
            vowel_count++
        }
    }
    return  vowel_count
}


fun CountConsonants(str: String) : Int
{
    val conso = "qwrtypsdfghjklçzxcvbnm"
    var conso_count=0
    for(i in str) {
        if (i.lowercase() in conso) {
            conso_count++
        }
    }
    return  conso_count

}

fun CountVowelFilter(Str: String) = Str.filter { it.toLowerCase() in "aeiou" }.length
