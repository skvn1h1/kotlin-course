package lessons.lesson15.homeworks

// Шкаф — мебель для хранения, добавляем дверцы и полки.
class Wardrobe(
    name: String,
    material: String,
    price: Int,
    val doorsCount: Int,
    val shelvesCount: Int
) : Furniture(name, material, price)
