package lessons.lesson19.homeworks

/**
 * Задача 1. Возвращает средний элемент списка.
 * Если среднего элемента нет (чётное количество элементов или пустой список),
 * возвращает null.
 */
fun <T> getMiddleElement(list: List<T>): T? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}
