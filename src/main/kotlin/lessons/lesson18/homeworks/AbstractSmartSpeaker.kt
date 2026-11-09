package lessons.lesson18.homeworks

/**
 * Задача 1. Абстрактная умная колонка.
 * Питание, звук и программируемые сценарии.
 * Методы не реализуются — класс остаётся абстрактным.
 */
abstract class AbstractSmartSpeaker :
    Powerable,
    SoundEmitting,
    Programmable
