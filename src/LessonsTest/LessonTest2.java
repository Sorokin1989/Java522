package LessonsTest;

import java.util.Random;

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

      
    }
}
