package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактные электронные часы.
 * Питание, таймер, программы и подсветка дисплея.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractElectronicClock :
    Powerable,
    Timable,
    Programmable,
    LightEmitting
