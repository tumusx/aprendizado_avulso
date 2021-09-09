package aprendizado.pacote

import java.util.*

fun nomeRandon() : String{
   val semaRandon= arrayOf("Joao", "Carlos", "Silvio", "Raimundo", "Joaquin")
    return semaRandon[Random().nextInt(semaRandon.size)]
}

fun sigNome(names: String) : String{
   return when(names){
       "Joao" -> "Sagitario"
       "Carlos"-> "Touro"
       "Silvio"-> "Libras"
       "Raimundo"-> "Gemeos"
       "Joaquin"-> "Escoriao"
       else -> "Nada"
   }
}
fun aglobarVals(){
    val nomeSigno = nomeRandon()
    val food = sigNome(nomeSigno)
    println("Quem se chama $nomeSigno pertence ao signo $food ")

}
fun main(args: Array<String>){
    aglobarVals()
}
