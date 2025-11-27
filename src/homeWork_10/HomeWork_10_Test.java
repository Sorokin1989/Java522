package homeWork_10;

import java.util.Random;
import java.util.Scanner;


    public class HomeWork_10_Test {

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
            int attempts = 0;
            int limit = 0;
            boolean isHelp = true;

            String savedName = name;
            int savedMin = min;
            int savedMax = max;
            int savedLimit = limit;
            boolean savedIsHelp = isHelp;
            int randomNumber = random.nextInt(max - min + 1) + min;

            while (true) {
                System.out.println(ANSI_CYAN + "ПЕРЕД НАЧАЛОМ ИГРЫ!!!\nВВЕДИТЕ КОЛИЧЕСТВО ПОПЫТОК В МЕНЮ <Настройки> -> <Уровень сложности> -> <Количество попыток>" + ANSI_RESET);
                System.out.println("1 -> Продолжить");
                System.out.println("2 -> Новая игра");
                System.out.println("3 -> Настройки");
                System.out.println("4 -> Выход");

                int num = scanner.nextInt();

                if (num == 1)
                    System.out.println("Продолжить");
                if (savedLimit > 0) {
                    System.out.println("Продолжить игру с именем: " + savedName + ", диапазоном: [" + savedMin + "-" + savedMax + "], попытками: " + savedLimit);
                    // Начинаем игру с сохраненными параметрами
                    randomNumber = random.nextInt(savedMax - savedMin + 1) + savedMin;
                    // int attempts = 0;
                }
                while (savedLimit > 0) {
                    System.out.println(savedName + ", введите число от " + savedMin + " до " + savedMax + ":");
                    int number = scanner.nextInt();
                    attempts++;

                    if (number > savedMax || number < savedMin) {
                        System.out.println(savedName + ", вы ввели число вне диапазона!!!");
                        continue; // Пропускаем итерацию, если число вне диапазона
                    }

                    savedLimit--;

                    if (number == randomNumber) {
                        System.out.println(ANSI_YELLOW + "     <<УРА!!! ПОБЕДА>>\n" + ANSI_RESET + savedName + ", вы угадали число " + number +
                                "\n Осталось попыток: " + savedLimit);
                        break;
                    } else if (number > randomNumber) {
                        if (isHelp) {
                            System.out.println(savedName + ", вы ввели больше, чем загадал компьютер. Число меньше, чем " + number);
                        }
                    } else {
                        if (isHelp) {
                            System.out.println(savedName + ", вы ввели меньше, чем загадал компьютер. Число больше, чем " + number);
                        }
                    }
                    System.out.println("Осталось попыток: " + savedLimit);
                }

                if (savedLimit == 0) {
                    System.out.println(ANSI_PURPLE + "       GAME OVER\n" + ANSI_RESET + savedName + ", вы израсходовали свои попытки\n" +
                            ANSI_GREEN + "    НАЧНИТЕ ЗАНОВО!!!\n" + ANSI_RESET);
                } else {
                    System.out.println("Нет сохраненного состояния игры. Пожалуйста, начните новую игру.");
                }


                // не смог реализовать!!!
               if (num == 2) {
                    System.out.println(ANSI_CYAN + "<------------Новая игра-------------->" + ANSI_RESET);
                    System.out.println(ANSI_RED + "             <<ИГРА>>" + ANSI_RESET + "\n         <<Угадай Число>>");
                    System.out.println(name + ", Введите любое число от" + " " + min + " " + "до" + " " + max +
                            ANSI_BLUE + "\n У Вас" + " " + limit + " " + "попыток, чтобы угадать число!!!" + ANSI_RESET);
                    if (limit == 0) {
                        System.out.println("ВВЕДИТЕ КОЛИЧЕСТВО ПОПЫТОК В МЕНЮ <Настройки>\n НАЧНИТЕ ЗАНОВО!!!");
                        break;
                    }
                     randomNumber = random.nextInt(max - min + 1) + min;

                    while (true) {
                        limit--;
                        attempts++;
                        int number = scanner.nextInt();



                        if (number > max || number < min) {
                            System.out.println(name + ",Вы ввели число вне диапазона!!!\n" + "ЗАПУСТИТЕ ИГРУ ЗАНОВО!!!");
                            return;
                        }
                        if (limit == 0) {
                            Thread.sleep(2000);
                            System.out.println(ANSI_PURPLE + "       GAME OVER\n" + ANSI_RESET + name + ",Вы израсходовали свои попытки\n" + ANSI_GREEN
                                    + "    НАЧНИТЕ ЗАНОВО!!!\n" + ANSI_RESET +
                                    "    Осталось попыток:" + " " + limit);
                            return;
                        }
                        if (number == randomNumber) {
                            System.out.println(ANSI_YELLOW + "     <<УРА!!!ПОБЕДА>>\n" + ANSI_RESET + name + ",Вы угадали число). Это число " + number
                                    + "\n Осталось попыток:" + " " + limit);
                            break;

                        } else if (number > randomNumber) {
                            if (isHelp) {
                                System.out.println(name + ",Вы ввели больше, чем загадал компьютер.Число меньше, чем " + number);
                            }
                            System.out.println("\n Осталось попыток:" + " " + limit);

                        } else {
                            if (isHelp) {
                                System.out.println(name + ",Вы ввели меньше, чем загадал компьютер. Число больше, чем " + number);
                            }
                            System.out.println("\n Осталось попыток:" + " " + limit);
                        }
                    }
                    Thread.sleep(2500);
                    System.out.println("Молодец, Вы угадали за" + " " + attempts + " " + "попыток");
                    break;

                } else if (num == 3) {
                    System.out.println(ANSI_RED + "<-------------Настройки-------------->" + ANSI_RESET);

                    while (true) {

                        System.out.println("1 -> Имя");
                        System.out.println("2 -> Выберите диапазон");
                        System.out.println("3 -> Уровень сложности");
                        System.out.println("4 -> Назад");

                        num = scanner.nextInt();
                        if (num == 1) {
                            System.out.println("\n--------Имя--------");
                            System.out.println("Введите ваше имя");
                            name = scanner.next();
                            scanner = new Scanner(System.in);

                        } else if (num == 2) {
                            System.out.println(ANSI_BLUE + "\n<-------------Выберите диапазон------------->" + ANSI_RESET);

                            while (true) {

                                System.out.println("Ваш диапазон: " + "[" + min + "- " + max + "]");
                                System.out.println("1 -> Поменять min");
                                System.out.println("2 -> Поменять max");
                                System.out.println("3 -> Назад");

                                int select = scanner.nextInt();

                                if (select == 1) {
                                    System.out.println(ANSI_GREEN + "Введите min: " + ANSI_RESET);
                                    min = scanner.nextInt();
                                } else if (select == 2) {
                                    System.out.println(ANSI_BLUE + "Введите max: " + ANSI_RESET);
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
                        } else if (num == 3) {
                            System.out.println(ANSI_PURPLE + "\n-------------Уровень сложности-------------" + ANSI_RESET);

                            while (true) {

                                System.out.println("1 -> Количество попыток");
                                System.out.println("2 -> Подсказки");
                                System.out.println("3 -> Назад");

                                int select = scanner.nextInt();

                                if (select == 1) {
                                    System.out.println("Введите количество попыток: ");
                                    int tempLimit = scanner.nextInt();
                                    if (tempLimit > 0) {
                                        limit = tempLimit;
                                        System.out.println("Теперь количество попыток: " + limit);
                                    } else {
                                        System.out.println("Количество попыток не может быть равно или меньше 0");
                                    }

                                } else if (select == 2) {
                                    System.out.println("--> true - с подсказками");
                                    System.out.println("--> false - без подсказок");

                                    isHelp = scanner.nextBoolean();
                                    System.out.println("Подсказки " + isHelp);

                                } else if (select == 3) {
                                    System.out.println("Назад");
                                    break;
                                }
                            }
                        } else if (num == 4) {
                            System.out.println("Назад");
                            break;
                        } else
                            System.out.println(name + ",Вы ввели некорректные данные!!!\n Повторите попытку!");
                    }
                } else if (num == 4) {
                    System.out.println("Выход");
                    break;
                } else
                    System.out.println(name + ",Вы ввели некорректные данные!!!\n Повторите попытку!");
            }
        }
    }


