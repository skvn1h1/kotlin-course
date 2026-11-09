package lessons.lesson16.homeworks

// Птица переопределяет звук, который издаёт животное.
class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.CYAN)
    }
}
