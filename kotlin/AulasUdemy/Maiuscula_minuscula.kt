fun main ()
{
    val nome ="LUCAS"
    val sobrenome="Fernades"

    //exibindo miniscula
    println((""+nome+" "+sobrenome).lowercase())

    //exibindo maiuscula
    println((""+nome+" "+sobrenome).uppercase())


   //Exibindo primeira e ultima letra maiuscula
    var tam = nome.length

       for (i in 0..tam-1)
       {
         if(nome[i]==nome[0] || nome[i]==nome[tam-1])
         {
             print(nome[i].uppercase())
         }
           else
         {  print(nome[i].lowercase())}


       }


}