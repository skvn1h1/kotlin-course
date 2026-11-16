package lessons.lesson19.homeworks

/**
 * Задача 5. Меняет местами ключи и значения словаря.
 * Если значения повторяются, в результате останется последний ключ
 * для такого значения — это ограничение самого типа Map<V, K>.
 */
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}
