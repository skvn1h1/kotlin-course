package lessons.lesson20.homeworks

/**
 * Задача 5. Сдвигает каждый символ строки вперёд по таблице Unicode
 * на base позиций.
 */
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

/**
 * Задача 5. Сдвигает каждый символ строки назад по таблице Unicode
 * на base позиций — обратное действие для encrypt().
 */
fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}
