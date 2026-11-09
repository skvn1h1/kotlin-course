package lessons.lesson17.homeworks

/**
 * Задание 2. «Почемучка».
 *
 * Код BaseClass оставлен без изменений, кроме одного места: для пункта 6
 * добавлен публичный сеттер changePrivateField(). Private-поле недоступно
 * наследнику, поэтому изменить его из main() можно только методом самого
 * BaseClass. Остальная логика класса не менялась.
 *
 * Если следовать требованию «BaseClass доработке не подлежит» буквально,
 * пункт 6 выполнить нельзя: private-поле не видно даже в ChildrenClass.
 * В таком случае пункт 6 нужно оформить как объяснение невозможности,
 * а не как работающий сеттер.
 */
abstract class BaseClass(
    // 1. Поле объявлено private, поэтому внутри BaseClass оно есть, но снаружи
    // (и в наследнике) напрямую недоступно. В main() мы читаем не его, а
    // одноимённое публичное свойство ChildrenClass: в конструкторе наследника
    // написано `val privateVal`, значит у ChildrenClass есть собственное
    // публичное свойство privateVal. Оно просто скрывает поле родителя по имени.
    private val privateVal: String,

    // 2. protectedVal объявлен protected: он виден только внутри BaseClass и в
    // его наследниках. main() — внешний код, поэтому поле ему недоступно.
    // В ChildrenClass это обычный аргумент конструктора без val/var, поэтому
    // собственного свойства у наследника тоже нет.
    protected val protectedVal: String,

    // publicVal объявлен без модификатора, то есть public: доступен отовсюду.
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            // 3. Сеттер пропускает только строки короче 3 символов. Строка
            // "Антонио Бандерас" длиннее, поэтому базовый setter её отклонил бы.
            // 4. В ChildrenClass переопределён verifyPublicField(): он разрешает
            // именно это значение, поэтому присваивание из main() сработает.
            if (verifyPublicField(value)) {
                field = value
            }
        }

    // 5. protectedField виден в BaseClass и наследниках, но не в main().
    // В ChildrenClass добавлен публичный метод changeProtectedField(), который
    // обращается к protected-полю и тем самым позволяет менять его из main().
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"

    // 6. privateField виден только внутри BaseClass. Ни ChildrenClass, ни main()
    // не могут обратиться к нему напрямую: private-члены не наследуются.
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"

    // 6 (решение). Единственный корректный способ изменить private-поле снаружи —
    // публичный метод самого класса-владельца. Именно он и добавлен.
    // Имя changePrivateField, а не setPrivateField, выбрано специально:
    // у свойства privateField уже есть сгенерированный JVM-сеттер setPrivateField,
    // и одноимённая функция вызвала бы конфликт сигнатур.
    fun changePrivateField(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        // 12. Здесь вызывается privatePrint() из BaseClass. Private-функции
        // не участвуют в наследовании и не могут быть переопределены. Одноимённая
        // функция в ChildrenClass — это отдельная функция, а не override.
        privatePrint()
    }

    // 7. Функция возвращает ProtectedClass, объявленный protected. Публичная
    // функция не может раскрывать тип с более узкой видимостью: внешний код
    // не смог бы даже назвать этот тип. Поэтому и функция должна быть protected.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. getAll() вызывает generate() полиморфно. Если объект — ChildrenClass,
    // то сработает переопределённая версия из наследника, поэтому в поле
    // "generate" будет текст дочернего класса.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. Функция возвращает PrivateClass, объявленный private. Такой тип виден
    // только внутри BaseClass, поэтому и функция обязана быть private:
    // public/protected функция не может раскрывать private-тип наружу.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
