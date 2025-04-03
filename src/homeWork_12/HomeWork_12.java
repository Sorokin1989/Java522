package homeWork_12;

public class HomeWork_12 {
    public static void main(String[] args) {
        //1 Создать двумерный массив 2x5 и вывести его на экран.

        int[][] arrays = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }


    }
}
