package homeWork_7;

public class HomeWork_7 {
    public static void main(String[] args) {
        // Задание_1
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        //Задание_2
        int size = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            size++;
        }
        // Задание_3
        System.out.println();

        int s = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            s--;
        }
        // Задание_4
        int d = 0;

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
            d++;
        }

        // Задание_5

        System.out.println("\n");

        int f = 7;

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
            f--;

        }

        // Задание_6

        int h = 7;

        for (int i = 1; i <= h; i++) {
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 2; k <= (2 + i - 1); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // Задание_7
        // Мощная задач
        int a = 10;
        for (int i1 = 0; i1 < a; i1++) {
            for (int j = a; j > i1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i3 = a - 1; i3 >= 1; i3--) {
            for (int j = a; j > i3; j--) {
                System.out.print(" ");
            }
            for (int r = 1; r <= (i3 - 1); r++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


}





