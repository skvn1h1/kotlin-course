package lessons.lesson21.homeworks

/**
 * Задача 1. Определяет тип аргумента и выводит сообщение о нём.
 * Тип проверяется через оператор is.
 */
fun analyzeDataType(value: Any) {
    when (value) {
        is String -> println("Это строка: $value")
        is Number -> println("Это число: $value")
        is List<*> -> println("Это список, количество элементов: ${value.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${value.size}")
        else -> println("Неизвестный тип данных")
    }
}
