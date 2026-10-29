package lessons.lesson15.homeworks

// Задание 5. Контейнер, который вставляет список строк в начало,
// чередуя их с уже имеющимися материалами: новые элементы оказываются
// на индексах 0, 2, 4 и так далее, а старые сдвигаются на 1, 3, 5...
class AlternatingInsertContainer : Materials() {

    fun addMaterialsAlternately(newMaterials: List<String>) {
        val existing = extractMaterials()
        val maxPairs = maxOf(newMaterials.size, existing.size)
        for (i in 0 until maxPairs) {
            if (i < newMaterials.size) addMaterial(newMaterials[i])
            if (i < existing.size) addMaterial(existing[i])
        }
    }
}
