fun main(){
    val greetingFunction:(String) -> String = { playerName ->
        val currentYear = 2021
        "歡迎光臨 SimVillage ，$playerName！ (copyrigth $currentYear)"
    }
    println(greetingFunction("李政龍"))
}