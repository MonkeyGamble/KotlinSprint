package lesson_4

const val SHIP_IS_DAMAGED: Boolean = false
const val SHIP_CREW_MIN: Int = 55
const val SHIP_CREW_MAX: Int = 70
const val BOXES_OF_FOOD: Int = 50
const val WEATHER_IS_GOOD: Boolean = true

fun main() {
    println("Поврежден ли корабль:")
    val shipIsDamaged: Boolean = readln().toBoolean()
    println("Введите текущий состав экипажа:")
    val shipCrew: Int = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val boxesOfFood: Int = readln().toInt()
    println("Благоприятны ли метеоусловия?")
    val weatherIsGood = readln().toBoolean()

    val longTermVoyage: Boolean =
        (shipIsDamaged == SHIP_IS_DAMAGED)
                && (shipCrew in SHIP_CREW_MIN..SHIP_CREW_MAX)
                && (boxesOfFood > BOXES_OF_FOOD)
                && (weatherIsGood == WEATHER_IS_GOOD)
    val shortTermVoyage: Boolean =
        (shipCrew == 70)
                && (weatherIsGood == WEATHER_IS_GOOD)
                && (boxesOfFood >= BOXES_OF_FOOD)

    if (longTermVoyage) {
        println("Корабль может отплыть в долгосрочное плавание")
    } else if (shortTermVoyage) {
        println("Корабль может отплыть в плавание")
    } else {
        println("Корабль не может отплыть")
    }
}


//Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
//
//- корабль не имеет повреждений;
//- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
//- на борту есть более 50 ящиков провизии (не включительно);
//- погода благоприятна или неблагоприятна.
//
//Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
//
//- на борту рекомендованный состав экипажа 70 человек;
//- погода благоприятная;
//- на борту есть 50 и более ящиков провизии.
//
//В качестве входных данных используй информацию, введенную через консоль:
//
//- наличие повреждений корпуса (Boolean переменная);
//- текущий состав экипажа;
//- количество ящиков с провизией на борту;
//- благоприятность метеоусловий (Boolean переменная).
//
//Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
//Программа должна анализировать эти данные и выводить результат в консоль.
//Для анализа должно использоваться единое составное условие, состоящие только из логических операторов.
