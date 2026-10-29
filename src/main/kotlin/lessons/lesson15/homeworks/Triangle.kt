package lessons.lesson15.homeworks

// Треугольник — многоугольник, у которого всегда три стороны.
// Добавляем длины сторон.
class Triangle(
    name: String,
    color: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(name, color, sidesCount = 3)
