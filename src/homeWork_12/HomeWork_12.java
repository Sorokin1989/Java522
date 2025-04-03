package homeWork_12;

import java.util.Scanner;

public class HomeWork_12 {
    public static void main(String[] args) {
        //1 Создать двумерный массив 2x5 и вывести его на экран.

        //     int[][] arrays = {
        //             {1, 2, 3, 4, 5},
        //             {6, 7, 8, 9, 10},
        //     };
        //     for (int i = 0; i < arrays.length; i++) {
        //         for (int j = 0; j < arrays[i].length; j++) {
        //             System.out.print(arrays[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        //2 Ввести с клавиатуры 2 строки по 3 числа и посчитать сумму всех элементов массива.


        Scanner scanner = new Scanner(System.in);

   //    int[][] arrays = new int[2][3];


   //    for (int i = 0; i < arrays.length; i++) {
   //        for (int j = 0; j < arrays[i].length; j++) {
   //            arrays[i][j] = scanner.nextInt();
   //        }
   //    }
   //    for (int i = 0; i < arrays.length; i++) {
   //        System.out.println();
   //        for (int j = 0; j < arrays[i].length; j++) {
   //            System.out.print(arrays[i][j] + " ");
   //        }
   //    }


   //    int sum = 0;
   //    for (int i = 0; i < arrays.length; i++) {
   //        for (int j = 0; j < arrays[i].length; j++) {
   //            sum = sum + arrays[i][j];
   //        }
   //    }
      //  System.out.print("\nСумма элементов: " + sum);

        //3 Создать двумерный массив 2x4 и вывести все элементы в обратном порядке (от последнего к первому).

        int[][] arrays= {{1, 2, 3, 4},
                         {5, 6, 7, 8} };

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println();
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }

        }
        System.out.println();
        System.out.print("\nВ обратном порядке: ");
        for (int i = arrays.length-1; i >=0; i--) {
            System.out.println();
            for (int j = arrays[i].length-1; j >=0; j--) {
                System.out.print(arrays[i][j] + " ");


            }
            }

    }
}