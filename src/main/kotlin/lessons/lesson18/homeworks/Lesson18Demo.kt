package lessons.lesson18.homeworks

/**
 * Демонстрация задачи 5.
 * Показываем, что установка температуры и программирование
 * не работают при выключенном питании.
 */
fun main() {
    demoRefrigerator()
    demoWashingMachine()
    demoKettle()
    demoOven()
}

private fun demoRefrigerator() {
    println("=== Холодильник ===")
    val fridge = Refrigerator("Холодильник Bosch")

    fridge.open()
    fridge.setTemperature(5)
    fridge.programAction("Экономный режим")

    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.programAction("Экономный режим")
    fridge.execute()
    fridge.emitLight()
    fridge.close()
    fridge.completeLiteEmission()
    fridge.powerOff()
    println()
}

private fun demoWashingMachine() {
    println("=== Стиральная машина ===")
    val washer = WashingMachine("Стиральная машина LG", capacity = 7)

    washer.setTemperature(40)
    washer.programAction("Быстрая стирка")

    washer.powerOn()
    washer.connectToWaterSupply()
    washer.connectToDrain()
    washer.fillWater(10)
    washer.setTemperature(40)
    washer.programAction("Быстрая стирка")
    washer.setTimer(30)
    washer.execute()
    washer.getWater(5)
    washer.drain()
    washer.powerOff()
    println()
}

private fun demoKettle() {
    println("=== Чайник ===")
    val kettle = Kettle("Чайник Tefal", capacity = 2)

    kettle.setTemperature(100)
    kettle.powerOn()
    kettle.fillWater(3)
    kettle.setTemperature(100)
    kettle.setTimer(5)
    kettle.execute()
    kettle.programAction("Кипячение")
    kettle.execute()
    kettle.getWater(1)
    kettle.powerOff()
    println()
}

private fun demoOven() {
    println("=== Духовка ===")
    val oven = Oven("Духовка Electrolux")

    oven.open()
    oven.setTemperature(180)
    oven.powerOn()
    oven.setTemperature(180)
    oven.programAction("Выпечка")
    oven.setTimer(45)
    oven.execute()
    oven.emitLight()
    oven.close()
    oven.completeLiteEmission()
    oven.powerOff()
}
