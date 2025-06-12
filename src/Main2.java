public class Main2 {
    public static void main(String[] args) {
        try {
            myArgumentException(); // Вызов метода, который выбрасывает исключение
        } catch (Exception exception) {
            System.out.println(exception.getMessage()); // Вывод сообщения об ошибке
            throw exception; // Повторный выброс исключения
        }
    }

    // Метод, который всегда выбрасывает IllegalArgumentException
    public static void myArgumentException() {
        throw new IllegalArgumentException("Это было сделано специально");
    }
}