package lessons.lesson15.homeworks

// Задание 2. Базовый класс "Учебное заведение".
// Общие свойства: название, город, количество учеников/студентов.
// Общее поведение: начало учебного года.
open class EducationalInstitution(
    val name: String,
    val city: String,
    val studentsCount: Int
) {
    fun startAcademicYear() {
        println("В \"$name\" ($city) начался учебный год. Учится $studentsCount человек.")
    }
}
