package lessons.lesson16.homeworks

import kotlin.math.PI
import kotlin.math.sin

// Площадь треугольника по двум сторонам и углу между ними (в градусах):
// 0.5 * a * b * sin(угол).
class Triangle(
    val sideA: Double,
    val sideB: Double,
    val angleDegrees: Double
) : Shape("Треугольник") {
    override fun area(): Double {
        val angleRadians = angleDegrees * PI / 180
        return 0.5 * sideA * sideB * sin(angleRadians)
    }
}
