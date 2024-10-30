package lesson_1

fun main(){
    val sec: Int = 6480
    val hours: Int = sec/3600
    val minutes: Int = (sec - 3600)/60
    val seconds: Int = sec % 60

    println("Время, проведенное в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
}