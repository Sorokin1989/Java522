package homeWork_36;

import java.util.Scanner;

public class HomeWork_36 {


    public static String toRoman(int num) {
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(10);
        while (num > 0) {
            while (num >= values[i]) {
                num = num - values[i];
                stringBuilder.append(romans[i]);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: (1-3999)");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 3999) {
            System.out.println(toRoman(num));
        } else System.out.println("Вы ввели неправильное число!");

    }
}
