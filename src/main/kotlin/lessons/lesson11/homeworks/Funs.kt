package org.example.lessons.lesson11.homeworks


// 1. Не принимает аргументов и не возвращает значения.

fun e1() {
}

// 2. Принимает два целых числа и возвращает их сумму.

fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает.

fun printText(text: String) {
    println(text)
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double.

fun getAverage(numbers: List<Int>): Double {
    return numbers.sum().toDouble() / numbers.size
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.

private fun getLength(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число.

fun getValue(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.

private fun processNumbers(numbers: List<Int>?) {
}

// 8. Принимает целое число и возвращает nullable строку.

fun getName(number: Int): String? {
    return null
}

// 9. Не принимает аргументов и возвращает список nullable строк.

fun getNames(): List<String?> {
    return emptyList()
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun checkData(text: String?, number: Int?): Boolean? {
    return null
}

// Задачи на написание кода
// 11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(number: Int): Int {
    return number * 2
}

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном
// случае.

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число
// n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число
// в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить
// каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата
// значения.

fun processList(items: List<String?>) {
    for (item in items) {
        if (item == null) {
            return
        }
        println(item)
    }
}

fun main(){

}