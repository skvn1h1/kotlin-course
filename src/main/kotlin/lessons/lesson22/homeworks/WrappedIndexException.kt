package lessons.lesson22.homeworks

/**
 * Задание 12. Собственное исключение, которое принимает IndexOutOfBoundsException
 * и оборачивает его как причину.
 */
class WrappedIndexException(cause: IndexOutOfBoundsException) :
    RuntimeException("Ошибка индекса: ${cause.message}", cause)
