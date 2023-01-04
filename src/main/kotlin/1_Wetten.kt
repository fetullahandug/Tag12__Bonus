
fun main() {
    while(true){
        println("Wie viel möchtest du einsetzen ?\nEinsatz: ")
        var einsatz: Double = readln().toDouble()
        val ergebnis = einsatz * quote()
        println("Du hast $einsatz € eingesetzt und $ergebnis € gewonnen!")
        println()
    }
}

fun quote(): Double{
    val quoteList: List<Double> = listOf(
        0.0,
        0.5,
        0.0,
        0.0,
        0.25,
        0.0,
        2.0,
        1.5,
        1.5,
        3.0
    )

    return quoteList.random()
}