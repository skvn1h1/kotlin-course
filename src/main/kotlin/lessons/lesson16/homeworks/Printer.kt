package lessons.lesson16.homeworks

// Задание 3. Абстрактный принтер: каждый наследник печатает текст по-своему.
abstract class Printer {
    abstract fun print(text: String)

    // Общий для всех принтеров способ разбить фразу на слова.
    protected fun splitIntoWords(text: String): List<String> {
        return text.split(" ").filter { it.isNotEmpty() }
    }
}
