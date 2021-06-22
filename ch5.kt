fun main(){
    val greetingFunction:(String,Int) -> String = { playerName,numBulidings ->
        val currentYear = 2021
        println("新建 $numBulidings 棟房屋")
        "歡迎光臨 SimVillage ，$playerName！ (copyrigth $currentYear)"
    }
    println(greetingFunction("李政龍",2))
}