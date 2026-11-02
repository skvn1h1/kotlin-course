package lessons.lesson16.homeworks

// Демонстрация перегрузки метода addToCart() и своего toString().
fun main() {
    val cart = Cart()

    // Одна единица товара.
    cart.addToCart("SKU-1001")

    // Несколько единиц одного товара.
    cart.addToCart("SKU-1002", 3)

    // Словарь товаров: SKU-1001 уже есть, поэтому количество увеличится.
    cart.addToCart(mapOf("SKU-1003" to 2, "SKU-1001" to 4))

    // Список артикулов: каждый добавляется по одной единице.
    cart.addToCart(listOf("SKU-1004", "SKU-1004", "SKU-1002"))

    println(cart)
}
