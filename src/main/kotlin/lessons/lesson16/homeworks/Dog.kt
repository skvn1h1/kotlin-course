package lessons.lesson16.homeworks

// Собака переопределяет звук, который издаёт животное.
class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.YELLOW)
    }
}
