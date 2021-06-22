fun main(){
    val greetingFunction:(String) -> String = {
        val currentYear = 2021
        "歡迎光臨 SimVillage ，$it！ (copyrigth $currentYear)"
    }
    println(greetingFunction("李政龍"))
}