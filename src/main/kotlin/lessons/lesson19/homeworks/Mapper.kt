package lessons.lesson19.homeworks

/**
 * Задача 3. Преобразование одного элемента типа T в элемент типа R
 * и списка элементов типа T в список элементов типа R.
 */
interface Mapper<T, R> {
    fun transform(value: T): R
    fun transformList(values: List<T>): List<R>
}
