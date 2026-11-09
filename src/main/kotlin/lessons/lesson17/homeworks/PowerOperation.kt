package lessons.lesson17.homeworks

import kotlin.math.pow

/**
 * Пример пользовательской операции: возведение в степень.
 * Подключается к калькулятору снаружи, без изменения его исходного кода.
 */
class PowerOperation : Operation() {
    protected override val symbol = "^"
    override fun perform(left: Double, right: Double): Double = left.pow(right)
}
