package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактный фонарик.
 * Питание, батарея и свет.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractFlashlight :
    Powerable,
    BatteryOperated,
    LightEmitting
