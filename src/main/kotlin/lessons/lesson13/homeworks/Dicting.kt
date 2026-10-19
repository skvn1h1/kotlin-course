package org.example.lessons.lesson13.homeworks

fun main() {

    // ============================================================
    // ЗАДАЧА 1. Среднее время выполнения теста.
    // Метод: values — берём сразу все значения и считаем average().
    // ============================================================
    printHeader(1, "Среднее время выполнения теста")
    val testTimes = mapOf(
        "testLogin" to 3.0,
        "testLogout" to 1.5,
        "testProfile" to 4.5
    )
    val averageTime = testTimes.values.average()   // все значения -> среднее арифметическое
    println("Словарь: $testTimes")
    println("Среднее время выполнения теста: $averageTime сек.")
    println()

    // ============================================================
    // ЗАДАЧА 2. Список всех тестовых методов.
    // Метод: keys — множество всех ключей словаря.
    // ============================================================
    printHeader(2, "Список всех тестовых методов")
    val testMetadata = mapOf(
        "testLogin" to "author=Иван; priority=high",
        "testLogout" to "author=Анна; priority=low",
        "testSignup" to "author=Иван; priority=medium"
    )
    println("Все тестовые методы:")
    for (name in testMetadata.keys) {          // keys — только ключи, без значений
        println(" - $name")
    }
    println()

    // ============================================================
    // ЗАДАЧА 3. Добавить новый тест и его результат.
    // Метод: put(ключ, значение) — кладёт пару в ИЗМЕНЯЕМЫЙ словарь.
    // ============================================================
    printHeader(3, "Добавление нового теста в изменяемый словарь")
    val testResults = mutableMapOf(
        "testLogin" to "passed",
        "testLogout" to "failed"
    )
    println("До добавления:    $testResults")
    testResults.put("testSignup", "passed")    // put добавляет новую пару
    println("После добавления: $testResults")
    println()

    // ============================================================
    // ЗАДАЧА 4. Количество успешных тестов.
    // Метод: count { условие } — считает пары, подходящие под условие.
    // Здесь it — очередная пара «ключ-значение» (Map.Entry) из entries.
    // ============================================================
    printHeader(4, "Количество успешных тестов")
    val runResults = mapOf(
        "testLogin" to "passed",
        "testPayment" to "failed",
        "testLogout" to "passed",
        "testSearch" to "skipped"
    )
    val passedCount = runResults.count { it.value == "passed" }
    println("Словарь: $runResults")
    println("Успешных тестов: $passedCount")
    println()

    // ============================================================
    // ЗАДАЧА 5. Удалить запись об исправленном баге.
    // Метод: remove(ключ) — удаляет пару из изменяемого словаря.
    // ============================================================
    printHeader(5, "Удаление исправленного бага")
    val bugs = mutableMapOf(
        "BUG-101" to "исправлен",
        "BUG-102" to "в работе",
        "BUG-103" to "открыт"
    )
    println("До удаления:    $bugs")
    bugs.remove("BUG-101")                     // BUG-101 исправлен — удаляем его запись
    println("После удаления: $bugs")
    println()

    // ============================================================
    // ЗАДАЧА 6. Сообщение о странице и статусе её проверки.
    // Метод: forEach — перебирает все пары словаря (его entries);
    // (url, status) — распаковка пары сразу в две переменные.
    // ============================================================
    printHeader(6, "Сообщение о странице и статусе её проверки")
    val pageChecks = mapOf(
        "https://example.com" to "200 OK",
        "https://example.com/login" to "404 Not Found",
        "https://example.com/api" to "500 Server Error"
    )
    pageChecks.forEach { (url, status) ->
        println("Страница $url — статус проверки: $status")
    }
    println()

    // ============================================================
    // ЗАДАЧА 7. Сервисы, чьё время ответа выше порога.
    // Метод: filterValues — оставляет пары, где ЗНАЧЕНИЕ подходит под условие.
    // ============================================================
    printHeader(7, "Сервисы со временем ответа выше порога")
    val serviceResponseTimes = mapOf(
        "AuthService" to 120L,
        "PaymentService" to 850L,
        "NotificationService" to 1400L,
        "UserService" to 300L
    )
    val threshold = 500L
    val slowServices = serviceResponseTimes.filterValues { it > threshold }
    println("Порог: $threshold мс")
    println("Медленные сервисы: $slowServices")
    println()

    // ============================================================
    // ЗАДАЧА 8. Статус endpoint, а если его нет — «не был протестирован».
    // Метод: getOrElse — возвращает значение по ключу, иначе выполнит лямбду.
    // ============================================================
    printHeader(8, "Статус endpoint (или «не был протестирован»)")
    val apiStatuses = mapOf(
        "/api/users" to "200 OK",
        "/api/orders" to "500 Internal Server Error"
    )
    val status = apiStatuses.getOrElse("/api/profile") { "Endpoint не был протестирован" }
    println("Статус /api/profile: $status")
    println()

    // ============================================================
    // ЗАДАЧА 9. Значение "browserType". Ответ не может быть null.
    // Метод: getValue — вернёт значение ИЛИ бросит исключение, если ключа нет.
    // Поэтому результат — гарантированно не-null String (без знака вопроса).
    // ============================================================
    printHeader(9, "Получение browserType (ответ не может быть null)")
    val envConfig = mapOf(
        "browserType" to "Chrome",
        "baseUrl" to "https://test.example.com",
        "environment" to "staging"
    )
    val browserType: String = envConfig.getValue("browserType")
    println("Тип браузера: $browserType")
    println()

    // ============================================================
    // ЗАДАЧА 10. Копия неизменяемого словаря версий + новая версия.
    // Метод: plus (оператор +) — создаёт НОВЫЙ словарь, исходный не трогает.
    // ============================================================
    printHeader(10, "Копия словаря версий с добавленной новой версией")
    val softwareVersions = mapOf(
        "1.0.0" to "релиз",
        "1.1.0" to "релиз"
    )
    val withNewVersion = softwareVersions + ("2.0.0" to "бета")
    println("Исходный словарь:      $softwareVersions")
    println("Копия с новой версией: $withNewVersion")
    println()

    // ============================================================
    // ЗАДАЧА 11. Настройки для модели устройства или настройки по умолчанию.
    // Метод: getOrDefault — если ключа нет, вернёт заранее готовое значение.
    // ============================================================
    printHeader(11, "Настройки устройства или настройки по умолчанию")
    val deviceSettings = mapOf(
        "Samsung Galaxy S23" to "Android 14, API 34",
        "iPhone 14" to "iOS 17"
    )
    val settings = deviceSettings.getOrDefault("Xiaomi Redmi 12", "Настройки по умолчанию")
    println("Настройки для «Xiaomi Redmi 12»: $settings")
    println()

    // ============================================================
    // ЗАДАЧА 12. Содержит ли словарь определённый код ошибки.
    // Метод: containsKey — проверяет наличие КЛЮЧА (в задаче 27 проверим значение).
    // ============================================================
    printHeader(12, "Проверка наличия кода ошибки")
    val testErrors = mapOf(
        "E001" to "NullPointerException",
        "E002" to "TimeoutException",
        "E003" to "AssertionError"
    )
    val codeToCheck = "E002"
    if (testErrors.containsKey(codeToCheck)) {
        println("Ошибка $codeToCheck найдена: ${testErrors[codeToCheck]}")
    } else {
        println("Ошибки $codeToCheck в словаре нет")
    }
    println()

    // ============================================================
    // ЗАДАЧА 13. Оставить сценарии нужной версии (версия — в ключе "TestID_Version").
    // Метод: filterKeys — оставляет пары, у которых КЛЮЧ подходит под условие.
    // ============================================================
    printHeader(13, "Фильтрация сценариев по версии в идентификаторе")
    val scenarios = mapOf(
        "TC01_v1" to "Passed",
        "TC02_v2" to "Failed",
        "TC03_v1" to "Skipped",
        "TC04_v2" to "Passed"
    )
    val version = "v2"
    val scenariosOfVersion = scenarios.filterKeys { it.contains("_$version") }
    println("Сценарии версии $version: $scenariosOfVersion")
    println()

    // ============================================================
    // ЗАДАЧА 14. Есть ли модули с неудачным тестированием.
    // Метод: any — true, если хотя бы ОДНА пара подходит под условие.
    // ============================================================
    printHeader(14, "Есть ли модули с неудачным тестированием")
    val moduleResults = mapOf(
        "Авторизация" to "успешно",
        "Платежи" to "неудачно",
        "Поиск" to "успешно"
    )
    val hasFailedModules = moduleResults.any { it.value == "неудачно" }
    println(
        if (hasFailedModules) "Да, есть модули с неудачным тестированием"
        else "Нет, все модули протестированы успешно"
    )
    println()

    // ============================================================
    // ЗАДАЧА 15. Добавить в изменяемый словарь настройки из другого словаря.
    // Метод: putAll — кладёт сразу ВСЕ пары из другого словаря.
    // ============================================================
    printHeader(15, "Добавление настроек из другого словаря")
    val envSettings = mutableMapOf(
        "browser" to "Firefox",
        "timeout" to "30"
    )
    val extraSettings = mapOf(
        "locale" to "ru-RU",
        "retryCount" to "2"
    )
    println("До объединения:    $envSettings")
    envSettings.putAll(extraSettings)
    println("После объединения: $envSettings")
    println()

    // ============================================================
    // ЗАДАЧА 16. Объединить два неизменяемых словаря с багами.
    // Метод: plus (оператор +). В задаче 10 + добавлял ОДНУ пару,
    // здесь + складывает два ЦЕЛЫХ словаря — тоже создаётся новый словарь.
    // ============================================================
    printHeader(16, "Объединение двух словарей с багами")
    val bugsTeamA = mapOf("BUG-201" to "открыт", "BUG-202" to "в работе")
    val bugsTeamB = mapOf("BUG-203" to "открыт", "BUG-204" to "закрыт")
    val allBugs = bugsTeamA + bugsTeamB
    println("Баги команды A:       $bugsTeamA")
    println("Баги команды B:       $bugsTeamB")
    println("Объединённый словарь: $allBugs")
    println()

    // ============================================================
    // ЗАДАЧА 17. Очистить изменяемый словарь с временными данными прогона.
    // Метод: clear — удаляет всё содержимое.
    // ============================================================
    printHeader(17, "Очистка словаря с данными последнего прогона")
    val lastRun = mutableMapOf(
        "testLogin" to "passed",
        "testPayment" to "failed"
    )
    println("Количество записей до очистки: ${lastRun.size}")
    lastRun.clear()
    println("После очистки: ${lastRun.size}, словарь = $lastRun")
    println()

    // ============================================================
    // ЗАДАЧА 18. Исключить из отчёта тесты со статусом "skipped".
    // Метод: filterNot — «обратный» filter: убирает пары под условием.
    // ============================================================
    printHeader(18, "Отчёт без пропущенных (skipped) тестов")
    val report = mapOf(
        "testLogin" to "passed",
        "testBackup" to "skipped",
        "testPayment" to "failed",
        "testExport" to "skipped"
    )
    val reportWithoutSkipped = report.filterNot { it.value == "skipped" }
    println("Отчёт без skipped: $reportWithoutSkipped")
    println()

    // ============================================================
    // ЗАДАЧА 19. Копия конфигураций с удалением нескольких ключей.
    // Метод: minus (оператор -) со списком ключей через listOf()
    // — создаёт копию без перечисленных записей.
    // ============================================================
    printHeader(19, "Копия конфигураций с удалением нескольких ключей")
    val testingConfigs = mapOf(
        "chromeDesktop" to "1920x1080",
        "firefoxDesktop" to "1366x768",
        "safariMobile" to "390x844",
        "edgeTablet" to "768x1024"
    )
    val reducedConfigs = testingConfigs - listOf("safariMobile", "edgeTablet")
    println("Копия без удалённых конфигураций: $reducedConfigs")
    println()

    // ============================================================
    // ЗАДАЧА 20. Отчёт: словарь -> список строк «Test ID: результат».
    // Метод: map — превращает каждую пару в новую строку;
    // (id, result) — распаковка пары в две переменные.
    // ============================================================
    printHeader(20, "Отчёт в виде списка строк «Test ID: результат»")
    val resultsById = mapOf(
        "TC-101" to "passed",
        "TC-102" to "failed",
        "TC-103" to "passed"
    )
    val reportLines = resultsById.map { (id, result) -> "$id: $result" }
    println("Строки отчёта:")
    for (line in reportLines) println(" $line")
    println()

    // ============================================================
    // ЗАДАЧА 21. Изменяемый словарь -> неизменяемый (для архивации).
    // Метод: toMap — делает копию «только для чтения» (тип Map без Mutable).
    // ============================================================
    printHeader(21, "Неизменяемая архивная копия изменяемого словаря")
    val lastTestResults = mutableMapOf(
        "TC-201" to "passed",
        "TC-202" to "skipped"
    )
    val archived: Map<String, String> = lastTestResults.toMap()
    lastTestResults["TC-203"] = "passed"       // меняем исходник...
    println("Исходник изменился:    $lastTestResults")
    println("Архив остался прежним: $archived")
    println()

    // ============================================================
    // ЗАДАЧА 22. Заменить числовые ID тестов на строковые.
    // Метод: mapKeys — преобразует каждый КЛЮЧ; it — пара «ключ-значение».
    // ============================================================
    printHeader(22, "Замена числовых ID тестов на строковые")
    val executionTimes = mapOf(
        101 to 5.2,
        102 to 3.7,
        103 to 8.1
    )
    val stringIdTimes = executionTimes.mapKeys { it.key.toString() }
    println("Словарь со строковыми ID: $stringIdTimes")
    println()

    // ============================================================
    // ЗАДАЧА 23. Увеличить каждую оценку производительности на 10%.
    // Метод: mapValues — преобразует каждое ЗНАЧЕНИЕ (умножение на 1.1 = +10%).
    // Math.round(...) округляет до 2 знаков, чтобы не было хвостов
    // вроде 2.2000000000000002 из-за дробных чисел.
    // ============================================================
    printHeader(23, "Увеличение оценок производительности на 10%")
    val performanceScores = mapOf(
        "1.0.0" to 2.0,
        "2.0.0" to 1.5,
        "2.1.0" to 3.0
    )
    val adjustedScores = performanceScores.mapValues { Math.round(it.value * 1.1 * 100) / 100.0 }
    println("Оценки после увеличения на 10%: $adjustedScores")
    println()

    // ============================================================
    // ЗАДАЧА 24. Пуст ли словарь ошибок компиляции.
    // Метод: isEmpty — true, если в словаре нет ни одной пары.
    // ============================================================
    printHeader(24, "Пуст ли словарь ошибок компиляции")
    val compileErrors = mapOf<String, String>()
    if (compileErrors.isEmpty()) println("Словарь пуст — ошибок компиляции нет")
    else println("Словарь не пуст — есть ошибки компиляции")
    println()

    // ============================================================
    // ЗАДАЧА 25. Убедиться, что словарь нагрузочного тестирования НЕ пуст.
    // Метод: isNotEmpty — противоположность isEmpty.
    // ============================================================
    printHeader(25, "Непуст ли словарь результатов нагрузочного тестирования")
    val loadTestResults = mapOf(
        "100 пользователей" to "среднее время 250 мс",
        "500 пользователей" to "среднее время 610 мс"
    )
    if (loadTestResults.isNotEmpty()) {
        println("Результаты получены, количество записей: ${loadTestResults.size}")
    } else {
        println("Результатов нагрузочного тестирования нет")
    }
    println()

    // ============================================================
    // ЗАДАЧА 26. Все ли тесты прошли успешно.
    // Метод: all — true, только если условие верно для ВСЕХ пар.
    // (В задаче 14 any хватало одного совпадения — здесь нужны все.)
    // ============================================================
    printHeader(26, "Все ли автоматизированные тесты прошли успешно")
    val automatedTests = mapOf(
        "testLogin" to "passed",
        "testCart" to "passed",
        "testCheckout" to "passed"
    )
    val allPassed = automatedTests.all { it.value == "passed" }
    println(if (allPassed) "Все тесты прошли успешно" else "Есть неуспешные тесты")
    println()

    // ============================================================
    // ЗАДАЧА 27. Есть ли хотя бы один тест с ошибкой.
    // Метод: containsValue — ищет по ЗНАЧЕНИЯМ (в задаче 12 искали по ключам).
    // ============================================================
    printHeader(27, "Есть ли хотя бы один тест с ошибкой")
    val testRunResults = mapOf(
        "testLogin" to "passed",
        "testPayment" to "failed",
        "testSearch" to "passed"
    )
    val hasFailed = testRunResults.containsValue("failed")
    println(if (hasFailed) "Да, есть хотя бы один тест с ошибкой" else "Тестов с ошибкой нет")
    println()

    // ============================================================
    // ЗАДАЧА 28. Оставить неуспешные тесты со словом "optional" в названии.
    // Метод: filter — общий фильтр: условие сразу и по ключу, и по значению.
    // (filterValues/filterKeys/filterNot из других задач умеют лишь половину этого.)
    // ============================================================
    printHeader(28, "Неуспешные тесты со словом optional в названии")
    val serviceTests = mapOf(
        "optionalAuthServiceTest" to "failed",
        "paymentServiceTest" to "failed",
        "optionalExportTest" to "passed",
        "optionalReportTest" to "failed"
    )
    val failedOptionalTests = serviceTests.filter {
        it.value != "passed" && it.key.contains("optional")
    }
    println("Неуспешные optional-тесты: $failedOptionalTests")
}

/** Печатает заголовок задачи, чтобы вывод в консоли легко читался. */
fun printHeader(number: Int, title: String) {
    println("=".repeat(60))
    println("ЗАДАЧА $number. $title")
    println("=".repeat(60))
}