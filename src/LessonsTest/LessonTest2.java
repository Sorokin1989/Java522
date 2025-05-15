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

    }
}

