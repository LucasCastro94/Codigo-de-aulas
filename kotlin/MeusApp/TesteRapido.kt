package MeusApp

import java.sql.Array

fun main() {

   class pessoaSexo(var nome: String, var idade: String)

   var lista : MutableList<pessoaSexo> = mutableListOf()

   lista.add(pessoaSexo("ana","10"))
   lista.add(pessoaSexo("balacia","15"))
   lista.add(pessoaSexo("claudia","10"))
   lista.add(pessoaSexo("denovo","15"))

 lista.sortedBy { it.nome + it.idade}.forEach { println(""+it.nome+" "+it.idade) }

val newlist = mutableListOf<pessoaSexo>()




}




