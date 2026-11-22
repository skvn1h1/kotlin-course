package lessons.lesson22.homeworks

/**
 * Задание 1-8. Восемь фрагментов кода, которые приводят к исключениям и ошибкам.
 * Каждая функция специально содержит ошибку, чтобы её можно было поймать в задании 9.
 */

// 1. NullPointerException
fun throwNullPointerException() {
    val text: String? = null
    println(text!!.length) // !! у null даёт NullPointerException
}

// 2. IndexOutOfBoundsException
fun throwIndexOutOfBoundsException() {
    val numbers = listOf(1, 2, 3)
    println(numbers[5]) // индекса 5 в списке нет
}

// 3. ClassCastException
fun throwClassCastException() {
    val value: Any = "Kotlin"
    println(value as Int) // строку нельзя привести к Int
}

// 4. IllegalArgumentException
fun throwIllegalArgumentException() {
    require(false) { "Аргумент не подходит" } // require бросает IllegalArgumentException
}

// 5. NumberFormatException
fun throwNumberFormatException() {
    println("Kotlin".toInt()) // строку с буквами нельзя превратить в число
}

// 6. IllegalStateException
fun throwIllegalStateException() {
    check(false) { "Состояние не подходит" } // check бросает IllegalStateException
}

// 7. OutOfMemoryError
fun throwOutOfMemoryError() {
    // Массив такого размера невозможно создать, поэтому сразу возникает OutOfMemoryError
    val hugeArray = ByteArray(Int.MAX_VALUE)
    println(hugeArray.size)
}

// 8. StackOverflowError
fun throwStackOverflowError() {
    fun recurse(depth: Int): Int = recurse(depth + 1) // нет условия выхода
    println(recurse(0))
}
