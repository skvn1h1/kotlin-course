package lessons.lesson16.homeworks

// Задание 4. Корзина товаров: артикул -> количество единиц.
class Cart {

    private val items: MutableMap<String, Int> = mutableMapOf()

    // Перегрузка 1: добавить одну единицу товара.
    fun addToCart(itemId: String) {
        addToCart(itemId, 1)
    }

    // Перегрузка 2: добавить несколько единиц одного товара.
    fun addToCart(itemId: String, amount: Int) {
        require(amount > 0) { "Количество должно быть больше нуля" }

        val currentAmount = items[itemId] ?: 0
        items[itemId] = currentAmount + amount
    }

    // Перегрузка 3: добавить сразу несколько разных товаров.
    fun addToCart(cartItems: Map<String, Int>) {
        for ((itemId, amount) in cartItems) {
            addToCart(itemId, amount)
        }
    }

    // Перегрузка 4: добавить список артикулов по одной единице.
    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    // Красиво оформляем содержимое корзины в виде таблицы.
    override fun toString(): String {
        if (items.isEmpty()) {
            return "Корзина пуста"
        }

        var idWidth = "Артикул".length
        for (itemId in items.keys) {
            if (itemId.length > idWidth) {
                idWidth = itemId.length
            }
        }

        var amountWidth = "Количество".length
        for (amount in items.values) {
            val amountLength = amount.toString().length
            if (amountLength > amountWidth) {
                amountWidth = amountLength
            }
        }

        val border = "+-" + "-".repeat(idWidth) + "-+-" + "-".repeat(amountWidth) + "-+"

        val table = StringBuilder()
        table.appendLine("Корзина товаров")
        table.appendLine(border)
        table.appendLine("| " + "Артикул".padEnd(idWidth) + " | " + "Количество".padEnd(amountWidth) + " |")
        table.appendLine(border)

        for ((itemId, amount) in items) {
            table.appendLine("| " + itemId.padEnd(idWidth) + " | " + amount.toString().padEnd(amountWidth) + " |")
        }

        table.appendLine(border)
        table.appendLine("Артикулов в корзине: ${items.size}")
        table.appendLine("Всего товаров: ${items.values.sum()}")

        return table.toString()
    }
}
