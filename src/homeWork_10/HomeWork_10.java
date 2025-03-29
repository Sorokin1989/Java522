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
        int min = 0;
        int max = 100;
        String name = "User";

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


                System.out.println(name + ",    Введите любое число от" + " " + min + " " + "до" + " " + max +
                        ANSI_BLUE + "\n У Вас 5 попыток, чтобы угадать число!!!" + ANSI_RESET);

                int randomNumber = random.nextInt(max - min + 1) + min;
                int i = 0;
                int count = 5;


                while (true) {
                    count--;
                    i++;
                    int number = scanner.nextInt();


                    if (number > max || number < min) {
                        System.out.println(name + ",Вы ввели число вне диапазона!!!\n" + "ЗАПУСТИТЕ ИГРУ ЗАНОВО!!!");
                        return;
                    }


                    if (i == 5) {
                        Thread.sleep(2000);
                        System.out.println(ANSI_PURPLE + "       GAME OVER\n" + ANSI_RESET + name + ",Вы израсходовали свои попытки\n" + ANSI_GREEN
                                + "    НАЧНИТЕ ЗАНОВО!!!\n" + ANSI_RESET +
                                "    Осталось попыток:" + " " + count);
                        return;
                    }
                    if (number == randomNumber) {

                        System.out.println(ANSI_YELLOW + "     <<УРА!!!ПОБЕДА>>\n" + ANSI_RESET + name + ",Вы угадали число). Это число " + number
                                + "\n Осталось попыток:" + " " + count);
                        break;

                    } else if (number > randomNumber) {


                        System.out.println(name + ",Вы ввели больше, чем загадал компьютер.Число меньше, чем " + number +
                                "\n Осталось попыток:" + " " + count);

                    } else {


                        System.out.println(name + ",Вы ввели меньше, чем загадал компьютер. Число больше, чем " + number +
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
                    if (num == 1) {
                        System.out.println("\n--------Имя--------");

                        System.out.println("Введите ваше имя");
                        name = scanner.next();
                        scanner = new Scanner(System.in);


                    } else if (num == 2) {
                        System.out.println("\n-------------Выберите диапазон-------------");

                        while (true) {

                            System.out.println("Ваш диапазон: " + "[" + min + "- " + max + "]");
                            System.out.println("1 - Поменять min");
                            System.out.println("2 - Поменять max");
                            System.out.println("3 - Назад");

                            int select = scanner.nextInt();


                            if (select == 1) {
                                System.out.println("Введите min: ");
                                min = scanner.nextInt();

                            } else if (select == 2) {
                                System.out.println("Введите max: ");
                                max = scanner.nextInt();
                            } else if (select == 3) {
                                System.out.println("Назад");
                                if (min < max)
                                    break;
                                else
                                    System.out.println("min должен быть меньше max!!!\n Введите корректные значения!!!");
                            } else {
                                System.out.println(name + ",Введите верное значение!!!\n Повторите попытку!");
                            }


                        }
                    } else if (num == 3)
                        System.out.println("Уровень сложности");
                    else if (num == 4) {
                        System.out.println("Назад");
                        break;
                    } else {
                        System.out.println(name + ",Вы ввели некорректные данные!!! Введите еще раз!!!");
                        break;
                    }
                }


            } else if (num == 4) {
                System.out.println("Выход");
                break;
            } else
                System.out.println(name + ",Вы ввели некорректные данные!!!\n Повторите попытку!");

        }


    }

}



