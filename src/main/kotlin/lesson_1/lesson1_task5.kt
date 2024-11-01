package lesson_1

const val SEC_IN_HOUR: Int = 3600
const val SEC_IN_MIN: Int = 60

fun main() {

    val sec: Int = 6480
    val hours: Int = sec / SEC_IN_HOUR
    val minutes: Int = (sec % SEC_IN_HOUR) / SEC_IN_MIN
    val seconds: Int = sec % SEC_IN_MIN

    println("Время, проведенное в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
}


//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
// - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.