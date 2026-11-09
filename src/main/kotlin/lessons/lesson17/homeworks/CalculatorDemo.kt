package lessons.lesson17.homeworks

/**
 * Тестовые случаи для калькулятора.
 * Проверяем стандартные операции, пользовательскую операцию
 * и корректную обработку неподдерживаемых выражений.
 */
private fun assertCalculation(calculator: Calculator, expression: String, expected: String) {
    val actual = calculator.calculate(expression)
    println("$expression = $actual")
    check(actual == expected) {
        "Для выражения \"$expression\" ожидалось \"$expected\", получено \"$actual\""
    }
}

fun main() {
    val calculator = Calculator()

    println("--- Стандартные операции ---")
    assertCalculation(calculator, "3 + 4", "7.0")
    assertCalculation(calculator, "10 - 3", "7.0")
    assertCalculation(calculator, "6 * 7", "42.0")
    assertCalculation(calculator, "8 / 2", "4.0")
    assertCalculation(calculator, "7 % 4", "3.0")
    assertCalculation(calculator, "2.5 + 0.5", "3.0")
    assertCalculation(calculator, "-3 + 4", "1.0")

    println("--- Пользовательская операция через конструктор ---")
    val extendedCalculator = Calculator(listOf(PowerOperation()))
    assertCalculation(extendedCalculator, "2 ^ 10", "1024.0")
    assertCalculation(extendedCalculator, "3 + 4", "7.0")

    println("--- Пользовательская операция через addOperation() ---")
    calculator.addOperation(PowerOperation())
    assertCalculation(calculator, "3 ^ 2", "9.0")

    println("--- Обработка ошибок ---")
    assertCalculation(calculator, "3 & 4", "Ошибка: выражение \"3 & 4\" не поддерживается")
    assertCalculation(calculator, "1 / 0", "Ошибка: деление на ноль")
    assertCalculation(calculator, "3 + 4 + 5", "Ошибка: выражение \"3 + 4 + 5\" не поддерживается")

    println("Все тесты пройдены")
}
