package lessons.lesson18.homeworks

/**
 * Задача 3. Абстрактный класс программируемого оборудования.
 * Наследуется от PowerableEquipment и реализует Programmable.
 */
abstract class ProgrammableEquipment(
    name: String
) : PowerableEquipment(name), Programmable {

    protected var currentProgram: String? = null

    override fun programAction(action: String) {
        if (!ensurePowerOn()) return
        currentProgram = action
        println("$name: выбрана программа \"$action\"")
    }

    override fun execute() {
        if (!ensurePowerOn()) return
        val program = currentProgram
        if (program == null) {
            println("$name: программа не выбрана")
            return
        }
        println("$name: выполняется программа \"$program\"")
    }
}
