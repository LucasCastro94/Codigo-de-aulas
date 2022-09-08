package `Mais sobre Função`

class person(val nome:String)
{
   infix fun isName(str: String) : Boolean {
        return nome==str
    }
}

infix fun Int.metadeDe(valor: Int) = valor / 2 == this  // funçao de int


fun main()
{
100.metadeDe(200)
    200 metadeDe 500    // infix permite utilizar os valores diretos

    val person: person = person("Lucas")
    person isName "lucas"    // infix se aplica a classes tbm o correto seria --> person.isName("lucas")

}