package lessons.lesson22.homeworks

/**
 * Задание 9. Вызывает каждую функцию из задания 8 и ловит её исключение
 * отдельным блоком catch.
 */
fun catchAllExceptions() {
    try {
        throwNullPointerException()
    } catch (e: NullPointerException) {
        println("Поймано: NullPointerException — ${e.message}")
    }

    try {
        throwIndexOutOfBoundsException()
    } catch (e: IndexOutOfBoundsException) {
        println("Поймано: IndexOutOfBoundsException — ${e.message}")
    }

    try {
        throwClassCastException()
    } catch (e: ClassCastException) {
        println("Поймано: ClassCastException — ${e.message}")
    }

    try {
        throwIllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        println("Поймано: IllegalArgumentException — ${e.message}")
    }

    try {
        throwNumberFormatException()
    } catch (e: NumberFormatException) {
        println("Поймано: NumberFormatException — ${e.message}")
    }

    try {
        throwIllegalStateException()
    } catch (e: IllegalStateException) {
        println("Поймано: IllegalStateException — ${e.message}")
    }

    try {
        throwOutOfMemoryError()
    } catch (e: OutOfMemoryError) {
        println("Поймано: OutOfMemoryError — ${e.message}")
    }

    try {
        throwStackOverflowError()
    } catch (e: StackOverflowError) {
        println("Поймано: StackOverflowError — ${e.message}")
    }
}
