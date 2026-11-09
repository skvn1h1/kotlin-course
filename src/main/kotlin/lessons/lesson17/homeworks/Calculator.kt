package lessons.lesson17.homeworks

/**
 * Текстовый калькулятор.
 *
 * Принимает выражение вида "3 + 4" и возвращает результат строкой.
 * Пользовательские операции можно передать в конструктор или добавить
 * методом [addOperation]; исходный код калькулятора при этом не меняется.
 */
class Calculator(
    additionalOperations: List<Operation> = emptyList()
) {
    // Пользовательские операции проверяются первыми, затем стандартные.
    private val operations = mutableListOf<Operation>().apply {
        addAll(additionalOperations)
        addAll(defaultOperations())
    }

    /** Добавляет пользовательскую операцию с наивысшим приоритетом. */
    fun addOperation(operation: Operation): Calculator {
        operations.add(0, operation)
        return this
    }

    /**
     * Выбирает первую подходящую операцию и выполняет её.
     * Если операция не поддерживается или выражение некорректно,
     * возвращает строку с описанием ошибки.
     */
    fun calculate(expression: String): String {
        val operation = operations.firstOrNull { it.isApplicable(expression) }
            ?: return "Ошибка: выражение \"$expression\" не поддерживается"

        return try {
            operation.execute(expression)
        } catch (exception: IllegalArgumentException) {
            "Ошибка: ${exception.message}"
        }
    }

    // Стандартные операции скрыты внутри калькулятора:
    // снаружи эти классы недоступны.
    private class AdditionOperation : Operation() {
        protected override val symbol = "+"
        override fun perform(left: Double, right: Double) = left + right
    }

    private class SubtractionOperation : Operation() {
        protected override val symbol = "-"
        override fun perform(left: Double, right: Double) = left - right
    }

    private class MultiplicationOperation : Operation() {
        protected override val symbol = "*"
        override fun perform(left: Double, right: Double) = left * right
    }

    private class DivisionOperation : Operation() {
        protected override val symbol = "/"
        override fun perform(left: Double, right: Double): Double {
            require(right != 0.0) { "деление на ноль" }
            return left / right
        }
    }

    private class RemainderOperation : Operation() {
        protected override val symbol = "%"
        override fun perform(left: Double, right: Double): Double {
            require(right != 0.0) { "остаток от деления на ноль" }
            return left % right
        }
    }

    private companion object {
        fun defaultOperations(): List<Operation> = listOf(
            AdditionOperation(),
            SubtractionOperation(),
            MultiplicationOperation(),
            DivisionOperation(),
            RemainderOperation()
        )
    }
}
