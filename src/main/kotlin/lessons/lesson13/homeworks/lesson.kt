package org.example.lessons.lesson13.homeworks

fun main() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    fun filter(collection: List<Int>): List<Int> {
        val result = mutableListOf<Int>()
        for (i in collection) {
            if (i in 7..17) result.add(i)
        }
        return result
    }

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers) // Вывод: [2, 4]
}

