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
        int size=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            size++;
        }
        // Задание_3
        System.out.println();

        int s=10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            s--;
        }

    }
}
