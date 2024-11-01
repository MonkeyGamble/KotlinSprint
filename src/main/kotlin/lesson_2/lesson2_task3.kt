package lesson_2

fun main() {
    val departureHours: Int = 9
    val departureMinutes: Int = 39
    val travelTime: Int = 457
    val magicNumber: Int = 60

    val totalMinutesFromDayStart = departureHours * magicNumber + departureMinutes + travelTime

    val arrivalHours = (totalMinutesFromDayStart / magicNumber) % 24
    val arrivalMinutes = totalMinutesFromDayStart % magicNumber

    println("Время прибытия поезда: $arrivalHours:$arrivalMinutes")
}


//Сайт с расписанием поездов получает данные с сервера.
//Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
//Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль.