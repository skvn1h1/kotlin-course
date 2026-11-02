package lessons.lesson16.homeworks

// Кошка переопределяет звук, который издаёт животное.
class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.PURPLE)
    }
}
