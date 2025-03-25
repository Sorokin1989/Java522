package homeWork_9;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_9 {
    public static void main(String[] args) {
        System.out.println(" Введите любое число от 0 до 100: ");

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int i=0;

        while (true) {
            i++;
            int number = scanner.nextInt();

            if (number == randomNumber) {
                System.out.println("Угадал");
                break;
            } else if (number > randomNumber) {
                System.out.println("Вы ввели больше, чем загадал компьютер " + number);
            } else {
                System.out.println("Вы ввели меньше, чем загадал компьютер " + number);
            }


        }
        System.out.println("Количество попыток: " + i);
    }
}
