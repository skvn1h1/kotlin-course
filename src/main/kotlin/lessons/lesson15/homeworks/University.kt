package lessons.lesson15.homeworks

// ВУЗ — добавляем список факультетов.
open class University(
    name: String,
    city: String,
    studentsCount: Int,
    val faculties: List<String>
) : EducationalInstitution(name, city, studentsCount) {

    fun printFaculties() {
        println("Факультеты $name: ${faculties.joinToString(", ")}")
    }
}
