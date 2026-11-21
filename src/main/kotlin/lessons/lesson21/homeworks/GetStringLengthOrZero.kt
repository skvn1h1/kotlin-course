package lessons.lesson21.homeworks

/**
 * Задача 3. Возвращает длину строки, если аргумент можно привести к String.
 * Для null и для остальных типов возвращает 0.
 */
fun getStringLengthOrZero(value: Any?): Int {
    val text = value as? String
    return text?.length ?: 0
}
