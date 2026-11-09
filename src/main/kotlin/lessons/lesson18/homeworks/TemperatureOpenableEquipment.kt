package lessons.lesson18.homeworks

/**
 * Задача 4. Абстрактный класс оборудования с регулировкой температуры
 * и открывающейся дверцей. Наследуется от ProgrammableEquipment
 * и реализует TemperatureRegulatable и Openable.
 */
abstract class TemperatureOpenableEquipment(
    name: String,
    override val maxTemperature: Int
) : ProgrammableEquipment(name), TemperatureRegulatable, Openable {

    var currentTemperature: Int = 0
        protected set

    var isOpen: Boolean = false
        protected set

    override fun setTemperature(temp: Int) {
        if (!ensurePowerOn()) return
        if (temp !in 0..maxTemperature) {
            println("$name: температура $temp вне диапазона 0..$maxTemperature")
            return
        }
        currentTemperature = temp
        println("$name: установлена температура $temp")
    }

    override fun open() {
        if (isOpen) {
            println("$name уже открыто")
            return
        }
        isOpen = true
        println("$name открыто")
    }

    override fun close() {
        if (!isOpen) {
            println("$name уже закрыто")
            return
        }
        isOpen = false
        println("$name закрыто")
    }
}
