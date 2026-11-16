package lessons.lesson20.homeworks

/**
 * Задача 3. Для nullable-словаря строит словарь с ключами-строками.
 * Значение берётся из списка по индексу index; если индекса нет,
 * значением будет null. Для null-словаря возвращает null.
 */
fun <K, V> Map<K, List<V>>?.toIndexedStringMap(index: Int): Map<String, V?>? {
    return this?.entries?.associate { (key, values) ->
        key.toString() to values.getOrNull(index)
    }
}
