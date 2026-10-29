package lessons.lesson15.homeworks

// Абстрактный класс-контейнер из урока (изменять его нельзя).
// Создать экземпляр напрямую нельзя — он нужен только как основа для подклассов.
// Подклассам доступно только: addMaterial, extractMaterials и printContainer.
abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}
