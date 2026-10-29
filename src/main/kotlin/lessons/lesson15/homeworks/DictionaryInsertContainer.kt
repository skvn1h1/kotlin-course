package lessons.lesson15.homeworks

// Задание 7. Контейнер, который принимает словарь (ключи и значения — строки).
// Каждая пара кладётся так: ключ — в начало контейнера, значение — в конец.
// В итоге: ключи в обратном порядке, затем существующие материалы, затем все значения.
class DictionaryInsertContainer : Materials() {

    fun addMaterialsFromDictionary(pairs: Map<String, String>) {
        for ((key, value) in pairs) {
            addKeyAndValue(key, value)
        }
    }

    private fun addKeyAndValue(key: String, value: String) {
        val existing = extractMaterials()
        addMaterial(key)
        existing.forEach { addMaterial(it) }
        addMaterial(value)
    }
}
