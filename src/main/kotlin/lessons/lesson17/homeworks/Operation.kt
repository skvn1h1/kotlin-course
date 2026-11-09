package lessons.lesson17.homeworks

/**
 * Абстрактная операция калькулятора.
 *
 * Наследники задают символ операции и саму арифметику. Разбор выражения
 * вынесен в базовый класс, чтобы новые операции не дублировали проверки.
 */
abstract class Operation {

    /** Символ, по которому операция узнаёт себя в выражении. */
    protected abstract val symbol: String

    /**
     * Проверяет, применима ли операция к выражению.
     * Операция применима, если выражение делится на два числовых операнда.
     */
    fun isApplicable(expression: String): Boolean = split(expression).size == 2

    /**
     * Разбивает выражение на два операнда по символу операции.
     * Если подходящего разбиения нет, возвращает пустой список.
     *
     * Перебираем все вхождения символа, чтобы корректно обрабатывать
     * отрицательные числа: в "-3 - 4" первый минус относится к числу,
     * а не к операции.
     */
    fun split(expression: String): List<String> {
        require(symbol.isNotEmpty()) { "Символ операции не может быть пустым" }

        var index = expression.indexOf(symbol)
        while (index >= 0) {
            val left = expression.substring(0, index).trim()
            val right = expression.substring(index + symbol.length).trim()
            if (left.toDoubleOrNull() != null && right.toDoubleOrNull() != null) {
                return listOf(left, right)
            }
            index = expression.indexOf(symbol, index + symbol.length)
        }
        return emptyList()
    }

    /**
     * Выполняет операцию и всегда возвращает строку.
     * Разбор и проверка ввода общие для всех операций.
     */
    fun execute(expression: String): String {
        val operands = split(expression)
        require(operands.size == 2) {
            "выражение \"$expression\" не подходит для операции \"$symbol\""
        }

        val left = operands[0].toDouble()
        val right = operands[1].toDouble()
        return perform(left, right).toString()
    }

    /** Конкретная арифметика операции. Переопределяется наследниками. */
    protected abstract fun perform(left: Double, right: Double): Double
}
