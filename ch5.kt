import javafx.beans.binding.NumberBinding

fun main(){
    runSimulation("李政龍",  ::printConstructionCost) { playerName,numBulidings ->
        val currentYear = 2021
        println("新建 $numBulidings 棟房屋")
        "歡迎光臨 SimVillage ，$playerName！ (copyrigth $currentYear)"
    }

}
inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String)
{
    val numberBindings = (1..3).shuffled().last()
    costPrinter(numberBindings)
    println(greetingFunction(playerName, numberBindings))
}
fun printConstructionCost(numberBindings: Int){
    val cost = 500
    println("建造成本: ${cost * numberBindings}")
}