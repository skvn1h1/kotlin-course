package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактный робот-пылесос.
 * Батарея, зарядка, движение, уборка, программы и датчики автоотключения.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractRobotVacuumCleaner :
    BatteryOperated,
    Rechargeable,
    Movable,
    Cleanable,
    Programmable,
    AutomaticShutdown
