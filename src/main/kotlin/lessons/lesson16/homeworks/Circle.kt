package lessons.lesson16.homeworks

import kotlin.math.PI

// Площадь круга: π * r².
class Circle(val radius: Double) : Shape("Круг") {
    override fun area(): Double = PI * radius * radius
}
