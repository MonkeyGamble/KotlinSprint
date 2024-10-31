package lesson_2

import kotlin.math.pow

fun main() {
    val startSum: Int = 70000
    val percent: Double = 16.7
    val depositTerm = 20

//    var resultSum: Double = startSum.toDouble()
//    for (i in 1..depositTerm) {
//        resultSum += resultSum * (percent / 100)
//    }

    val resultSum = startSum * (1 + percent / 100).pow(depositTerm.toDouble())

    println("Размер вклада через $depositTerm лет: %.3f".format(resultSum))
}