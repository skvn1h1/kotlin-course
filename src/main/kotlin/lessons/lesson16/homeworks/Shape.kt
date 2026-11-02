package lessons.lesson16.homeworks

// Задание 2. Абстрактная геометрическая фигура.
// Базовая площадь равна 0.0, наследники переопределяют формулу расчёта.
abstract class Shape(val name: String) {
    open fun area(): Double = 0.0
}
