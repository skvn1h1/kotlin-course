package lessons.lesson22.homeworks

/**
 * Задание 11. Собственное исключение, наследуемое от AssertionError.
 * AssertionError относится к Error, а не к Exception.
 */
class CustomAssertionError(message: String) : AssertionError(message)
