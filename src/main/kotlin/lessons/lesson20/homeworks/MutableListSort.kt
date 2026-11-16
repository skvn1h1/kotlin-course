package lessons.lesson20.homeworks

/**
 * Задача 2. Сортирует изменяемый список по возрастанию или убыванию
 * и возвращает его неизменяемую копию. Сам список тоже меняется.
 */
fun <T : Comparable<T>> MutableList<T>.sortAndReturn(ascending: Boolean): List<T> {
    if (ascending) {
        sort()
    } else {
        sortDescending()
    }
    return toList()
}
