package lessons.lesson18.homeworks

/**
 * Задача 5. Духовка.
 * Наследует температуру и дверцу, дополнительно умеет светить и работать по таймеру.
 */
class Oven(
    name: String
) : TemperatureOpenableEquipment(name, maxTemperature = 250),
    Timable,
    LightEmitting {

    private var isLightOn = false

    override fun setTimer(time: Int) {
        if (time <= 0) {
            println("$name: время таймера должно быть положительным")
            return
        }
        println("$name: таймер установлен на $time мин")
    }

    override fun emitLight() {
        if (isLightOn) {
            println("$name: подсветка уже включена")
            return
        }
        isLightOn = true
        println("$name: подсветка включена")
    }

    override fun completeLiteEmission() {
        if (!isLightOn) {
            println("$name: подсветка уже выключена")
            return
        }
        isLightOn = false
        println("$name: подсветка выключена")
    }
}
