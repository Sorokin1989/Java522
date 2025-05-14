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
        int[] arr3 = twoArr(array1, array2);
        System.out.println(Arrays.toString(arr3));

        //Задание 2: Создать массив из элементов двух массивов
        //Описание:
        //Создайте новый массив, который содержит все элементы двух исходных массивов в порядке их следования.
        //
        //Пример:
        //Вход: [10, 20] и [30, 40]
        //Выход: [10, 20, 30, 40]

        int[] arr = {10, 20};
        int[] arr2 = {30, 40};

        int[] array3 = twoArr2(arr, arr2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] twoArr(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        return array3;
    }

    public static int[] twoArr2(int[] arr, int[] arr2) {
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr.length + i] = arr2[i];
        }
        return arr3;
    }


}
