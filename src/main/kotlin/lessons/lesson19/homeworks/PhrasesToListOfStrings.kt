package lessons.lesson19.homeworks

/**
 * Задача 4. Преобразует строку с фразой в список слов.
 * Слова разделяются пробелом; пустые слова отбрасываются.
 */
class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun transform(value: String): List<String> {
        return value.split(" ").filter { it.isNotEmpty() }
    }

    override fun transformList(values: List<String>): List<List<String>> {
        return values.map { transform(it) }
    }
}
