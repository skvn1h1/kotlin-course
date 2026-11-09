package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактная стиральная машина.
 * Питание, дверца, вода, слив, таймер, программы и температура стирки.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractWashingMachine :
    Powerable,
    Openable,
    WaterContainer,
    WaterConnection,
    Drainable,
    Timable,
    Programmable,
    TemperatureRegulatable
