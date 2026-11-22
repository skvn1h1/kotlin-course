package lessons.lesson22.homeworks

/**
 * Задание 10. Выполняет с аргументом действия, которые могут выбросить
 * шесть разных исключений по порядку: NullPointerException,
 * IndexOutOfBoundsException, ClassCastException, IllegalArgumentException,
 * NumberFormatException, IllegalStateException.
 *
 * Ловится всё через Throwable, затем исключение перебрасывается дальше.
 */
fun checkFantasticArgument(value: Any?) {
    try {
        val text = value!!.toString()                 // 1. NullPointerException

        val words = listOf("один", "два", "три")
        println("Слово из списка: ${words[text.length]}") // 2. IndexOutOfBoundsException

        val string = value as String                  // 3. ClassCastException

        require(string.isNotBlank()) {
            "Строка не должна быть пустой"
        }                                             // 4. IllegalArgumentException

        val number = string.toInt()                    // 5. NumberFormatException

        check(number > 0) {
            "Число должно быть положительным"
        }                                             // 6. IllegalStateException

        println("Переданный аргумент фантастически хорош!")
    } catch (e: Throwable) {
        when (e) {
            // NumberFormatException наследуется от IllegalArgumentException,
            // поэтому его нужно проверять раньше.
            is NumberFormatException -> println("Исключение: NumberFormatException")
            is IllegalArgumentException -> println("Исключение: IllegalArgumentException")
            is NullPointerException -> println("Исключение: NullPointerException")
            is IndexOutOfBoundsException -> println("Исключение: IndexOutOfBoundsException")
            is ClassCastException -> println("Исключение: ClassCastException")
            is IllegalStateException -> println("Исключение: IllegalStateException")
            else -> println("Исключение: ${e::class.simpleName}")
        }

        throw e
    }
}
