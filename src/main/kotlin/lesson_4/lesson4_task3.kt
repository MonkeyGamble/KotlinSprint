package lesson_4

fun main() {
    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val weatherTodayIsSunny: Boolean = true
    val tentIsOpenNow: Boolean = true
    val humidityNow: Int = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${
                    weatherTodayIsSunny == weatherIsSunny
                            && tentIsOpenNow == tentIsOpen
                            && humidityNow == humidity
                            && seasonNow != currentSeason
                }"
    )
}


//На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
//Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.
//
//Критерии благоприятных условий включают:
//- наличие солнечной погоды;
//- открытый тент;
//- влажность воздуха составляет 20%;
//- текущее время года - не зима.
//
//Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых? true/false”
//
//Для проверки работы программы, инициализируй переменные следующими значениями:
//
//- погода сегодня - солнечная;
//- тент на данный момент - открыт;
//- влажность воздуха - 20%;
//- текущее время года - зима.
//
//И типами данных - boolean, boolean, int, String.