package LessonsTest;

import java.util.Arrays;

public class LessonsTest {
    public static void main(String[] args) {

        //Задание 1: Объединить два массива
        //Описание:
        //Напишите программу, которая объединяет два массива целых чисел в один.
        //
        //Пример:
        //Вход: [1, 2, 3] и [4, 5]
        //Выход: [1, 2, 3, 4, 5]

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5};
        int[] arr3 = twoArr2(array1, array2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] twoArr2(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        return array3;
    }

}
