package homeWork_8;

public class HomeWork_8 {
    public static void main(String[] args) {
        //Задание_1 прямоугольник
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 3; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 6) {
                    System.out.print(" * ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();

        }

        //Задание_2 прямоугольный треугольник №1

        int h = 0;
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                if (j == 0 || i == n - 1 || j == i - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
            h++;
        }

        // Задание_3 прямоугольный треугольник №2
        System.out.println("\n");

        int h1 = 10;
        for (int i = 0; i < h1 - 1; i++) {
            for (int j = h1 - 1; j > 0; j--) {
                if (i == 0 || j == h1 - 1 || i == j - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Задание_4 равнобедренный треугольник
        System.out.println("\n");

        int d = 10;

        for (int i = 0; i < d; i++) {
            for (int j = d; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if (i == d - 1 || k == 0 || k == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }

        // Задание_5 ромб

        int k = 10;
        for (int i = 0; i < k; i++) {
            for (int j = k; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = k - 1; j > i; j--) {
                if (j == i + 1 || j == k - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }


    }

}

