package LessonsTest;

import java.util.Arrays;
import java.util.Scanner;

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


        //Задание 6: Проверить, есть ли в массиве число 0
        //Описание:
        //Напишите программу, которая проверяет, содержит ли массив число 0.
        // Если да — выводит "Есть ноль", иначе — "Нет нуля".
        //
        //Пример:
        //Вход: [1, 2, 0, 4]
        //Выход: Есть ноль

        // int[] arRay = {1, 2, 0, 4};
        // for (int i = 0; i < arRay.length; i++) {
        //     if (arRay[i] == 0) {
        //         System.out.println("Есть ноль");
        //         return;
        //     }
        // }
        // System.out.println("Нет нуля");


        //Задание 7: Подсчитать сумму элементов массива
        //Описание:
        //Создайте программу, которая вычисляет сумму всех элементов массива.
        //
        //Пример:
        //Вход: [1, 2, 3]
        //Выход: 6

        int[] array7 = new int[3];
        array7[0] = 1;
        array7[1] = 2;
        array7[2] = 3;
        int sum = 0;

        for (int i = 0; i < array7.length; i++) {
            sum += array7[i];
        }
        System.out.println("Сумма: " + sum);


        //Задание 8: Создать новый массив из элементов исходного с шагом 2
        //Описание:
        //Создайте новый массив, который содержит каждый второй элемент исходного массива.
        //
        //Пример:
        //Вход: [10, 20, 30, 40, 50]
        //Выход: [20, 40]

        int[] array8 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};
        for (int i = 0; i < array8.length; i++) {
            System.out.print(array8[i] + " ");
        }
        int[] array9 = new int[array8.length];
        System.out.println();
        for (int i = 0; i < array8.length; i++) {
            if (i % 2 != 0) {
                array9[i] = array8[i];
            }
        }
        int count = 0;
        for (int i = 0; i < array9.length; i++) {
            if (array9[i] != 0)
                count++;
        }
        int[] newArr = new int[count];
        int newIndex = 0;
        for (int i = 0; i < array9.length; i++) {
            if (array9[i] != 0) {
                newArr[newIndex] = array9[i];
                newIndex++;
            }
        }
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");

        }


        //Задание 9: Проверить, есть ли в массиве число больше 10
        //Описание:
        //Напишите программу, которая проверяет наличие элемента больше чем 10.
        // Если есть — выводит "Есть число больше 10", иначе — "Нет чисел больше 10".
        //
        //Пример:
        //Вход: [5, 8, 12]
        //Выход: Есть число больше 10
        System.out.println();
        int[] array10 = {5, 8};
        int counter = 0;

        for (int i = 0; i < array10.length; i++) {

            for (int j = 0; j < array10.length; j++) {
                if (array10[i] > 10) {
                    System.out.println("Есть числа больше 10");
                    return;
                }
            }
        }
        System.out.println("Нет чисел больше 10");


        //Задание 10: Создать массив из чисел от 1 до N
        //Описание:
        //Напишите программу, которая создает массив из чисел от 1 до N (включительно).
        //
        //Пример:
        //Для N=5 результат: [1, 2, 3, 4, 5]

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] arr11 = new int[number];

        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = i + 1;

        }

        for (int i = 0; i < arr11.length; i++) {
            System.out.print(arr11[i] + " ");

        }


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





