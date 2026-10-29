package lessons.lesson15.homeworks

// Технический ВУЗ — добавляем количество лабораторий.
class TechnicalUniversity(
    name: String,
    city: String,
    studentsCount: Int,
    faculties: List<String>,
    val laboratoriesCount: Int
) : University(name, city, studentsCount, faculties)
