package lessons.lesson15.homeworks

// Стол — мебель, у которой есть количество ножек.
open class Table(
    name: String,
    material: String,
    price: Int,
    val legsCount: Int
) : Furniture(name, material, price)
