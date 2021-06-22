fun main(){
    val greetingFunction = { playerName:String,numBulidings:Int ->
        val currentYear = 2021
        println("新建 $numBulidings 棟房屋")
        "歡迎光臨 SimVillage ，$playerName！ (copyrigth $currentYear)"
    }
    runSimulation("李政龍",greetingFunction)
}
fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String)
{
    val numberBindings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numberBindings))
}
