package lesson_2

fun main() {
    val departureHours: Int = 9
    val departureMinutes: Int = 39
    val travelTime: Int = 457

    val travelHours: Int = travelTime / 60
    val travelMinutes: Int = travelTime % 60

    var arrivalHours: Int = departureHours + travelHours
    var arrivalMinutes: Int = departureMinutes + travelMinutes

    if (arrivalMinutes > 59) {
        arrivalHours += arrivalMinutes / 60
        arrivalMinutes %= 60
    }

    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")
}