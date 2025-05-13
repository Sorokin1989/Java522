package ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        //✅ 2. Чётное или нечётное число
        //Условие:
        //Пользователь вводит число. Определите, чётное оно или нечётное.
        //Цель: остаток от деления, if.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("Число четное!");
        else System.out.println("Число нечетное!");


        //✅ 3. Максимум из трёх чисел
        // Условие:Ввести три числа. Напечатать наибольшее из них.
        // Если 2 числа больше то надо указать что а и б больше если все 3 равны то указать все числа равны

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3)
            System.out.println(" Наибольшее число :" + number1);
        else if (number2 > number1 && number2 > number3)
            System.out.println("Наибольшее число: " + number2);
        else if (number3 > number1 && number3 > number2)
            System.out.println("Наибольшее число:" + number3);
        else if (number1 == number2 && number1 == number3 && number2 == number3)
            System.out.println("Все числа равны!");
        else if (number1 == number2 && number1 > number3 || number2 > number3)
            System.out.println("2 наибольших числа: " + number1 + " и " + number2);
        else if (number2 == number3 && number2 > number1 || number3 > number1) {
            System.out.println("2 наибольших числа: " + number2 + " и " + number3);
        } else if (number3 == number1 && number3 > number2 || number1 > number2) {
            System.out.println("2 наибольших числа: " + number3 + " и " + number1);
        }


        //✅ 4. Таблица умножения (от 1 до 10)
        //Условие:
        //Выведите таблицу умножения от 1 до 10.
        //Цель: вложенные циклы for

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();

        }

        // ✅ 5. Проверка числа на простоту
        // Условие:
        // Проверьте, является ли число простым (делится только на 1 и себя).
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Число не должно быть меньше 2");
            return;
        }
        int i2 = 2;
        boolean isFlag = false;
        while (i2 * i2 <= number) {
            if (number % i2 == 0) {
                isFlag = true;
                break;
            }
            i2++;
        }
        if (isFlag)
            System.out.println("Число не простое");
        else System.out.println("Число простое");


        //✅ 6. Поиск слова в массиве строк
        //Условие:
        //Пользователь вводит слово, а программа ищет его в массиве строк.
        //Цель: строки, массивы, цикл.
        String[] words = {"dima", "oleg", "katya", "mike", "bob", "john"};
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Введите слово для поиска: ");
        String inputWord = scanner1.nextLine();

        boolean found = false;

        for (String word : words) {
            if (word.equalsIgnoreCase(inputWord)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Слово \"" + inputWord + "\" найдено в массиве.");
        } else {
            System.out.println("Слово \"" + inputWord + "\" не найдено в массиве.");
        }

//✅ 7. Простое меню с switch
//Условие:
//Сделайте текстовое меню (1 — вывести приветствие, 2 — вывести дату, 3 — выход).
        System.out.println("Введите число 1, 2 или 3");
        int numm = scanner.nextInt();

        switch (numm) {
            case 1:
                System.out.println("Приветствую тебя!!!");
                break;
            case 2:
                System.out.println("Сегодня 12 мая 2005 года!!!");
                break;
            case 3:
                System.out.println("Выход");
                break;
            default:
                System.out.println("Некорректное значение!!!");

        }
        //✅ 8. Обратный порядок массива
        //Условие:
        //Разверните массив в обратном порядке без использования дополнительных библиотек.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
        //✅ 9. Обратный порядок массива
        //Условие:
        //1) Есть 2 массива в отсортированнов виде
        //
        //   int[] arr = {-5,0,1,1,2,3,6,8,22,45,678}
        //   int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100}
        //
        //
        //   int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
        //
        //
        //   Нельзя использовать сортировку
        //
        //
        //public static int[] twoArr(int[] one, int[] two) {
        //
        //    return arr3;
        //}
        System.out.println();
        System.out.println();
        int[] arr1 = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};
        System.out.println(Arrays.toString(twoArr(arr1, arr2)));
    }

    public static int[] twoArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        int[] arr3Sort = new int[arr3.length];

        for (int j = 0; j < arr3.length; j++) {
            int minIndex = -1;
            for (int i = 0; i < arr3.length; i++) {
                if (minIndex == -1 || arr3[i] < arr3[minIndex]) {
                    minIndex = i;
                }
            }
            arr3Sort[j] = arr3[minIndex];
            arr3[minIndex] = Integer.MAX_VALUE;
        }
        return arr3Sort;
    }
}