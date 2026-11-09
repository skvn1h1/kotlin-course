package lessons.lesson16.homeworks

// Лазерный принтер печатает каждое слово чёрными буквами на белом фоне.
class LaserPrinter : Printer() {
    override fun print(text: String) {
        for (word in splitIntoWords(text)) {
            printColored(word, Colors.BLACK, Background.WHITE)
        }
    }
}
