package lessons.lesson15.homeworks

// Медицинский ВУЗ — добавляем собственную клинику для практики студентов.
class MedicalUniversity(
    name: String,
    city: String,
    studentsCount: Int,
    faculties: List<String>,
    val hasOwnClinic: Boolean
) : University(name, city, studentsCount, faculties)
