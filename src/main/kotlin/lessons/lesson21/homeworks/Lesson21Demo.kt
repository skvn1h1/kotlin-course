package lessons.lesson21.homeworks

fun main() {
    println("--- Задача 1 ---")
    analyzeDataType("Kotlin")
    analyzeDataType(42)
    analyzeDataType(3.14)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(true)

    println("--- Задача 2 ---")
    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("Kotlin"))

    println("--- Задача 3 ---")
    println(getStringLengthOrZero("Kotlin"))
    println(getStringLengthOrZero(42))
    println(getStringLengthOrZero(null))

    println("--- Задача 4 ---")
    println(4.toSquare())
    println(4.2.toSquare())
    println("4.2".toSquare())

    println("--- Задача 5 ---")
    val mixedValues: List<Any> = listOf(1, 2.5, "Kotlin", 3, true, 0.5)
    println(sumIntOrDoubleValues(mixedValues))

    println("--- Задача 6 ---")
    tryCastToListAndPrint(listOf("Kotlin", 42, "Java"))
    tryCastToListAndPrint(mapOf("a" to 1))
}
