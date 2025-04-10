package homeWork_13;

import java.util.Arrays;

public class HomeWork_13 {
    public static void main(String[] args) {
        sayHi();
        int num = square(5);
        System.out.println(num);

        greetByName(" Дима");

        int sum = sum(10, 20);
        System.out.println("Сумма: " + sum);

        boolean a = isPositive(1);
        System.out.println("Число положительное :" + a);

        int[] newArr = doubleArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(newArr));

        int summ = arraySum(new int[]{1,2,3,4,5});
        System.out.println("Сумма элементов массива: " + summ);


    }
    //1. Метод sayHi()
    //Принимает: ничего
    //Возвращает: void
    //Что делает: выводит "Привет!" в консоль

    public static void sayHi() {
        System.out.println("Привет!");
    }

    //2. Метод square(int number)
    //Принимает: одно int число
    //Возвращает: int
    //Что делает: возвращает квадрат числа

    public static int square(int number) {
        int sq2 = number * number;
        return sq2;
    }
    // 3. Метод greetByName(String name)
    //Принимает: строку name
    //Возвращает: void
    //Что делает: печатает "Привет, <имя>!"

    public static void greetByName(String name) {
        System.out.println("Привет" + name);
    }
    // 4. Метод sum(int a, int b)
    // Принимает: два int числа
    // Возвращает: int
    // Что делает: возвращает их сумму

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    //5. Метод isPositive(int number)
    //Принимает: одно int число
    //Возвращает: boolean
    //Что делает: возвращает true, если число положительное

    public static boolean isPositive(int number) {
        if (number > 0)
            return true;
        else return false;
    }
    //6. Метод doubleArray(int[] arr)
    //Принимает: массив целых чисел
    //Возвращает: новый массив int[]
    //Что делает: возвращает массив, где каждый элемент умножен на 2

    public static int[] doubleArray(int[] arr) {
        int[] doubleArray = new int[10];
        for (int i = 0; i < arr.length; i++) {
            doubleArray[i] = arr[i] * 2;
        }
        return doubleArray;
    }

    //7. Метод arraySum(int[] arr)
    //Принимает: массив целых чисел
    //Возвращает: int
    //Что делает: возвращает сумму всех элементов массива

    public static int arraySum(int[] arr) {
        //int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;


    }

}
