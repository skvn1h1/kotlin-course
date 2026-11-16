package lessons.lesson19.homeworks

/**
 * Задача 9. Проверяет список чисел:
 * 1) в списке нет null;
 * 2) ни один элемент, приведённый к Double, не равен 0.0.
 */
class ListValidator<T : Number> : Validator<List<T?>> {

    override fun validate(value: List<T?>): Boolean {
        return value.all { element ->
            element != null && element.toDouble() != 0.0
        }
    }
}
