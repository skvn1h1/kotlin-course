// Задание 4. Покупка: продукт
// data class автоматически даёт toString(), equals(), hashCode() и copy()
data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun main() {
    val milk = Product("Молоко", 89.90, 3)
    println(milk)

    // copy() возвращает такой же продукт, но с изменёнными полями
    val discountedMilk = milk.copy(price = 74.90)
    println(discountedMilk)

    println("milk == discountedMilk: ${milk == discountedMilk}")
}
