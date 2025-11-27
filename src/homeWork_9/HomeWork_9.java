package homeWork_9;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_9 {
    public static void main(String[] args) {


        // 2 задание

        System.out.println(" Введите любое число от 0 до 100: ");

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int i = 0;

        while (true) {
            i++;
            int number = scanner.nextInt();

            if (number > 100 || number < 0) {
                System.out.println("Введите значение от 0 до 100 !!!");
            }

            if (number == randomNumber) {
                System.out.println("Вы угадали число). Это число " + number);
                break;
            } else if (number > randomNumber) {
                System.out.println("Вы ввели больше, чем загадал компьютер.Число меньше, чем " + number);
            } else {
                System.out.println("Вы ввели меньше, чем загадал компьютер. Число больше, чем " + number);
            }


        }
        System.out.println("Количество попыток: " + i);
        scanner.close();
    }
}
