package lessons.lesson15.homeworks

// Задание 6. Контейнер, который при добавлении строки
// держит все материалы в алфавитном порядке (включая добавляемый).
class SortedInsertContainer : Materials() {

    fun addSortedMaterial(material: String) {
        val existing = extractMaterials()
        (existing + material).sorted().forEach { addMaterial(it) }
    }
}
