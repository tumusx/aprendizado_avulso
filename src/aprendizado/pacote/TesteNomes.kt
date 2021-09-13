package aprendizado.pacote
import java.util.Scanner

import java.util.*
/*
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
/*fun aglobarVals(){
    val nomeSigno = nomeRandon()
    val food = sigNome(nomeSigno)
    val idade = 15
    println("idade é verdadeira....${aprovacaoPar(idade)}")
    println("Quem se chama $nomeSigno pertence ao signo $food ")

}*/
    /*fun main(args: Array<String>){
    aglobarVals()*/


fun exp(rapido: String = "fast") { //criando uma variavel padrão para o parametro --> vamos evitar de escrever muitas ver~soes de sobrecarga do mesmo código//
    println("rapido $rapido")


}
fun aprovacaoPar(idade: Int=15, seriEscolar:Int= 2, termiCo: String= "30"): Boolean{
    return when{
        idade >= 15 -> false
        seriEscolar > 2 -> false
        termiCo >="30" -> true

      else-> true
    }


}
fun aglobarVals(){
    val nomeSigno = nomeRandon()
    val food = sigNome(nomeSigno)
    val idade = 15
    println("idade é verdadeira....${aprovacaoPar(idade)}")
    println("Quem se chama $nomeSigno pertence ao signo $food ")

}
fun main(){
    aprovacaoPar()
    aglobarVals()
    exp() //chamando a função sem nada
    exp("devagar") //chamando a função e passando sem o nomear o parametro
    exp(rapido= "como tartaruga") //chamando a função e nomeando o parametro --> rapido,

}*/
fun main(args: Array<String>){
    val listagemNome = listOf("Jose", "Carlos", "Joao", "gilberto")
    val listagemNome2 = listOf("Rock", "Josilvado", "Legs", "Çklesg")
   /* val map = listagemNome2.asSequence().map {
        println("acess: $it")
        it
    }*/
    val lazyMap2 = listagemNome2.asSequence().filter {it[0] == 'J'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
    /*val map = listagemNome.asSequence().filter { it [0] == 'g' }.map {
        println("acess: $it")
        println("aguma cosa: ${map.toList()}")*/

//filtros

    val listNomes = listagemNome.filter { it [0] == 'J' }
    println(listagemNome.filter { it[0]=='J'}) //imprimindo so os que começam com a letra J
    val ListNomes2 = listagemNome2.asSequence().filter { it[0]== 'J' }
    val alguma = ListNomes2.toList()
   /* println("algo: $map")
    println("algo: ${map.first()}")
    println("algo: ${map.toList()}")*/
    println("Nova lista: $alguma ")
    println("nomes: $listNomes")

}
