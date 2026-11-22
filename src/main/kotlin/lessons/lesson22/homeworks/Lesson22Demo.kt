package lessons.lesson22.homeworks

fun main() {
    println("--- Задания 8 и 9 ---")
    catchAllExceptions()

    println("--- Задание 10 ---")
    val arguments: List<Any?> = listOf(null, "abc", 42, " ", "ab", "-5", "7")
    for (argument in arguments) {
        println("Аргумент: $argument")
        try {
            checkFantasticArgument(argument)
        } catch (e: Throwable) {
            println("Повторно выброшено: ${e::class.simpleName}")
        }
    }

    println("--- Задание 12 ---")
    try {
        demonstrateWrappedIndexException()
    } catch (e: WrappedIndexException) {
        println("Поймано собственное исключение: ${e.message}")
        println("Причина: ${e.cause?.let { it::class.simpleName }}")
    }

    println("--- Задание 11 ---")
    // Это исключение специально не ловится, поэтому программа завершится
    throw CustomAssertionError("Это исключение создано в задании 11")
}
