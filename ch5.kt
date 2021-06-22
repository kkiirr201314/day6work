fun main(){
    val greetingFunction:() -> String = {
        val currentYear = 2021
        "歡迎光臨 SimVillage ，鎮長！ (copyrigth $currentYear)"
    }
    println(greetingFunction())
}