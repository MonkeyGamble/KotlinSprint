package lesson_4

fun main() {

    print("Введите номер дня тренировки: ")
    val dayOfTraining = readln().toInt()

    val isEven = dayOfTraining % 2 == 0

    println(
        """
          Упражнения для рук: ${!isEven}
          Упражнения для ног: $isEven
          Упражнения для спины: $isEven
          Упражнения для пресса: ${!isEven}
        """.trimIndent()
    )
}

