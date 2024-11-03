package lesson_2

const val ONE_HUNDRED: Double = 100.0


fun main() {
    val crystall: Int = 7
    val iron: Int = 11
    val perc: Int = 20

    val crystallBuff: Int = (crystall * (perc / ONE_HUNDRED)).toInt()
    val ironBuff: Int = (iron * (perc / ONE_HUNDRED)).toInt()

    println("Кол-во бонусных материалов кристаллической руды: $crystallBuff")
    println("Кол-во бонусных материалов железной руды: $ironBuff")
}