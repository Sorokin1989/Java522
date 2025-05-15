package LessonsTest;

import java.util.Random;
import java.util.Scanner;

public class LessonTest2 {
    public static void main(String[] args) {
        //Задание 1: Создать массив из 10 элементов и заполнить его случайными числами от 1 до 100.
        // Вывести массив на экран.

        Random random = new Random();
        int min = 1;
        int max = 100;
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Задание 2: Найти сумму всех элементов массива и вывести результат.
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов: " + sum);


        //Задание 3: Определить, есть ли в массиве число, равное заданному пользователем значению.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("В массиве есть это число!");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Нет такого числа!");

        //Задание 4: Создать массив из 15 элементов, заполнить его числами по возрастанию, начиная с 10.
        // Вывести массив.

        arr = new int[15];
        number = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number + i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        //Задание 5: Создать массив из 20 элементов и определить,
        // сколько в нем элементов больше среднего арифметического всех элементов.
        System.out.println();
        System.out.println("Массив: ");

        Random random1 = new Random();
        int size = 20;
        arr = new int[size];
        double arifmetic = 0;
        min = 1;
        max = 100;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random1.nextInt(max - min + 1) + min;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        arifmetic = (double) sum / size;
        System.out.println("\nСреднее арифметическое: " + arifmetic);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arifmetic)
                count++;
        }
        System.out.println("Количество чисел, которые больше среднего арифметического равно " + count);


    }
}

