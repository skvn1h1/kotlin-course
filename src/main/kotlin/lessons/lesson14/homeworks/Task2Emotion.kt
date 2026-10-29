// Задание 2. Аспект реальности: эмоция
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val strength = when {
            intensity >= 8 -> "очень сильная"
            intensity >= 4 -> "умеренная"
            else -> "слабая"
        }
        println("Эмоция \"$type\" — $strength (интенсивность $intensity из 10)")
    }
}

fun main() {
    Emotion("Радость", 9).express()
    Emotion("Удивление", 5).express()
    Emotion("Грусть", 2).express()
}
