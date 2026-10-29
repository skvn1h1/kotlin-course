// Задание 1. Событие: вечеринка
class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Вечеринка проходит в месте: \"$location\", количество гостей: $attendees")
    }
}

fun main() {
    val party = Party("Центральный парк", 25)
    party.details()
}
