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

        //Задание 3: Отсортировать массив из двух объединенных массивов
        //Описание:
        //Объедините два массива и отсортируйте полученный массив по возрастанию.
        //
        //Пример:
        //Вход: [3, 1] и [4, 2]
        //Выход: [1, 2, 3, 4]

        int[] array = {3, 1};
        int[] array4 = {4, 2};

        int[] arr5 = twoArrSort(array, array4);
        System.out.println(Arrays.toString(arr5));


        //Задание 4: Найти минимальный элемент в массиве
        //Описание:
        //Напишите программу, которая находит самый маленький элемент в массиве.
        //
        //Пример:
        //Вход: [7, 2, 9]
        //Выход: 2

        int[] arR = {7, 2, 9};
        int min = arR[0];
        System.out.println("Минимальное значение: ");
        for (int i = 0; i < arR.length; i++) {
            if (arR[i] < min) {
                min = arR[i];
            }
        }
        System.out.println(min);


        //Задание 5: Создать функцию для объединения и сортировки двух массивов
        //Описание:
        //Создайте функцию mergeAndSort, которая принимает два массива и возвращает
        // отсортированный объединенный массив.
        //Результат: [2, 3, 4, 5]

        int[] arr6 = {5, 3};
        int[] arr7 = {2, 4};

        int[] arrSort = mergeAndSort(arr6, arr7);
        System.out.println(Arrays.toString(arrSort));


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

    public static int[] twoArrSort(int[] arr, int[] arr2) {
        int[] array = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            array[arr.length + i] = arr2[i];

        }
        Arrays.sort(array);
        return array;

    }

    public static int[] mergeAndSort(int[] arr, int[] arr2) {
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr.length + i] = arr2[i];
        }
        int[] arrSort3 = new int[arr3.length];

        for (int j = 0; j < arr3.length; j++) {
            int minIndex = -1;
            for (int i = 0; i < arr3.length; i++) {
                if (minIndex == -1 || arr3[i] < arr3[minIndex]) {
                    minIndex = i;
                }
            }
            arrSort3[j] = arr3[minIndex];
            arr3[minIndex] = Integer.MAX_VALUE;
        }
        return arrSort3;
    }

}





