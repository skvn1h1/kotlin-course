package lessons.lesson20.homeworks

/**
 * Задача 6. Выводит буквы строки в верхнем регистре в столбик.
 * Перед каждой буквой печатается имя автора из списка.
 * Если авторов меньше, чем букв, имена повторяются по кругу.
 */
fun String.printLettersWithAuthors(usernames: List<String>) {
    val letters = filter { it.isLetter() }

    letters.forEachIndexed { index, char ->
        val author = if (usernames.isEmpty()) {
            "Автор не указан"
        } else {
            usernames[index % usernames.size]
        }
        println(author)
        println(char.uppercaseChar())
    }
}
