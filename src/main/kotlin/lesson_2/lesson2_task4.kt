package lesson_2

fun main() {
    val crystall: Int = 7
    val iron: Int = 11
    val perc: Int = 20

    val crystallBuff: Int = (crystall * (perc / 100.0)).toInt()
    val ironBuff: Int = (iron * (perc / 100.0)).toInt()

    println("Кол-во бонусных материалов кристаллической руды: $crystallBuff")
    println("Кол-во бонусных материалов железной руды: $ironBuff")
}