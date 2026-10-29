package lessons.lesson15.homeworks

// Задание 4. Контейнер, который вставляет материал на дно — под индекс 0.
class BottomInsertContainer : Materials() {

    fun addMaterialToBottom(material: String) {
        // Внутри Materials есть только добавление в конец, поэтому:
        // забираем всё содержимое, кладём новый материал первым и возвращаем остальное.
        val existing = extractMaterials()
        addMaterial(material)
        existing.forEach { addMaterial(it) }
    }
}
