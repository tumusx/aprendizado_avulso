package aprendizado.pacote

import java.util.*

fun randomDay() : String {
    val semana = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return semana[Random().nextInt(semana.size)]
}
fun fishFood(day: String) : String {
   return when (day){
        "Monday"-> "granola"
        "Tuesday"-> "caviá"
        "Wednesday"-> "acerola"
        "Thursday" ->"açaí"
        "Friday"-> "goiaba"

        else ->  "nada"
    }
}
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Todas as $day e os peixeis comem $food")
}
fun main(args: Array<String>){
    feedTheFish()
}

