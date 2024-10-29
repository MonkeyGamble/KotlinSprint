package lesson_1

fun main(){
    val sec: Int = 6480
    val hours: Int = (sec/3600).toInt()
    val minutes = ((sec - 3600)/60).toInt()
    val seconds = sec - hours*3600  - minutes*60

    println("Время, проведенное в космосе: 0$hours:$minutes:0$seconds")
}