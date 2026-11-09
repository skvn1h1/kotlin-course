package lessons.lesson18.homeworks

/**
 * Задача 5. Стиральная машина.
 * Дополнительно работает с водой, сливом и таймером.
 */
class WashingMachine(
    name: String,
    override val capacity: Int
) : TemperatureOpenableEquipment(name, maxTemperature = 90),
    WaterContainer,
    WaterConnection,
    Drainable,
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

    override fun connectToWaterSupply() {
        println("$name: подключено к водопроводу")
    }

    override fun connectToDrain() {
        println("$name: подключено к сливу")
    }

    override fun drain() {
        println("$name: выполняется слив воды ($waterAmount л)")
        waterAmount = 0
    }

    override fun setTimer(time: Int) {
        if (time <= 0) {
            println("$name: время таймера должно быть положительным")
            return
        }
        println("$name: таймер установлен на $time мин")
    }
}
