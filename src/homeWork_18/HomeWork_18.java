package homeWork_18;

public class HomeWork_18 {
    public static void main(String[] args) {
        //1. Деление с проверкой на ноль
        //Описание:
        //Напиши метод div(int a, int b), который делит a на b.
        //Если b == 0, бросай стандартное исключение ArithmeticException.

        try {
            System.out.println(div(10, 0));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }


        //
        //2. Чтение элемента массива
        //Описание:
        //Создай массив из 5 элементов.
        //Напиши метод, который по индексу выводит элемент массива.
        //Если индекс выходит за пределы массива, обрабатывай ArrayIndexOutOfBoundsException и выводи сообщение "Индекс за пределами массива".
        //
        int[] arr={1,2,3,4,5};
        try {
            System.out.println(getNum(arr, 10));
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }


        //3. Парсинг числа из строки
        //Описание:
        //Напиши метод, который принимает строку и конвертирует её в число (Integer.parseInt).
        //Если строка некорректная (например "abc"), обрабатывай NumberFormatException и выводи "Ошибка преобразования строки в число".
        //
        try {
            System.out.println(myParse("abc"));
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }





        //4. Множественный catch
        //Описание:
        //Напиши код, который может выбросить и ArithmeticException (деление на ноль) и ArrayIndexOutOfBoundsException (выход за границы массива).
        //Лови эти два исключения в разных catch блоках.
        //
        //5. Использование объединённого catch
        //Описание:
        //Тоже самое, но используй объединение (catch (ArithmeticException | ArrayIndexOutOfBoundsException e)).
        //
        //6. Принудительный выброс исключения
        //Описание:
        //Напиши метод, который всегда бросает IllegalArgumentException с сообщением "Это было сделано специально".
        //
        //7. Работа с finally без catch
        //Описание:
        //Напиши код, который делит два числа, и независимо от результата всегда пишет "Блок finally сработал".
        //
        //8. Перехват и повторный выброс исключения
        //Описание:
        //Напиши код, который ловит исключение, выводит сообщение, а затем снова бросает его (throw e).
        //
        //9. Пользовательский ввод с проверкой
        //Описание:
        //Используй Scanner.
        //Пусть пользователь вводит число.
        //Если он ввёл что-то кроме числа, выводи сообщение об ошибке (InputMismatchException) и проси ввести снова.
        //
        //10. Обработка массива строк с числами
        //Описание:
        //Есть массив строк вида ["10", "20", "abc", "30"].
        //Пробегись по массиву и попробуй превратить каждую строку в число.
        //Если строка не число — обработай исключение и напиши "Некорректное значение: abc".


    }

    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("На 0 делить нельзя!");
        return a / b;
    }

    public static int getNum(int[] arr, int index) {
        if (index<0 || index>=arr.length) throw new ArrayIndexOutOfBoundsException("Индекс за пределами массива");

        return arr[index];
    }


    public static int myParse(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка преобразования строки в число");
        }


    }

}
