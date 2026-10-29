// Задание 6. Стеллаж и полки
// Вместимость полки измеряется в буквах: сумма длин названий предметов на полке не должна превышать capacity
class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    // Сколько букв уже занято предметами
    val usedSpace: Int
        get() = items.sumOf { it.length }

    // Сколько букв ещё можно добавить
    val freeSpace: Int
        get() = capacity - usedSpace

    fun addItem(item: String): Boolean {
        if (!canAccommodate(item)) {
            return false
        }
        items.add(item)
        return true
    }

    fun removeItem(item: String): Boolean {
        // remove удаляет только первое совпадение
        return items.remove(item)
    }

    fun canAccommodate(item: String): Boolean {
        return usedSpace + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return item in items
    }

    fun getItems(): List<String> {
        // возвращаем копию, чтобы снаружи нельзя было изменить private-список
        return items.toList()
    }
}

class Rack(val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelf in shelves) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        return shelves.removeAt(index).getItems()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("=== Стеллаж: полок ${shelves.size} из $maxShelves ===")
        for ((index, shelf) in shelves.withIndex()) {
            println(
                "Полка #$index: вместимость ${shelf.capacity}, " +
                    "занято ${shelf.usedSpace}, свободно ${shelf.freeSpace}"
            )
            val items = shelf.getItems()
            println("    Предметы: ${if (items.isEmpty()) "(пусто)" else items.joinToString(", ")}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val unplaced = mutableListOf<String>()
        // сначала пробуем разместить самые длинные названия
        val itemsToMove = shelves[index].getItems().sortedByDescending { it.length }
        for (item in itemsToMove) {
            var placed = false
            for (i in shelves.indices) {
                if (i == index) continue // саму удаляемую полку не рассматриваем
                if (shelves[i].addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                // предмет пропускаем и переходим к следующему
                unplaced.add(item)
            }
        }
        shelves.removeAt(index)
        return unplaced.toList()
    }
}

fun main() {
    // --- Обычная работа стеллажа ---
    val rack = Rack(maxShelves = 3)
    val shelfA = Shelf(capacity = 10)
    val shelfB = Shelf(capacity = 20)
    val shelfC = Shelf(capacity = 30)
    rack.addShelf(shelfA)
    rack.addShelf(shelfB)
    rack.addShelf(shelfC)

    // уже установленную полку добавить не получится
    println("Повторное добавление полки A: ${rack.addShelf(shelfA)}")

    rack.addItem("Молоток")    // 7 букв  -> полка A
    rack.addItem("Отвёртка")   // 8 букв  -> полка B
    rack.addItem("Дрель")      // 5 букв  -> полка B
    rack.addItem("Гвозди")     // 6 букв  -> полка B
    rack.addItem("Стремянка")  // 9 букв  -> полка C
    rack.printContents()

    println("\nrack.containsItem(\"Дрель\") = ${rack.containsItem("Дрель")}")
    println("rack.removeItem(\"Дрель\") = ${rack.removeItem("Дрель")}")
    println("rack.removeItem(\"Кувалда\") = ${rack.removeItem("Кувалда")}")

    // удаляем полку #0, её предметы возвращаются из метода
    println("\nУдаляем полку #0, её предметы: ${rack.removeShelf(0)}")
    rack.printContents()

    // --- Сложное удаление полки с перераспределением ---
    println("\n--- Сложное удаление полки ---")
    val rack2 = Rack(maxShelves = 3)
    rack2.addShelf(Shelf(capacity = 30)) // полка #0
    rack2.addShelf(Shelf(capacity = 10)) // полка #1
    rack2.addShelf(Shelf(capacity = 6))  // полка #2

    rack2.addItem("Перфоратор") // 10 букв -> полка #0
    rack2.addItem("Молоток")    // 7 букв  -> полка #0
    rack2.addItem("Гвозди")     // 6 букв  -> полка #0
    rack2.addItem("Дрель")      // 5 букв  -> полка #0
    rack2.printContents()

    // Удаляем полку #0: предметы (от длинных к коротким) пробуют устроиться
    // на оставшихся полках; кому не хватило места — вернутся из метода
    val unplaced = rack2.advancedRemoveShelf(0)
    println("\nНе удалось разместить: $unplaced")
    rack2.printContents()
}
