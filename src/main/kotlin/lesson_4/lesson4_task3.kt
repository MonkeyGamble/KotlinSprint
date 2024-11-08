package lesson_4

const val IS_SUNNY: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "зима"

fun main() {


    val weatherTodayIsSunny: Boolean = true
    val tentIsOpenNow: Boolean = true
    val humidityNow: Int = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${
                    weatherTodayIsSunny == IS_SUNNY
                            && tentIsOpenNow == IS_AWNING_OPEN
                            && humidityNow == HUMIDITY
                            && seasonNow != SEASON
                }"
    )
}
