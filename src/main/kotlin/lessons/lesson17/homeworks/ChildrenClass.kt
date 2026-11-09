package lessons.lesson17.homeworks

class ChildrenClass(
    // 1. `val` превращает аргумент конструктора в публичное свойство наследника.
    // Это отдельное свойство, а не доступ к private-полю BaseClass: имена просто
    // совпадают. Именно его main() и читает через child.privateVal.
    val privateVal: String,

    // 2 и 10. Здесь нет val/var, поэтому protectedVal — только аргумент
    // конструктора, а не свойство. Он передаётся в BaseClass, где становится
    // protected-полем. Из main() это поле недоступно.
    protectedVal: String,

    // 10. publicVal — тоже только аргумент конструктора. Но в BaseClass он
    // объявлен как `val publicVal`, то есть публичное свойство. Оно наследуется,
    // поэтому main() может читать его через объект ChildrenClass.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. getAll() не объявлена здесь, но она public в BaseClass. Публичные
    // члены родителя наследуются и доступны через объект наследника.

    // 4. Базовый setter publicField пропускает строки короче 3 символов.
    // Переопределяем проверку: разрешаем "Антонио Бандерас", но сохраняем
    // исходное поведение для всех остальных значений.
    override fun verifyPublicField(value: String): Boolean {
        return value == "Антонио Бандерас" || super.verifyPublicField(value)
    }

    // 5. Публичный сеттер для protected-поля BaseClass. Наследник имеет право
    // обращаться к protected-полям, поэтому может изменить protectedField.
    // Имя changeProtectedField, а не setProtectedField, выбрано специально:
    // у свойства protectedField уже есть унаследованный JVM-сеттер с таким именем.
    fun changeProtectedField(value: String) {
        protectedField = value
    }

    // 12. Одноимённая private-функция. Это НЕ переопределение: private-функции
    // не наследуются и не могут быть open/override. Поэтому printText() из
    // BaseClass продолжает вызывать свою privatePrint().
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    // 8. Переопределение generate(): getAll() вызывает его полиморфно,
    // поэтому в поле "generate" окажется текст наследника.
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val child = ChildrenClass(
        privateVal = "privateVal наследника",
        protectedVal = "protectedVal",
        publicVal = "publicVal"
    )

    // 1. Читается публичное свойство ChildrenClass, а не private-поле BaseClass.
    println("child.privateVal = ${child.privateVal}")

    // 2. protectedVal из main() недоступен:
    // println(child.protectedVal) // Ошибка компиляции

    // 10. publicVal — унаследованное публичное свойство BaseClass.
    println("child.publicVal = ${child.publicVal}")

    // 3–4. Присваивание проходит благодаря переопределённому verifyPublicField().
    child.publicField = "Антонио Бандерас"

    // 5. Меняем protectedField через публичный сеттер наследника.
    child.changeProtectedField("protectedField изменён из main()")

    // 6. Меняем privateField через публичный сеттер BaseClass.
    child.changePrivateField("privateField изменён из main()")

    // 8. В поле generate — текст из ChildrenClass.
    println("--- getAll() ---")
    println(child.getAll())

    // 11. getAll() доступен, потому что унаследован от BaseClass.
    // 12. printText() печатает "Печать из класса BaseClass".
    println("--- printText() ---")
    child.printText()

    // 12. Прямой вызов privatePrint() невозможен: функция private.
    // child.privatePrint() // Ошибка компиляции
}
