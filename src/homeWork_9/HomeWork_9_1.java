package homeWork_9;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_9_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите любое число от 0 до 100: ");
        int number = scanner.nextInt();

        int count = 0;




        while (true) {
            count++;
            int randomNumber = random.nextInt(101);
            System.out.println(randomNumber);
            if (number == randomNumber) {
                System.out.println(" Компьютер угадал число) ");
                break;

            }
        }
        System.out.println("Количество попыток: " + count);
    }
}
            // Компьютер выдаёт случайные числа от 0 до 100





