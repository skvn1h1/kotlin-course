package lessons.lesson21.homeworks

/**
 * Задача 5. Суммирует все значения Int и Double в списке.
 * Элементы других типов пропускаются.
 */
fun sumIntOrDoubleValues(values: List<Any>): Double {
    var sum = 0.0
    for (value in values) {
        when (value) {
            is Int -> sum += value
            is Double -> sum += value
        }
    }
    return sum
}
