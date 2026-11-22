package lessons.lesson22.homeworks

/**
 * Задание 12. Провоцирует IndexOutOfBoundsException, ловит его
 * и выбрасывает собственное WrappedIndexException.
 */
fun demonstrateWrappedIndexException() {
    try {
        val numbers = listOf(10, 20, 30)
        println(numbers[5])
    } catch (e: IndexOutOfBoundsException) {
        println("Поймано исходное исключение: ${e.message}")
        println("Выбрасываем собственное исключение WrappedIndexException")
        throw WrappedIndexException(e)
    }
}
