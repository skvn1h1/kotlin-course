package org.example.lessons.lesson08.homeworks

fun main() {
    // Задание 1
    val testPhrases = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача",
    )
    for (phrase in testPhrases) {
        println(transformPhrase(phrase))
    }

    // Задание 2
    printLogDateTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    // Задание 3
    println(maskCardNumber("4539 1488 0343 6467"))

    // Задание 4
    println(maskEmail("username@example.com"))

    // Задание 5 — оба примера из условия
    println(extractFileName("C:/Пользователи/Документы/report.txt"))
    println(extractFileName("D:/good.themes/dracula.theme"))

    // Задание 6
    println(makeAbbreviation("Котлин лучший язык программирования"))

    // Задание 7
    println(capitalizeWords("Котлин лучший язык программирования"))
}
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст
// более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять
// фразу.
//
//Правила проверки и преобразования:
//
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
//Примеры Тестовых Фраз:
//
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"

fun transformPhrase(phrase: String): String {
    val trimmed = phrase.trim()
    val wordCount = if (trimmed.isEmpty()) 0 else trimmed.split(Regex("\\s+")).size

    return when {
        trimmed.contains("невозможно", ignoreCase = true) ->
            trimmed.replace(
                "невозможно",
                "совершенно точно возможно, просто требует времени",
                ignoreCase = true
            )

        trimmed.startsWith("Я не уверен", ignoreCase = true) ->
            "$trimmed, но моя интуиция говорит об обратном"

        trimmed.contains("катастрофа", ignoreCase = true) ->
            trimmed.replace("катастрофа", "интересное событие", ignoreCase = true)

        trimmed.endsWith("без проблем", ignoreCase = true) ->
            trimmed.replace("без проблем", "с парой интересных вызовов на пути", ignoreCase = true)

        wordCount == 1 -> "Иногда, $trimmed, но не всегда"

        else -> trimmed
    }
}

//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но
// формат всегда такой). Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй
// indexOf или split для получения правой части сообщения.

fun printLogDateTime(logLine: String) {
    val rightPart = logLine.split(" -> ").last()
    val dateAndTime = rightPart.split(" ")
    println(dateAndTime[0])
    println(dateAndTime[1])
}

//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех,
// символами "*".

fun maskCardNumber(cardNumber: String): String {
    var result = ""
    for (i in cardNumber.indices) {
        result += if (i < cardNumber.length - 4 && cardNumber[i].isDigit()) '*' else cardNumber[i]
    }
    return result
}

//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку
// "username [at] example [dot] com", используя функцию replace()

fun maskEmail(email: String): String =
    email.replace("@", " [at] ").replace(".", " [dot] ")

//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым).
// Извлеките название файла с расширением.

fun extractFileName(path: String): String =
    path.substring(path.lastIndexOf('/') + 1)

//У вас есть фраза, например "Котлин лучший язык программирования" (можlет быть любой с разделителями слов - пробел).
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
//
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.

fun makeAbbreviation(phrase: String): String {
    var result = ""
    for (word in phrase.split(" ")) {
        result += word.first().uppercase()
    }
    return result
}

//Напишите метод, который преобразует строку из нескольких слов в строку, где каждое слово начинается с заглавной буквы
// а все остальные - строчные. Используй перебор, анализ символов и замену букв на заглавную с помощью метода uppercase()
// для конкретной буквы.

fun capitalizeWords(phrase: String): String {
    var result = ""
    for (i in phrase.indices) {
        val current = phrase[i]
        result += if (i == 0 || phrase[i - 1] == ' ') current.uppercase() else current.lowercase()
    }
    return result
}