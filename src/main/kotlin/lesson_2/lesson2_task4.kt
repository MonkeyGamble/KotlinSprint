package lesson_2

fun main() {
    val crystall: Int = 7
    val iron: Int = 11

    val crystallBuff: Int = (crystall * 0.2).toInt()
    val ironBuff: Int = (iron * 0.2).toInt()

    println("Кол-во бонусных материалов кристаллической руды: $crystallBuff")
    println("Кол-во бонусных материалов железной руды: $ironBuff")
}