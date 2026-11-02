package lessons.lesson16.homeworks

// Демонстрация всех вариантов перегруженного метода log().
fun main() {
    val logger = Logger()

    logger.log("Приложение запущено")
    logger.log(LogLevel.WARNING, "Заканчивается место на диске")
    logger.log(LogLevel.ERROR, "Не удалось подключиться к базе данных")
    logger.log(LogLevel.DEBUG, "Загружено 42 записи")

    logger.log(listOf("Первый шаг выполнен", "Второй шаг выполнен"))

    logger.log(IllegalStateException("Файл настроек не найден"))
}
