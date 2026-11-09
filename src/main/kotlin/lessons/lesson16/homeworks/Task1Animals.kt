package lessons.lesson16.homeworks

// Демонстрация переопределения методов makeSound().
fun main() {
    val animals: List<Animal> = listOf(Animal(), Dog(), Cat(), Bird())

    for (animal in animals) {
        animal.makeSound()
    }
}
