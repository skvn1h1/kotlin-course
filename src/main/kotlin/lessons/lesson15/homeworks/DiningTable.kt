package lessons.lesson15.homeworks

// Обеденный стол — стол, за которым помещается несколько человек.
class DiningTable(
    name: String,
    material: String,
    price: Int,
    legsCount: Int,
    val seatsCount: Int
) : Table(name, material, price, legsCount)
