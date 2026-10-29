package lessons.lesson15.homeworks

// Задание 1. Базовый класс "Геометрическая фигура".
// У любой фигуры есть название и цвет, и любая фигура может рассказать о себе.
open class Shape(
    val name: String,
    val color: String
) {
    open fun describe() {
        println("Фигура: $name, цвет: $color")
    }
}
