package lesson_5

import kotlin.random.Random

fun main() {
    val firstNum = Random.nextInt(0, 42)
    var secondNum = Random.nextInt(0, 42)
    var thirdNum = Random.nextInt(0, 42)

    while (secondNum == firstNum) {
        secondNum = Random.nextInt(0, 42)
    }

    while (thirdNum == firstNum || thirdNum == secondNum) {
        thirdNum = Random.nextInt(0, 42)
    }

    val winningNumbers = listOf(firstNum, secondNum, thirdNum)

    var userInputNumbers = mutableSetOf<Int>()
    while (userInputNumbers.size < 3) {
        print("Введите число от 0 до 42: ")
        val userInput = readln().toInt()
        userInputNumbers.add(userInput)
    }

    val matchingNumbers = userInputNumbers.intersect(winningNumbers.toSet())
    val countMatchingNumbers = matchingNumbers.size

    val result = when (countMatchingNumbers) {
        3 -> "Вы угадали все числа и выиграли ДЖЕКПОТ!!!"
        2 -> "Вы угадали 2 числа и получаете приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }

    println(result)
    println("Выигрышные числа: $winningNumbers")
}


//Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь вводит числа через консоль.
//
//Требования к программе:
//
//- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
//- Поочередно введенные пользователем числа должны также храниться в списке.
//- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.
//
//В зависимости от количества угаданных чисел программа выводит результат:
//
//- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
//- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
//- Если угадано одно число, пользователю выплачивается утешительный приз.
//- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
//- В конце игры вне зависимости от результата программа выводит выигрышные числа.