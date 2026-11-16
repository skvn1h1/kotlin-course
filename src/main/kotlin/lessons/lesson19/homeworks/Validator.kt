package lessons.lesson19.homeworks

/**
 * Задача 6. Валидатор элемента типа T.
 */
interface Validator<T> {
    fun validate(value: T): Boolean
}
