package lessons.lesson16.homeworks

// Демонстрация переопределения метода area() у разных фигур.
fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 30.0)
    )

    for (shape in shapes) {
        val area = "%.2f".format(shape.area())
        println("${shape.name}: площадь = $area")
    }
}
