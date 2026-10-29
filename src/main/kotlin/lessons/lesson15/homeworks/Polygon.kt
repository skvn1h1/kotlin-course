package lessons.lesson15.homeworks

// Многоугольник — фигура, у которой появились стороны.
open class Polygon(
    name: String,
    color: String,
    val sidesCount: Int
) : Shape(name, color) {

    override fun describe() {
        super.describe()
        println("Количество сторон: $sidesCount")
    }
}
