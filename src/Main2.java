import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Простые задачи для практики
        //Задача 1. Приветствие пользователя
        //Описание:
        //Напишите программу, которая спрашивает имя пользователя и выводит приветствие, например:
        //Привет, Алексей!
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя: ");
//        String name=scanner.nextLine();
//
//        System.out.println("Привет, " + name);


        //
        //Задача 2. Калькулятор суммы двух чисел
        //Описание:
        //Попросите пользователя ввести два числа, затем выведите их сумму.
        //
//        System.out.println("Введите 2 числа: ");
//        int a= scanner.nextInt();
//        int b= scanner.nextInt();;
//
//        int sum=a+b;
//        System.out.println("Сумма " + sum);


        //Задача 3. Проверка четности числа
        //Описание:
        //Попросите пользователя ввести число. Программа должна вывести, является ли число четным или нечетным.
        //
//        System.out.println("Введите число: ");
//        int num=scanner.nextInt();
//
//        if (num%2==0) {
//            System.out.println("Число четное");
//        } else System.out.println("Число нечетное");

        //Задача 4. Угадай число
        //Описание:
        //Программа "загадывает" число от 1 до 10 (например, случайным образом), а пользователь пытается угадать. Программа говорит, угадал или нет.
        //
//        int min=1;
//        int max=10;
//        Random random=new Random();
//        int num= random.nextInt(max-min+1)+min;
//        System.out.println("Угадайте число:");
//
//while (true) {
//    int number= scanner.nextInt();
//    if (num == number) {
//        System.out.println("Вы угадали число: ");
//        return;
//    } else System.out.println("Число неверное, попробуйте еще раз");
//}
        //Задача 5. Таблица умножения
        //Описание:
        //Запросите число и выведите таблицу умножения на это число от 1 до 10.
//        System.out.println("Введите число: ");
//        int num= scanner.nextInt();;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + num + " = " + i*num);
//        }
        //
        //Задача 6. Подсчет гласных в строке
        //Описание:
        //Конечно! Вот несколько простых задач, которые помогут вам практиковаться в написании кода. Каждая задача рассчитана на начальный уровень.
        //
        //1. Вывести "Привет, мир!"
        //Задача: Напишите программу, которая выводит на экран сообщение "Привет, мир!".
        //
        //2. Сложить два числа
        //Задача: Запросите у пользователя два числа и выведите их сумму.
        //
        //3. Проверить четность числа
        //Задача: Пользователь вводит число. Проверьте, четное оно или нечетное, и выведите соответствующее сообщение.
        //
        //4. Определить больший из двух чисел
        //Задача: Введите два числа, программа должна вывести большее из них.
        //
//        System.out.println("Введите 2 числа: ");
//        int num=scanner.nextInt();
//        int num2=scanner.nextInt();
//        if (num>num2) System.out.println(num);
//        else System.out.println(num2);


        //5. Посчитать факториал числа
        //Задача: Пользователь вводит число N, программа должна посчитать и вывести факториал этого числа (например, 5! = 5×4×3×2×1).
        //
        //6. Проверить, является ли число простым
        //Задача: Вводится число. Проверьте, является ли оно простым (делится только на 1 и само на себя) и выведите результат.
        //
        //7. Игровая угадайка
        //Задача: Загадывается число от 1 до 10 (можно выбрать случайное число). Пользователь вводит свою догадку. Программа сообщает, угадал он или нет.


        //1. Обратный порядок слова
        //Задача: Пользователь вводит слово, программа выводит его наоборот.
//        String word = scanner.nextLine();
//        char[] w = word.toCharArray();
//        for (int i = w.length - 1; i >= 0; i--) {
//
//            System.out.print(w[i]);
//        }
        //
        //Пример: Ввод: программа → Вывод: аммаргорп
        //
        //2. Подсчет гласных и согласных
        //Задача: Введите строку, программа должна подсчитать и вывести количество гласных и согласных букв.
//        String wordNew = scanner.nextLine().toLowerCase();
//        char[] letters = wordNew.toCharArray();
//        char[] glass = {'a', 'e', 'i', 'o', 'u', 'y'};
//        char[] neglass = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
//                'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
//        int countGlass = 0;
//        int countNeglass = 0;
//
//
//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < glass.length; j++) {
//                if (letters[i] == glass[j]) {
//                    countGlass++;
//                }
//            }
//            for (int k = 0; k < neglass.length; k++) {
//                if (letters[i] == neglass[k]) {
//                    countNeglass++;
//                }
//            }
//
//
//        }
//        System.out.println("Гласные " + countGlass);
//        System.out.println("Согласные " + countNeglass);


        //
        //3. Таблица умножения
        //Задача: Выведите таблицу умножения на число, введённое пользователем (от 1 до 10).
        //
        //4. Проверка палиндрома
        //Задача: Пользователь вводит строку; программа проверяет, является ли она палиндромом (читается одинаково слева направо и справа налево).
        //
        //5. Сортировка массива
        //Задача: Пользователь вводит несколько чисел (например, 5 чисел). Отсортируйте эти числа по возрастанию и выведите отсортированный массив.
        //
        //6. Найти наибольший общий делитель (НОД)
        //Задача: Введите два числа, найдите и выведите их НОД.
        //
        //7. Игра "Камень, ножницы, бумага"
        //Задача: Напишите игру, где пользователь выбирает «камень», «ножницы» или «бумага», а программа случайным образом выбирает свой вариант и объявляет победителя.
