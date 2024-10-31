package lesson_1

fun main() {
    val secInHour: Int = 3600
    val secInMin: Int = 60
    val sec: Int = 6480

    val hours: Int = sec / secInHour
    val minutes: Int = (sec % secInHour) / secInMin
    val seconds: Int = sec % secInMin

    println("Время, проведенное в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
}