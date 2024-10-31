package lesson_2

fun main() {

    val countOfStudents: Int = 4
    val student1: Int = 3
    val student2: Int = 4
    val student3: Int = 3
    val student4: Int = 5

    val average: Double = (student1 + student2 + student3 + student4).toDouble() / countOfStudents

    println("Средний бал учеников в классе: %.2f".format(average))
}