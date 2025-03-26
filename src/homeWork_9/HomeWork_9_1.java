package homeWork_9;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_9_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите любое число от 0 до 100: ");
        int number = scanner.nextInt();
        int min = 0;
        int max = 100;

        int count = 0;

        if (number > max || number < min) {
            System.out.println(" Некорректный ввод!!! Введите число от 0 до 100 ");
            return;
        }

        while (true) {
            count++;


            int randomNumber = (random.nextInt(max - min + 1) + min);
            System.out.println(randomNumber);


            if (number == randomNumber) {
                System.out.println(" Компьютер угадал число) Это число " + number);
                break;

            }
            System.out.println("Если введенное число больше, то введите (1) или меньше, то введите (2) ");


            int a = scanner.nextInt();

            if (a == 1) {
                min = randomNumber + 1;

                System.out.println("Число больше, чем " + randomNumber);
            } else if (a == 2) {
                max = randomNumber - 1;
                System.out.println("Число меньше чем " + randomNumber);
            } else {
                System.out.println("Неверный ввод!!! Введи 1 или 2");

            }

        }
        System.out.println("Количество попыток: " + count);
        scanner.close();

    }
}















