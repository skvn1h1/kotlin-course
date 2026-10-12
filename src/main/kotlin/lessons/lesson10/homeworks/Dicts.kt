package org.example.lessons.lesson10.homeworks
fun main() {
//Задачи на работу со словарём

//1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap: Map<Int, Int> = mapOf()
    println(emptyMap)
//2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val floatDoubleMap: Map<Float, Double> = mapOf(
        1.5f to 2.5,
        3.5f to 7.0,
        5.5f to 10.25
    )
    println(floatDoubleMap)

//3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val people: MutableMap<Int, String> = mutableMapOf(
        1 to "Анна",
        2 to "Борис"
    )
    println(people)

//4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    people[3] = "Виктор"
    people[4] = "Галина"
    people.put(5, "Дмитрий")
    println(people)
//5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом,
//   которого в словаре нет.
    val name = people[1]
    println(name) // Анна

// Попытка получить значение по несуществующему ключу
    val unknown = people[100]
    println(unknown) // null

//6. Удалите определенный элемент из изменяемого словаря по его ключу.
    people.remove(2)
    println(people)
//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь
// обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val divisionMap: Map<Double, Int> = mapOf(
        10.0 to 2,
        7.5 to 3,
        9.0 to 0,
        20.0 to 4
    )

    for ((key, value) in divisionMap) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }

//8. Измените значение для существующего ключа в изменяемом словаре.
    people[1] = "Анастасия"
    println(people)

//9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val firstMap: Map<Int, String> = mapOf(1 to "один", 2 to "два")
    val secondMap: Map<Int, String> = mapOf(3 to "три", 4 to "четыре")

    val mergedMap: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in firstMap) {
        mergedMap[key] = value
    }
    for ((key, value) in secondMap) {
        mergedMap[key] = value
    }

    println(mergedMap)

//10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в
// этот словарь.
    val grades: MutableMap<String, List<Int>> = mutableMapOf()

    grades["Иванов"] = listOf(5, 4, 5)
    grades["Петров"] = listOf(3, 4, 3)
    grades["Сидорова"] = listOf(5, 5, 4)

    println(grades)

//11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные
// в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.
    val groups: MutableMap<Int, MutableSet<String>> = mutableMapOf()

    groups[1] = mutableSetOf("яблоко", "банан")
    groups[2] = mutableSetOf("морковь", "свёкла")

    val fruits = groups[1] // получаем множество по ключу
    if (fruits != null) {
        fruits.add("груша")
        println(fruits)
    }
//12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5
// в качестве первого или второго значения.
    val points: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "Точка А",
        Pair(3, 5) to "Точка Б",
        Pair(7, 8) to "Точка В",
        Pair(5, 9) to "Точка Г"
    )

    for ((key, value) in points) {
        if (key.first == 5 || key.second == 5) {
            println("$value - пара $key содержит цифру 5")
        }
    }


//Задачи на подбор оптимального типа для словаря

//1. Словарь библиотека: Ключи - автор книги, значения - список книг
    val library: MutableMap<String, List<String>> = mutableMapOf()

    library["Пушкин"] = listOf("Евгений Онегин", "Руслан и Людмила")
    library["Гоголь"] = listOf("Мёртвые души", "Ревизор")

    println(library)

//2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants: MutableMap<String, List<String>> = mutableMapOf()

    plants["Цветы"] = listOf("Роза", "Тюльпан", "Ромашка")
    plants["Деревья"] = listOf("Берёза", "Дуб", "Клён")

    println(plants)

//3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val tournament: MutableMap<String, List<String>> = mutableMapOf()

    tournament["Спартак"] = listOf("Иванов", "Петров", "Сидоров")
    tournament["Динамо"] = listOf("Козлов", "Смирнов")

    println(tournament)

//4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val treatment: MutableMap<String, List<String>> = mutableMapOf()

    treatment["01.03.2025"] = listOf("Аспирин", "Парацетамол")
    treatment["02.03.2025"] = listOf("Ибупрофен")

    println(treatment)

//5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveler: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf()

    val russia: MutableMap<String, List<String>> = mutableMapOf()
    russia["Москва"] = listOf("Красная площадь", "Кремль")
    russia["Санкт-Петербург"] = listOf("Эрмитаж", "Петергоф")

    val france: MutableMap<String, List<String>> = mutableMapOf()
    france["Париж"] = listOf("Эйфелева башня", "Лувр")

    traveler["Россия"] = russia
    traveler["Франция"] = france

    println(traveler)


}