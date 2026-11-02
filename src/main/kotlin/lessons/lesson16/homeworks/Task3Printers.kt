package lessons.lesson16.homeworks

// Демонстрация переопределения метода print() у разных принтеров.
fun main() {
    val text = "Полиморфизм позволяет разным принтерам печатать один и тот же текст " +
            "по-своему: каждое слово выводится отдельно, но результат остаётся понятным"

    println("Лазерный принтер:")
    LaserPrinter().print(text)

    println()
    println("Струйный принтер:")
    InkjetPrinter().print(text)
}
