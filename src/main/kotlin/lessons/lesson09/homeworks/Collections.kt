package org.example.lessons.lesson09.homeworks
fun main(){

 //1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val e1: Array<Int> = arrayOf(1, 2, 3, 4, 5)

 //2. Создайте пустой массив строк размером 10 элементов.
val e2: Array<String?> = arrayOfNulls(10)
fun e3filling(){

}
 //3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val e3: DoubleArray = doubleArrayOf(0.0, 0.1, 0.2, 0.3, 0.4)

// 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
//    индексу, умноженному на 3.

fun massive() {
    val array1 = arrayOf(0, 0, 0, 0, 0)
    for (i in array1.indices) {
        array1[i] = i * 3
    }
}

// 5. Массив из 3 nullable строк
val array2 = arrayOfNulls<String>(3)
array2[0] = null
array2[1] = "Hello"
array2[2] = "World"

// 6. Копирование массива в новый массив через цикл
val original = arrayOf(1, 2, 3, 4, 5)
val copy = Array(original.size) { 0 } // новый массив того же размера из нулей
for (i in original.indices) {
    copy[i] = original[i]
}

// 7. Вычитание одного массива из другого
val a = arrayOf(10, 20, 30)
val b = arrayOf(1, 2, 3)
val c = Array(a.size) { 0 }
for (i in a.indices) {
    c[i] = a[i] - b[i]
}
for (element in c) {
    println(element)
}

// 8. Поиск индекса элемента со значением 5 через while
val numbers = arrayOf(3, 8, 5, 1, 9)
var index = 0
var result = -1
while (index < numbers.size) {
    if (numbers[index] == 5) {
        result = index
        break
    }
    index++
}
println(result)

// 9. Вывод элементов с пометкой чётное/нечётное
val array6 = arrayOf(4, 7, 10, 15, 22)
for (number in array6) {
    if (number % 2 == 0) {
        println("$number — чётное")
    } else {
        println("$number — нечётное")
    }
}

// 10. Вызов функции поиска подстроки
findSubstring(arrayOf("apple pie", "banana", "cherry cake"), "cake")
}

// 11. Функция ищет элемент, в котором есть строка search
fun findSubstring(arr: Array<String>, search: String) {
    for (element in arr) {
        if (element.contains(search)) {
            println("Найден элемент: $element")
            break
        }
    }


//    Работа со списками List


    // 1. Пустой неизменяемый список целых чисел
    val list1: List<Int> = emptyList()

    // 2. Неизменяемый список строк из трёх элементов
    val list2 = listOf("Hello", "World", "Kotlin")

    // 3. Изменяемый список целых чисел от 1 до 5
    val list3 = mutableListOf(1, 2, 3, 4, 5)

    // 4. Добавление новых элементов
    list3.add(6)
    list3.add(7)
    list3.add(8)
    println(list3)

    // 5. Удаление элемента "World"
    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println(list5)

    // 6. Вывод каждого элемента в цикле
    val list6 = listOf(1, 2, 3, 4, 5)
    for (element in list6) {
        println(element)
    }

    // 7. Второй элемент по индексу
    val list7 = listOf("красный", "зелёный", "синий")
    println(list7[1])

    // 8. Замена элемента с индексом 2
    val list8 = mutableListOf(10, 20, 30, 40)
    list8[2] = 99
    println(list8)

    // 9. Объединение двух списков через циклы
    val listA = listOf("a", "b", "c")
    val listB = listOf("d", "e", "f")
    val combined = mutableListOf<String>()
    for (element in listA) {
        combined.add(element)
    }
    for (element in listB) {
        combined.add(element)
    }
    println(combined)

    // 10. Минимум и максимум через цикл
    val numbers = listOf(4, 12, 7, 1, 9)
    var min = numbers[0]
    var max = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("Минимум: $min, максимум: $max")

    // 11. Новый список только из чётных чисел
    val source = listOf(1, 2, 3, 4, 5, 6)
    val evens = mutableListOf<Int>()
    for (number in source) {
        if (number % 2 == 0) {
            evens.add(number)
        }
    }
    println(evens)


// Работа с множествами Set

// 1. Пустое неизменяемое множество целых чисел
val set1: Set<Int> = emptySet()

// 2. Неизменяемое множество из трёх элементов
val set2 = setOf(1, 2, 3)

// 3. Изменяемое множество строк
val set3 = mutableSetOf("Kotlin", "Java", "Scala")

// 4. Добавление новых элементов
set3.add("Swift")
set3.add("Go")
println(set3)

// 5. Удаление элемента 2
val set5 = mutableSetOf(1, 2, 3)
set5.remove(2)
println(set5)

// 6. Вывод каждого элемента в цикле
val set6 = setOf(5, 10, 15)
for (element in set6) {
    println(element)
}

// 7. Вызов функции проверки наличия строки
checkString(setOf("cat", "dog", "bird"), "dog")
}

// 7. Проверка наличия строки в множестве через цикл
fun checkString(strings: Set<String>, search: String) {
    var found = false
    for (element in strings) {
        if (element == search) {
            found = true
        }
    }
    println(found)
}