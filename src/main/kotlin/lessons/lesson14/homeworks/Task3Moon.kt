// Задание 3. Природное явление: луна
// object создаёт синглтон — Луна одна, экземпляры создавать не нужно
object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Луна видна на небе, текущая фаза: $phase")
        } else {
            println("Луна сейчас не видна на небе")
        }
    }
}

fun main() {
    Moon.showPhase()
}
