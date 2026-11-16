package lessons.lesson19.homeworks

/**
 * Задача 7. Проверяет, что строка не null, не пустая
 * и не состоит только из пробелов.
 */
class StringValidator : Validator<String?> {

    override fun validate(value: String?): Boolean {
        return value != null && value.isNotBlank()
    }
}
