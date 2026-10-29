package lessons.lesson15.homeworks

// Стул — мебель для сидения, добавляем подлокотники.
class Chair(
    name: String,
    material: String,
    price: Int,
    val hasArmrests: Boolean
) : Furniture(name, material, price)
