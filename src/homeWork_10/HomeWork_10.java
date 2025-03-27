package homeWork_10;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_10 {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED + "             <<ИГРА>>" + ANSI_RESET + "\n         <<Угадай Число>>");


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 0;
        int max = 100;
        System.out.println("    Введите любое число от" + " " + min + " " + "до" + " " + max +
                ANSI_BLUE + "\n У Вас 5 попыток, чтобы угадать число!!!" + ANSI_RESET);

        int randomNumber = random.nextInt(max - min + 1) + min;
        int i = 0;
        int count = 5;

        while (true) {
            count--;
            i++;
            int number = scanner.nextInt();

            if (number > max || number < min) {
                System.out.println("Вы ввели число вне диапазона!!!\n" + "ЗАПУСТИТЕ ИГРУ ЗАНОВО!!!");
                return;
            }


            if (i == 5) {
                System.out.println("Вы израсходовали свои попытки\n" + ANSI_GREEN + "НАЧНИТЕ ЗАНОВО!!!\n" + ANSI_RESET +
                        "Осталось попыток:" + " " + count);
                return;
            }

            if (number == randomNumber) {
                System.out.println(ANSI_YELLOW + "     <<УРА!!!ПОБЕДА>>\n" + ANSI_RESET + "Вы угадали число). Это число " + number
                        + "\n Осталось попыток:" + " " + count);
                break;
            } else if (number > randomNumber) {
                System.out.println("Вы ввели больше, чем загадал компьютер.Число меньше, чем " + number +
                        "\n Осталось попыток:" + " " + count);
            } else {
                System.out.println("Вы ввели меньше, чем загадал компьютер. Число больше, чем " + number +
                        "\n Осталось попыток:" + " " + count);
            }


        }

        System.out.println("Количество попыток: " + i);
        scanner.close();
    }
}



