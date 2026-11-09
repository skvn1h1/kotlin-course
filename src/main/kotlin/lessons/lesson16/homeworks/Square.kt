package lessons.lesson16.homeworks

// Площадь квадрата: сторона * сторона.
class Square(val side: Double) : Shape("Квадрат") {
    override fun area(): Double = side * side
}
