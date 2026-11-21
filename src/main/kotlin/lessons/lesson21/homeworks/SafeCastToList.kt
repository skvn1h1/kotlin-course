package lessons.lesson21.homeworks

/**
 * Задача 2. Возвращает размер списка, если аргумент можно безопасно
 * привести к List. Если приведение не удалось, возвращает -1.
 */
fun safeCastToList(value: Any): Int {
    val list = value as? List<*>
    return if (list == null) -1 else list.size
}
