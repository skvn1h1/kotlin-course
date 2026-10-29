// Задание 5. Мероприятие: концерт
class Concert(
    val band: String,
    val venue: String,
    val cost: Double,
    val capacity: Int
) {
    // приватное поле: менять его снаружи нельзя, только через buyTicket()
    private var soldTickets = 0

    fun printInfo() {
        println(
            "Концерт группы \"$band\" в месте \"$venue\": билет стоит $cost, " +
                "вместимость зала $capacity, продано билетов: $soldTickets"
        )
    }

    fun buyTicket(): Boolean {
        if (soldTickets >= capacity) {
            return false
        }
        soldTickets++
        return true
    }
}

fun main() {
    val concert = Concert("Кино", "Лужники", 3500.0, capacity = 2)

    concert.printInfo()

    concert.buyTicket()
    concert.buyTicket()
    concert.printInfo()

    // третий билет купить уже нельзя — зал заполнен
    if (!concert.buyTicket()) {
        println("Извините, билеты распроданы!")
    }
    concert.printInfo()
}
