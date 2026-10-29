package lessons.lesson15.homeworks

// Письменный стол — стол с ящиками.
class Desk(
    name: String,
    material: String,
    price: Int,
    legsCount: Int,
    val drawersCount: Int
) : Table(name, material, price, legsCount)
