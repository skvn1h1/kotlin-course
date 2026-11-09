package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактный холодильник.
 * Питание, дверца, регулировка температуры и подсветка внутри камеры.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractRefrigerator :
    Powerable,
    Openable,
    TemperatureRegulatable,
    LightEmitting
