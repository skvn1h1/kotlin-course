package lessons.lesson15.homeworks

// Школа — добавляем количество школьных классов и наличие профильных классов.
class School(
    name: String,
    city: String,
    studentsCount: Int,
    val gradesCount: Int,
    val hasProfileClasses: Boolean
) : EducationalInstitution(name, city, studentsCount)
