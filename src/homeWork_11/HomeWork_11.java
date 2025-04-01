package homeWork_11;

import java.util.Scanner;

public class HomeWork_11 {
    public static void main(String[] args) {
        // - 1. Создать статический массив из 10 чисел и вывести его на экран.
     //   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     //   for (int i = 0; i < 10; i++) {
       //     System.out.print(arr[i] + " ");

      //  }

        //2. Ввести с клавиатуры 5 чисел в статический массив и посчитать их сумму.

        Scanner scanner=new Scanner(System.in);
        int size=5;
        int[] arr=new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum=sum+arr[i];
        }
            System.out.print("Sum=" + sum);









    }
}
