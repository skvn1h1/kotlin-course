package lessons.lesson15.homeworks

// Задание 3. Базовый класс "Мебель".
// Общие свойства: название, материал, цена. Общее поведение: рассказать о себе.
open class Furniture(
    val name: String,
    val material: String,
    val price: Int
) {
    fun describe() {
        println("Мебель \"$name\": материал — $material, цена — $price руб.")
    }
}
