package lesson_5

import kotlin.random.Random

fun main() {

    val firstNum = Random.nextInt(0, 42)
    var secondNum = Random.nextInt(0, 42)

    while (secondNum == firstNum) {
        secondNum = Random.nextInt(0, 42)
    }

    print("Введите первое число: ")
    val userNum1 = readln().toInt()

    print("Введите второе число: ")
    val userNum2 = readln().toInt()

    when {
        (userNum1 == firstNum || userNum1 == secondNum) && (userNum2 == firstNum || userNum2 == secondNum) ->
            println("Поздравляем! Вы выиграли главный приз!")

        (userNum1 == firstNum || userNum1 == secondNum) || (userNum2 == firstNum || userNum2 == secondNum) ->
            println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }

    println("Выигрышные числа: $firstNum $secondNum")
}


//Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
//Если угадать только одно – игрок получает утешительный приз.
//
//Напиши программу, проверяющую выигрыш.
//Пользователь должен вводить числа в консоль.
//Правильные числа заранее известны и хранятся в переменных.
//Оформить ввод текстовыми подсказками о том, что нужно вводить.
//Вывести отдельным сообщением, какие числа были нужны для победы.
//
//- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
//- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
//- если не угадано ничего, вывести “Неудача!”;
//- программа должна учитывать ввод чисел в обратном порядке.