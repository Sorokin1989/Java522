import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1)

        //******
        //******
        //******
        //******

//        System.out.println("********");
//        System.out.println("********");
//        System.out.println("********");
//        System.out.println("********");
//        System.out.println("********");
//
//        System.out.println("\n-----------------------------\n");
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("********");
//        }



//        System.out.println("********");
//
//        System.out.println("\n-----------------------------\n");
//
//
//        for (int i = 0; i < 8; i++) {
//            System.out.print("*");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.print("*");
//        }

//        int size = 50;
//
//        for (int i = 0; i < size; i++) {
//            for (int k = 0; k < size; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //*********
        //
        //
        //
        //



        //         *
        //        *
        //       *
        //      *
        //     *
        //    *
        //   *
        //  *
        // *
//        int size = 10;
//        for (int i = size; i > 0; i--) {
//            System.out.println();
//        }


        //         *

//        System.out.println("         *");
//        System.out.println("        *");
//        System.out.println("       *");
//        System.out.println("      *");
//        System.out.println("     *");
//        System.out.println("    *");
//        System.out.println("   *");
//        System.out.println("  *");
//        System.out.println(" *");
//        System.out.println("*");


//        System.out.println("          *");
//        System.out.println("         *");

//        int size = 10;
//
//        for (int i = 0; i < 10; i++) {
//            for (int k = 0; k < size; k++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//            size--;
//        }


        int size = 10;

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < size; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
            size--;//size-=1;
        }



//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 8; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 7; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 6; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 4; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");
//        for (int i = 0; i < 1; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");




//          Вывести числа  от 1 до N.  Посчитать сколько там
//                +четных
//                +нечетных
//                +деляться без остатка на 5 и на 6
//                +деляться без остатка на 2 и на 3
//                +деляться без остатка на 2 или на 10
//                +деляться без остатка на 2 или на 4
//                +деляться без остатка на 7 и на 3


//        int evenCount = 0,
//            oddCount = 0,
//            del5And6 = 0,
//            del2And3 = 0,
//            del7And3 = 0,
//            del2or10 = 0,
//            del2or4 = 0,
//            size;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        size = scanner.nextInt();
//
//        for (int i = 1; i <= size; i++) {
//            System.out.print(i + " ");
//            if (i % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//
//            if (i % 5 == 0 && i % 6 == 0) {
//                del5And6++;
//            }
//
//            if (i % 2 == 0 && i % 3 == 0) {
//                del2And3++;
//            }
//
//            if (i % 7 == 0 && i % 3 == 0) {
//                del7And3++;
//            }
//
//            if (i % 2 == 0 || i % 10 == 0) {
//                del2or10++;
//            }
//            if (i % 2 == 0 || i % 4 == 0) {
//                del2or4++;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Cetnoe cislo         : " + evenCount);
//        System.out.println("Ne cetnoe cislo      : " + oddCount);
//        System.out.println("Delitsa na 5 i 6     : " + del5And6);
//        System.out.println("Delitsa na 2 i 3     : " + del2And3);
//        System.out.println("Delitsa na 2 ili 10  : " + del2or10);
//        System.out.println("Delitsa na 7 i 3     : " + del7And3);
//        System.out.println("Delitsa na 2 ili 4   : " + del2or4);


        // qlavnoe ctob rabotalo       ( 10 for 5if  1 switch) +
        // qlavnoe ctob bilo optimalno ( 2 for 2if  ) +

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int size  = scanner.nextInt();
//
//        int evenCount = 0  , oddCount = 0 ;
//
//        for (int i = 1; i <= size; i++) {
//            System.out.print(i + " ");
//            if (i%2==0){
//                evenCount++;
//            }
//            if (i%2!=0){
//                oddCount++;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Cetnoe cislo    : " + evenCount);
//        System.out.println("Ne cetnoe cislo : " + oddCount);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter num : ");
//        int size  = scanner.nextInt();
//
//        int evenCount = 0 ;
//
//        for (int i = 1; i <= size; i++) {
//            System.out.print(i + " ");
//            if (i%2==0){
//                evenCount++;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Cetnoe cislo : " + evenCount);
//
//        int oddCount = 0;
//
//        for (int i = 1; i <= size; i++) {
//            System.out.print(i + " ");
//            if (i%2!=0){
//                oddCount++;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Ne cetnoe cislo : " + oddCount);


//        1  Вывести числа от 10 до 1 в обратном порядке.
//        2  Вывести все нечётные числа от 1 до 50.
//        3  Посчитать сумму всех чётных чисел от 1 до N.
//        4  Найти количество чисел, кратных 5, в диапазоне от 1 до 100.
//        5  Вывести квадраты чисел от 1 до 10.
//        6  Вывести числа  от 1 до N.  Посчитать сколько там
//                -четных
//                -нечетных
//                -деляться без остатка на 5 и на 6
//                -деляться без остатка на 2 и на 3
//                -деляться без остатка на 2 или на 10
//                -деляться без остатка на 2 или на 4
//                -деляться без остатка на 7 и на 3
//        7  Вывести числа от 1 до 100, которые делятся на 3 без остатка.
//        8  Вывести сумму чисел от 1 до 50.
//        9  Вывести все числа от 1 до N в одну строку через пробел.
//        10 Вывести произведение чисел от 1 до N.
//        11 Найти количество чисел от 1 до N, которые делятся на 2 или 5.
//        12 Вывести сумму чисел от 1 до N.


//        for (int i = 0; i < 10; i++) {
//            for (int i = 0; i < 10; i++) {
//                for (int i = 0; i < 10; i++) {
//
//                }
//            }
//        }




    }
}