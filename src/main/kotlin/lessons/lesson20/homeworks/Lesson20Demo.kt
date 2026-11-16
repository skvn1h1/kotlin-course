package lessons.lesson20.homeworks

fun main() {
    println("--- Задача 1 ---")
    val numbers = arrayOf(10, 20, 30)
    println(numbers.firstAndLast())
    val emptyNumbers = emptyArray<Int>()
    println(emptyNumbers.firstAndLast())

    println("--- Задача 2 ---")
    val ascending = mutableListOf(3, 1, 2)
    println("По возрастанию: ${ascending.sortAndReturn(true)}")
    println("Сам список после сортировки: $ascending")

    val descending = mutableListOf(3, 1, 2)
    println("По убыванию: ${descending.sortAndReturn(false)}")
    println("Сам список после сортировки: $descending")

    println("--- Задача 3 ---")
    val map: Map<String, List<Int>> = mapOf(
        "a" to listOf(1, 2, 3),
        "b" to listOf(4)
    )
    println(map.toIndexedStringMap(1))
    println(map.toIndexedStringMap(5))

    val nullableMap: Map<String, List<Int>>? = null
    println(nullableMap.toIndexedStringMap(0))

    println("--- Задача 4 ---")
    println(10.within(12, 2.0))
    println(10.within(13, 2.0))
    println(5.5.within(5.0, 0.5))
    println(100L.within(90L, 10L))

    println("--- Задача 5 ---")
    val original = "Hello, Kotlin!"
    val encrypted = original.encrypt(3)
    val decrypted = encrypted.decrypt(3)
    println("Исходная строка: $original")
    println("Зашифрованная: $encrypted")
    println("Расшифрованная: $decrypted")
    println("Совпадает с исходной: ${original == decrypted}")

    println("--- Задача 6 ---")
    "Привет".printLettersWithAuthors(listOf("@anna", "@ivan", "@olga"))
}
