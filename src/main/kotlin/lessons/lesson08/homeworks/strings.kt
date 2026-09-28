package org.example.lessons.lesson08.homeworks

fun main(){

}


fun stringmagic(){
    var initString = "Это невозможно выполнить за один день"
    val trimmedInitString = initString.trim()
    val wordCount = if (trimmedInitString.isEmpty()) 0 else trimmedInitString.split(Regex("\\s+")).size
    when {
        initString.contains("невозможно", true) -> initString.replace("невозможно", "совершенно точно возможно, просто требует времени")
        initString.startsWith("Я не уверен", true) -> "$initString, но моя интуиция говорит об обратном"
        initString.contains("катастрофа", true) -> initString.replace("катастрофа", "интересное событие", ignoreCase = true)
        initString.endsWith("без проблем", true) -> initString.replace("без проблем", "с парой интересных вызовов на пути")
        wordCount == 1 -> "Иногда, $trimmedInitString, но не всегда"
        else -> println("ТЕЛЕПОРТАЦИЯ")
    }
}