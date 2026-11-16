package lessons.lesson20.homeworks

import kotlin.math.absoluteValue

/**
 * Задача 4. Проверяет, что текущее число отличается от other
 * не больше чем на deviation.
 */
fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = (toDouble() - other.toDouble()).absoluteValue
    return difference <= deviation.toDouble()
}
