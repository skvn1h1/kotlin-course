package lessons.lesson21.homeworks

/**
 * Задача 4. Возвращает квадрат числа. Число может прийти как Int, Long,
 * Double или как строка, которую можно преобразовать в Double.
 */
fun Any.toSquare(): Double {
    val number = when (this) {
        is Number -> toDouble()
        is String -> toDouble()
        else -> throw IllegalArgumentException("Ожидалось число или строка с числом")
    }
    return number * number
}
