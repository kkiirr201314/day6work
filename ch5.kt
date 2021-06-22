fun main() {
    runSimulation()
}
fun runSimulation()
{
    val greetingFunction = ConfigureGreetingFunction()
    println(greetingFunction("李政龍"))
    println(greetingFunction("李政龍"))
}

fun ConfigureGreetingFunction(): (String) -> String {
    val structureType = "醫院"
    var numBulidings = 5
    return { playerName: String ->
        val currentYear = 2021
        numBulidings += 1
        println("新建 $numBulidings 間 $structureType")
        "歡迎光臨 SimVillage ，$playerName！ (copyrigth $currentYear)"
    }
}
