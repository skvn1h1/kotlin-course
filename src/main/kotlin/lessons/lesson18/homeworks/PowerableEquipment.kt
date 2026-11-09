package lessons.lesson18.homeworks

/**
 * Задача 2. Абстрактный класс включаемого оборудования.
 * Реализует интерфейс Powerable и хранит состояние питания.
 */
abstract class PowerableEquipment(
    val name: String
) : Powerable {

    var isPoweredOn: Boolean = false
        private set

    override fun powerOn() {
        if (isPoweredOn) {
            println("$name уже включено")
            return
        }
        isPoweredOn = true
        println("$name включено")
    }

    override fun powerOff() {
        if (!isPoweredOn) {
            println("$name уже выключено")
            return
        }
        isPoweredOn = false
        println("$name выключено")
    }

    /**
     * Проверка питания для наследников.
     * Установка температуры и программирование при выключенном питании
     * не имеют смысла, поэтому перед ними вызывается этот метод.
     */
    protected fun ensurePowerOn(): Boolean {
        if (!isPoweredOn) {
            println("$name выключено. Сначала включите питание.")
            return false
        }
        return true
    }
}
