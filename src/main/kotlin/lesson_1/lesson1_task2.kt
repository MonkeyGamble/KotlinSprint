package lesson_1

fun main(){
    val ordersCount: Int = 75
    val thanksForOrder: String = "Thank you for the order!"

    println("Количество заказов: $ordersCount")
    println(thanksForOrder)

    var employeesCount: Int = 2000
//  println("Количество работников: $employeesCount")
    employeesCount -= 1
    println("Количество работников: $employeesCount")
}