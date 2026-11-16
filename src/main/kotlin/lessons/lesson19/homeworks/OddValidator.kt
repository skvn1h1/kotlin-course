package lessons.lesson19.homeworks

/**
 * Задача 8. Проверяет число.
 *
 * В названии класса — OddValidator, поэтому проверяется нечётность.
 * В тексте задания написано «число чётное»; если нужна именно чётность,
 * замените условие на value % 2 == 0.
 */
class OddValidator : Validator<Int> {

    override fun validate(value: Int): Boolean {
        return value % 2 != 0
    }
}
