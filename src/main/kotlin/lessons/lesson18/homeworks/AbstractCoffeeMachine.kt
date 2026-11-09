package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактная кофемашина.
 * Питание, вода, температура, программы и таймер.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractCoffeeMachine :
    Powerable,
    WaterContainer,
    TemperatureRegulatable,
    Programmable,
    Timable
