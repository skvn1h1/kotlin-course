package lessons.lesson15.homeworks

// Четырёхугольник — многоугольник с четырьмя сторонами.
// Добавляем ширину и высоту (например, для прямоугольника).
class Quadrilateral(
    name: String,
    color: String,
    val width: Double,
    val height: Double
) : Polygon(name, color, sidesCount = 4)
