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

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//
        while (true) {
            System.out.println("1-Продолжить");
            System.out.println("2-Новая игра");
            System.out.println("3-Настройки");
            System.out.println("4-Выход");

            int num = scanner.nextInt();

            if (num == 1)
                System.out.println("Продолжить");
            else if (num == 2) {
                System.out.println("------------Новая игра--------------");
                System.out.println(ANSI_RED + "             <<ИГРА>>" + ANSI_RESET + "\n         <<Угадай Число>>");


                int min = 0;
                int max = 100;
                System.out.println("    Введите любое число от" + " " + min + " " + "до" + " " + max +
                        ANSI_BLUE + "\n У Вас 5 попыток, чтобы угадать число!!!" + ANSI_RESET);

                int randomNumber = random.nextInt(max - min + 1) + min;
                int i = 0;
                int count = 5;
                int shetchik = 0;


                while (true) {
                    count--;
                    i++;
                    int number = scanner.nextInt();


                    if (number > max || number < min) {
                        System.out.println("Вы ввели число вне диапазона!!!\n" + "ЗАПУСТИТЕ ИГРУ ЗАНОВО!!!");
                        return;
                    }


                    if (i == 5) {
                        Thread.sleep(2000);
                        System.out.println(ANSI_PURPLE + "       GAME OVER\n" + ANSI_RESET + "Вы израсходовали свои попытки\n" + ANSI_GREEN
                                + "    НАЧНИТЕ ЗАНОВО!!!\n" + ANSI_RESET +
                                "    Осталось попыток:" + " " + count);
                        return;
                    }
                    //int count2=1;
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
                Thread.sleep(2500);

                System.out.println("Количество попыток: " + i);

            } else if (num == 3) {
                System.out.println("-------------Настройки--------------");


                while (true) {

                    System.out.println("1-Имя");
                    System.out.println("2-Выберите диапазон");
                    System.out.println("3-Уровень сложности");
                    System.out.println("4-Назад");

                    num = scanner.nextInt();
                    if (num == 1)
                        System.out.println("Имя");
                    else if (num == 2)
                        System.out.println("Выберите диапазон");
                    else if (num == 3)
                        System.out.println("Уровень сложности");
                    else if (num == 4) {
                        System.out.println("Назад");
                        break;
                    } else {
                        System.out.println("Вы ввели некорректные данные!!! Введите еще раз!!!");
                        break;
                    }
                }


            } else if (num == 4) {
                System.out.println("Выход");
                break;
            } else
                System.out.println("Вы ввели нерректные данные!!!\n Повторите попытку!");

        }


    }

}



