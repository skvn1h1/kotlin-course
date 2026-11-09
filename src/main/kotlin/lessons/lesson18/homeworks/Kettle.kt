package lessons.lesson18.homeworks

/**
 * Задача 5. Чайник.
 * Наследует температуру и открывающуюся крышку, дополнительно работает с водой.
 */
class Kettle(
    name: String,
    override val capacity: Int
) : TemperatureOpenableEquipment(name, maxTemperature = 100),
    WaterContainer,
    Timable {

    private var waterAmount = 0

    override fun fillWater(amount: Int) {
        if (amount <= 0) {
            println("$name: количество воды должно быть положительным")
            return
        }
        val added = minOf(amount, capacity - waterAmount)
        waterAmount += added
        println("$name: набрано $added л воды (в баке $waterAmount из $capacity)")
    }

    override fun getWater(amount: Int) {
        if (amount <= 0) {
            println("$name: количество воды должно быть положительным")
            return
        }
        val released = minOf(amount, waterAmount)
        waterAmount -= released
        println("$name: слито $released л воды (в баке $waterAmount из $capacity)")
    }

    override fun setTimer(time: Int) {
        if (time <= 0) {
            println("$name: время таймера должно быть положительным")
            return
        }
        println("$name: таймер установлен на $time мин")
    }
}
