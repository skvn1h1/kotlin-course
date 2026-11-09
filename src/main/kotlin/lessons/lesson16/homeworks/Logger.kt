package lessons.lesson16.homeworks

// Задание 5. Логгер с перегруженными методами log().
class Logger {

    // Базовый вариант: сообщение с префиксом INFO.
    fun log(message: String) {
        printLog(LogLevel.INFO, message)
    }

    // Перегрузка 1: сообщение с явно указанным уровнем.
    fun log(level: LogLevel, message: String) {
        printLog(level, message)
    }

    // Перегрузка 2: список сообщений, каждое с уровнем INFO.
    fun log(messages: List<String>) {
        for (message in messages) {
            printLog(LogLevel.INFO, message)
        }
    }

    // Перегрузка 3: исключение выводится как ошибка.
    fun log(exception: Exception) {
        printLog(LogLevel.ERROR, exception.message ?: "Неизвестная ошибка")
    }

    private fun printLog(level: LogLevel, message: String) {
        val line = "[${level.name}] $message"

        when (level) {
            LogLevel.INFO -> println(line)
            LogLevel.WARNING -> printColored(line, Colors.YELLOW)
            LogLevel.ERROR -> printColored(line, Colors.WHITE, Background.RED)
            LogLevel.DEBUG -> printColored(line, Colors.CYAN)
        }
    }
}
