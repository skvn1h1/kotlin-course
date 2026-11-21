package lessons.lesson21.homeworks

/**
 * Задача 6. Пытается привести аргумент к List<*> и печатает строки из него.
 * Для элементов других типов выводит предупреждение.
 * При неудачном приведении сообщает об ошибке и не прерывает программу.
 */
fun tryCastToListAndPrint(value: Any) {
    val list = value as? List<*>
    if (list == null) {
        println("Ошибка: значение не является списком")
        return
    }

    for (item in list) {
        if (item is String) {
            println(item)
        } else {
            println("Предупреждение: элемент не является строкой: $item")
        }
    }
}
