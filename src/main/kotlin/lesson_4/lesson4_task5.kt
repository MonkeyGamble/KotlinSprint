package lesson_4

const val SHIP_IS_DAMAGED: Boolean = false
const val SHIP_CREW_MIN: Int = 55
const val SHIP_CREW_MAX: Int = 70
const val BOXES_OF_FOOD: Int = 50
const val WEATHER_IS_GOOD: Boolean = true

fun main() {
    println("Поврежден ли корабль:")
    val isShipDamaged: Boolean = readln().toBoolean()
    println("Введите текущий состав экипажа:")
    val shipCrew: Int = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val boxesOfFood: Int = readln().toInt()
    println("Благоприятны ли метеоусловия?")
    val isWeatherGood = readln().toBoolean()

    val longTermVoyage: Boolean =
        (isShipDamaged == SHIP_IS_DAMAGED)
                && (shipCrew in SHIP_CREW_MIN..SHIP_CREW_MAX)
                && (boxesOfFood > BOXES_OF_FOOD)
                && (isWeatherGood == WEATHER_IS_GOOD)
    val shortTermVoyage: Boolean =
        SHIP_CREW_MAX && (isWeatherGood == WEATHER_IS_GOOD)
                && (boxesOfFood >= BOXES_OF_FOOD)

    if (longTermVoyage) {
        println("Корабль может отплыть в долгосрочное плавание")
    } else if (shortTermVoyage) {
        println("Корабль может отплыть в плавание")
    } else {
        println("Корабль не может отплыть")
    }
}
