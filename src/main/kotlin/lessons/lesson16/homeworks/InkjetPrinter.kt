package lessons.lesson16.homeworks

// Струйный принтер печатает каждое слово своим цветом на своём фоне.
// Палитра перебирается по кругу, поэтому длинный текст получается разноцветным.
class InkjetPrinter : Printer() {

    private val palette = listOf(
        Colors.WHITE to Background.RED,
        Colors.BLACK to Background.YELLOW,
        Colors.BLUE to Background.WHITE,
        Colors.YELLOW to Background.BLUE,
        Colors.GREEN to Background.BLACK,
        Colors.WHITE to Background.PURPLE
    )

    override fun print(text: String) {
        var index = 0

        for (word in splitIntoWords(text)) {
            val (textColor, backgroundColor) = palette[index % palette.size]
            printColored(word, textColor, backgroundColor)
            index++
        }
    }
}
