package homeWork_9;

import java.util.Random;
import java.util.Scanner;

public class TestHomeWork_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите любое число от 0 до 100: ");
        int number = scanner.nextInt();
        int min = 0;
        int max = 100;

        int count = 0;

        while (true) {
            count++;

            int randomNumber = (random.nextInt(max - min + 1) + min);
            System.out.println(randomNumber);

            if (number == randomNumber) {
                System.out.println(" Компьютер угадал число) ");
                break;

            }
            System.out.println("Введенное число больше(1) или меньше(2) ?");


            int a = scanner.nextInt();

            if (a == 1 ) {
                min = randomNumber + 1;

                System.out.println("Число больше, чем " + randomNumber);
            } else if (a == 2 ) {
                max=randomNumber-1;
                System.out.println("Число меньше чем " + randomNumber);
            } else {
                System.out.println("Введи 1 или 2");
            }

        }
        System.out.println("Количество попыток: " + count);

    }
}















