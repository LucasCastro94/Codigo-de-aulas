//any, Unit e Nothing

fun valores (value: Any)  // any recebe qualquer tipo de valor: int,float,long,byte,boolean etc..
// fun <T> valores (value: T) nesse momneto não faria diferença
{

}

fun valor(num: Int) : Unit {}     //Unit = não retorna nada


//Nothing so retorna excessão mais nada alem disso

fun main()
{
  valores("lucas")
    valores(12)
    valores(true)

}