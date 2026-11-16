package lessons.lesson19.homeworks

/**
 * Задача 2. Хранит список элементов типа T.
 * Новые элементы добавляются через add(), а наружу отдаётся
 * неизменяемая копия списка.
 */
class ListHolder<T>(
    initialElements: List<T> = emptyList()
) {
    private val elements = initialElements.toMutableList()

    fun add(element: T) {
        elements.add(element)
    }

    fun getAll(): List<T> {
        return elements.toList()
    }
}