//        Random random = new Random();
//
//
//
//        while (true) {
//            System.out.println("Введите число\n" +
//                    "1--> Камень\n" +
//                    "2--> Ножницы\n" +
//                    "3--> Бумага\n" +
//                    "0--> Выход");
//
//            int num = random.nextInt(3)+1;
//            int word = scanner.nextInt();
//
//
//
//            switch (word) {
//                case 0:
//                    System.out.println("Выход");
//                    return;
//                case 1:
//                    System.out.println("Камень");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    if (num == 2) {
//
//                        System.out.println("Ножницы");
//                        System.out.println("Ты выиграл!");
//                      break;
//                    }
//                    if (num == 3) {
//                        System.out.println("Бумага");
//                        System.out.println("Ты проиграл!");
//                       break;
//                    }
//                    if (num == 1) {
//                        System.out.println("Камень");
//                        System.out.println("Ничья!");
//                       break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("Ножницы");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    if (num == 2) {
//                        System.out.println("Ножницы");
//                        System.out.println("Ничья");
//                      break;
//                    }
//                    if (num == 3) {
//                        System.out.println("Бумага");
//                        System.out.println("Ты выиграл!");
//                      break;
//                    }
//                    if (num == 1) {
//                        System.out.println("Камень");
//                        System.out.println("Ты проиграл");
//                       break;
//                    }
//                    break;
//                case 3:
//                    System.out.println("Бумага");
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    if (num == 2) {
//                        System.out.println("Ножницы");
//                        System.out.println("Ты проиграл");
//                      break;
//                    }
//                    if (num == 3) {
//                        System.out.println("Бумага");
//                        System.out.println("Ничья");
//                      break;
//                    }
//                    if (num == 1) {
//                        System.out.println("Камень");
//                        System.out.println("Ты выиграл");
//                      break;
//                    }
//                    break;
//                default:
//                    System.out.println("Введите корректное значение!");
//            }
//
//        }

        //1. Нахождение минимального и максимального элементов в массиве
        //Задача:
        //Создайте массив из 10 случайных чисел. Напишите программу, которая находит и выводит
        // минимальный и максимальный элемент этого массива.
        //
//        Random random=new Random();
//        int [] arr=new int[10];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(10);
//        }
//        int min=arr[0];
//        int max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<min)
//                min=arr[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max)
//                max=arr[i];
//        }
//        System.out.println();
//        System.out.println("Минимальное значение " + min);
//        System.out.println("Минимальное значение " + max);


        //2. Проверка чисел на делимость
        //Задача:
        //Пользователь вводит число.
        //Напишите программу, которая проверяет и выводит, делится ли число на 3,
        // на 5 или на оба числа без остатка.
        //
//        System.out.println("Введите число: ");
//        int num=scanner.nextInt();
//        if (num%3==0&&num%5==0) {
//            System.out.println("Число делится без остатка!");
//        }
//        else System.out.println("Число не делится без остатка!");
        //3. Поиск суммы положительных чисел в массиве
        //Задача:
        //Создайте массив из 15 чисел, заполните его случайными значениями (можете задать вручную).
        //Подсчитайте сумму всех положительных элементов массива.
//        Random random=new Random();
//        int[] arr =new int[15];
//        int min=-100;
//        int max=100;
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= random.nextInt(max-min+1)+min;
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>0) {
//                sum+=arr[i];
//            }
//        }
//        System.out.println();
//        System.out.println("Сумма " + sum);
        //
        //4. Поворот массива
        //Задача:
        //Напишите программу, которая принимает массив из 8 элементов и "поворачивает" его на k позиций вправо (пример: при k=3, последний элемент становится 1-м, и так далее).
        //
        //5. Простая игра: угадай число
        //Задача:
        //Сгенерируйте случайное число от 1 до 50.
        //Пользователь вводит число, а программа говорит "меньше", "больше" или "угадал", и продолжается, пока пользователь не угадает число.
        Random random = new Random();
        int min = 1;
        int max = 50;
//
//
//        int number = random.nextInt(max - min + 1) + min;
//
//        while (true) {
//            System.out.println("Введите число!");
//            int num = scanner.nextInt();
//            if (num > number) {
//                System.out.println("Меньше!");
//            } else if (num < number) {
//                System.out.println("Больше!");
//            } else {
//                System.out.println("Угадал!");
//                return;
//
//            }
//        }
//        2. Массив с уникальными элементами
//        Задача:
//        Создайте массив из 10 случайных чисел от 1 до 20.
//        Обеспечьте, чтобы в массиве не было повторяющихся элементов. Выведите полученный массив.
        //4. Шахматная доска
        //Задача:
        //Создайте двумерный массив размером 8х8.
        //Заполните его так, чтобы элементы чередовались "B" (черный) и "W" (белый), наподобие шахматной доски.
        //Выведите полученную доску.


        char[][] arr = new char[8][8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = 'W';
                }
                if ((i + j) % 2 != 0) {
                    arr[i][j] = 'B';
                }
                System.out.print(arr[i][j] + "   ");
            }

        }


    }
}