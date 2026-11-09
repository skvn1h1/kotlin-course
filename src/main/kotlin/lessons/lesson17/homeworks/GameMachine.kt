package lessons.lesson17.homeworks

/**
 * Задание 1. Игровой автомат.
 *
 * Поля с изменяемым состоянием (включён, ОС загружена, сеанс оплачен, выручка)
 * объявлены private var: менять их можно только через публичные методы.
 * Неизменяемые характеристики (цвет, модель, владелец, телефон поддержки)
 * доступны снаружи только на чтение. Пин-код, цена сеанса, наличие джойстика
 * и список игр скрыты, потому что это внутренние данные автомата.
 */
class GameMachine(
    val color: String,
    val model: String,
    val owner: String,
    val supportPhone: String,
    private val pinCode: String,
    private val sessionPrice: Double,
    private val hasJoystick: Boolean,
    installedGames: List<String>
) {
    private var isOn = false
    private var isOsLoaded = false
    private var isSessionPaid = false
    private var revenue = 0.0
    private val games = installedGames.toList()

    /**
     * Включает автомат. Загрузка ОС происходит автоматически,
     * снаружи вызвать её отдельно нельзя.
     */
    fun turnOn(): Boolean {
        if (isOn) {
            println("Автомат уже включён")
            return false
        }
        isOn = true
        loadOs()
        println("Автомат включён")
        return true
    }

    /**
     * Выключает автомат и завершает работу ОС.
     * Неоплаченный сеанс при этом сбрасывается.
     */
    fun turnOff(): Boolean {
        if (!isOn) {
            println("Автомат уже выключен")
            return false
        }
        shutdownOs()
        isOn = false
        println("Автомат выключен")
        return true
    }

    /** Загружает ОС. Приватный метод: пользователь не управляет этим напрямую. */
    private fun loadOs() {
        isOsLoaded = true
        println("ОС загружена")
    }

    /** Завершает работу ОС. Приватный метод: вызывается только из turnOff(). */
    private fun shutdownOs() {
        isOsLoaded = false
        isSessionPaid = false
        println("ОС завершила работу")
    }

    /** Показывает список установленных игр и возвращает его копию. */
    fun showGames(): List<String> {
        if (!isOn || !isOsLoaded) {
            println("Список игр недоступен: автомат выключен или ОС не загружена")
            return emptyList()
        }
        println("Установленные игры: ${games.joinToString(", ")}")
        return games.toList()
    }

    /**
     * Запускает игру. Проверяет, что автомат включён, ОС загружена,
     * джойстик подключён, сеанс оплачен и игра установлена.
     */
    fun startGame(gameName: String): Boolean {
        if (!isOn || !isOsLoaded) {
            println("Сначала включите автомат")
            return false
        }
        if (!hasJoystick) {
            println("Джойстик не подключён")
            return false
        }
        if (!isSessionPaid) {
            println("Игровой сеанс не оплачен")
            return false
        }
        if (gameName !in games) {
            println("Игра \"$gameName\" не установлена")
            return false
        }

        isSessionPaid = false
        println("Игра \"$gameName\" запущена")
        return true
    }

    /** Оплачивает один игровой сеанс и зачисляет деньги в выручку автомата. */
    fun paySession(): Boolean {
        if (!isOn) {
            println("Автомат выключен")
            return false
        }
        if (isSessionPaid) {
            println("Сеанс уже оплачен")
            return false
        }

        revenue += sessionPrice
        isSessionPaid = true
        println("Сеанс оплачен: $sessionPrice")
        return true
    }

    /**
     * Забирает наличные из автомата. Без корректного пин-кода деньги не выдаются.
     * Возвращает сумму, которую удалось получить.
     */
    fun withdrawCash(pin: String): Double {
        if (pin != pinCode) {
            println("Неверный пин-код")
            return 0.0
        }
        return openSafeAndGiveCash(revenue)
    }

    /** Открывает сейф и выдаёт наличные. Приватный метод: доступен только по пин-коду. */
    private fun openSafeAndGiveCash(amount: Double): Double {
        val cash = amount.coerceIn(0.0, revenue)
        revenue -= cash
        println("Сейф открыт. Выдано: $cash")
        return cash
    }
}
