package lessons.lesson20.homeworks

/**
 * Задача 1. Возвращает пару из первого и последнего элемента массива.
 * Для пустого массива возвращает пару из null.
 */
fun <T : Number> Array<T>.firstAndLast(): Pair<T?, T?> {
    if (isEmpty()) {
        return null to null
    }
    return first() to last()
}
