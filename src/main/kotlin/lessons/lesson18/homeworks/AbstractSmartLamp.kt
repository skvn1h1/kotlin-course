package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактная умная лампа.
 * Питание, свет и программируемые режимы.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractSmartLamp :
    Powerable,
    LightEmitting,
    Programmable
