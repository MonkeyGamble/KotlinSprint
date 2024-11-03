package lesson_4

fun main() {
    val averageLowWeight = 35
    val averageHighWeight = 100
    val averageHighVolume = 100

    var weight = 20
    var volume = 80

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > averageLowWeight && weight <= averageHighWeight && volume < averageHighVolume}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > averageLowWeight && weight <= averageHighWeight && volume < averageHighVolume}")
}


//При работе на таможенном терминале важно точно определить категорию каждого груза.
//Напиши программу, которая проверяет, соответствует ли груз категории "Average".
//Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг (включительно), и объем меньше 100 литров (не включительно).
//Создай программу, которая отображает соответствие данных груза категории "Average".
//Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
// укажи предварительно заданные параметры категории;
// проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
// сделай сравнение непосредственно внутри println() и без использования диапазонов.