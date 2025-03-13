package homeWork_6;

import java.util.Scanner;

public class homeWork_6 {
    public static void main(String[] args) {

        // 1. Вывести числа от 10 до 1 в обратном порядке.
        for (int i = 10; i > 0; i--)
            System.out.println(i);

        System.out.println();

// 2.  Вывести все нечётные числа от 1 до 50.
        for (int i = 1; i < 50; i += 2)
            System.out.println(i);
        System.out.println();


//3.  Посчитать сумму всех чётных чисел от 1 до N.


        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= y; i++) {
            if (i % 2 == 0)
                s = s + i;

        }
        System.out.println("Сумма четных чисел от 1 до введенного числа равна: " + s);
        System.out.println();


//4.  Найти количество чисел, кратных 5, в диапазоне от 1 до 100.
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                a = a + 1;
        }
        System.out.println("Количество чисел, кратных 5 равно: " + a);
        System.out.println();


//5.  Вывести квадраты чисел от 1 до 10.

        for (int i = 1; i <= 10; i++) {
            int sq = 0;
            sq = i * i;
            System.out.println("Квадрат числа " + i + " равен: " + sq);
            System.out.println();
        }


/* 6.  Вывести числа  от 1 до N.  Посчитать сколько там
   -четных (b)
   -нечетных (c)
   -деляться без остатка на 5 и на 6 (d)
   -деляться без остатка на 2 и на 3 (f)
   -деляться без остатка на 2 или на 10 (g)
   -деляться без остатка на 2 или на 4 (h)
   -деляться без остатка на 7 и на 3 (j) */

        System.out.println("Введите число: ");
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int j = 0;
        int number = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                b = b + 1;

            if (i % 2 != 0)
                c = c + 1;

            System.out.println(i);
            if (i % 5 == 0 && i % 6 == 0)
                d = d + 1;
            if (i % 2 == 0 && i % 3 == 0)
                f = f + 1;
            if (i % 2 == 0 || i % 10 == 0)
                g = g + 1;
            if (i % 2 == 0 || i % 4 == 0)
                h = h + 1;
            if (i % 7 == 0 && i % 3 == 0)
                j = j + 1;
        }
        System.out.println("Всего четных чисел: " + b);
        System.out.println();
        System.out.println("Всего нечетных чисел: " + c);
        System.out.println();
        System.out.println("Делятся без остатка на 5 и на 6: " + d);
        System.out.println();
        System.out.println("Делятся без остатка на 2 и на 3: " + f);
        System.out.println();
        System.out.println("Делятся без остатка на 2 или на 10: " + g);
        System.out.println();
        System.out.println("Делятся без остатка на 2 или на 4: " + h);
        System.out.println();
        System.out.println("Делятся без остатка на 7 и на 3: " + j);
        System.out.println();


//7.  Вывести числа от 1 до 100, которые делятся на 3 без остатка.
        System.out.println("Числа, которые делятся на 3 без остатка: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }

//8.  Вывести сумму чисел от 1 до 50.
        int sum = 0;
        for (int i = 1; i <= 50; i++)
            sum = sum + i;
        System.out.println();
        System.out.println("Сумма чисел от 1 до 50: " + sum);
        System.out.println();

//9.  Вывести все числа от 1 до N в одну строку через пробел.
        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();
        for (int i = 1; i <= number1; i++)
            System.out.print(i + " ");
        System.out.println();
//10. Вывести произведение чисел от 1 до N.
        System.out.println("Введите число: ");
        int result = 1;
        int number2 = scanner.nextInt();
        for (int i = 1; i <= number2; i++)
            result = result * i;
        System.out.println("Произведение чисел равно: " + result);
        System.out.println();


//11. Найти количество чисел от 1 до N, которые делятся на 2 или 5.
        System.out.println("Введите число: ");
        int l = 0;
        int number3 = scanner.nextInt();
        System.out.println("Всего чисел, которые делятся на 2 или на 5: ");
        for (int i = 1; i <= number3; i++)
            if (i % 2 == 0 || i % 5 == 0)
                l = l + 1;
        System.out.println(l);
        System.out.println();


//12. Вывести сумму чисел от 1 до N. */
        System.out.println("Введите число: ");
        int number4 = scanner.nextInt();
        int sum2 = 0;
        for (int i = 1; i <= number4; i++)
            sum2 = sum2 + i;
        System.out.println("Сумма чисел от 1 до введенного числа равна: " + sum2);



    }
}




