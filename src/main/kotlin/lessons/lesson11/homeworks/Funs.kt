package org.example.lessons.lesson11.homeworks


// 1. Не принимает аргументов и не возвращает значения:

fun doWork() {
}

// 2. Принимает два целых числа и возвращает их сумму:

fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает:

fun printText(text: String) {
    println(text)
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double:

fun getAverage(numbers: List<Int>): Double {
    return 0.0
}

// 5. Nullable строка → nullable длина, доступна только в текущем файле (private у функции верхнего уровня):

private fun getLength(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число:

fun getValue(): Double? {
    return null
}

// 7. Nullable список целых чисел, ничего не возвращает, доступна только в текущем файле:

private fun processNumbers(numbers: List<Int>?) {
}

// 8. Принимает целое число и возвращает nullable строку:

fun getName(number: Int): String? {
    return null
}

// 9. Не принимает аргументов и возвращает список nullable строк:

fun getNames(): List<String?> {
    return emptyList()
}

// 10. Nullable строка и nullable число → nullable Boolean:

fun checkData(text: String?, number: Int?): Boolean? {
    return null
}

// Задачи на написание кода
// 11. Умножение на 2:

fun multiplyByTwo(number: Int): Int {
    return number * 2
}

//12. Проверка на чётность:

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

//13. Вывод чисел от 1 до n:

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

//14. Поиск первого отрицательного числа:

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 15. Вывод строк из списка с остановкой на null:

fun processList(items: List<String?>) {
    for (item in items) {
        if (item == null) {
            return
        }
        println(item)
    }
}