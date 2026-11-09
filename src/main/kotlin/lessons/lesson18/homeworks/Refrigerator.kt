package lessons.lesson18.homeworks

/**
 * Задача 5. Холодильник.
 * Наследует регулировку температуры и дверцу, дополнительно умеет светить.
 */
class Refrigerator(
    name: String
) : TemperatureOpenableEquipment(name, maxTemperature = 8), LightEmitting {

    private var isLightOn = false

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
