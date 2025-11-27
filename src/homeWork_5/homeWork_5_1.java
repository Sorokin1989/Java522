package homeWork_5;

import java.util.Objects;
import java.util.Scanner;

public class homeWork_5_1 {
    public static void main(String[] args) {

        /* 1) Напишите программу, которая проверяет день недели по его номеру
         (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.*/

        System.out.println("Введите день недели от 1 до 7: ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Суббота");
        } else if (day == 7) {
            System.out.println("Воскресенье");
        } else
            System.out.println("Некорректный ввод");


 /* 2)Напишите программу, которая проверяет, какой месяц по номеру введен пользователем
(1 — Январь, 2 — Февраль и т.д.) и выводит его название.*/

        System.out.println("Введите номер месяца от 1 до 12: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 1)
            System.out.println("Январь");
        else if (month == 2)
            System.out.println("Февраль");
        else if (month == 3)
            System.out.println("Март");
        else if (month == 4)
            System.out.println("Апрель");
        else if (month == 5)
            System.out.println("Май");
        else if (month == 6)
            System.out.println("Июнь");
        else if (month == 7)
            System.out.println("Июль");
        else if (month == 8)
            System.out.println("Август");
        else if (month == 9)
            System.out.println("Сентябрь");
        else if (month == 10)
            System.out.println("Октябрь");
        else if (month == 11)
            System.out.println("Ноябрь");
        else if (month == 12)
            System.out.println("Декабрь");
        else
            System.out.println("Некорректное значение");


/* 3) Напишите программу, которая проверяет номер счета (от 1 до 5)
и выводит текст "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.*/

        System.out.println("Введите номер счета от 1 до 5: ");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();

        if (number == 1)
            System.out.println("Выбран первый счет");
        else if (number == 2)
            System.out.println("Выбран второй счет");
        else if (number == 3)
            System.out.println("Выбран третий счет");
        else if (number == 4)
            System.out.println("Выбран четвертый счет");
        else if (number == 5)
            System.out.println("Выбран пятый счет");
        else
            System.out.println("Введено некорректное значение");


/* 4) Напишите программу, которая принимает на вход оценку (целое число от 1 до 5)
 и выводит соответствующую строку: "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".*/


        System.out.println("Введите оценку от 1 до 5: ");

        Scanner scanner2 = new Scanner(System.in);
        int num = scanner2.nextInt();

        if (num == 1)
            System.out.println("Кол");
        else if (num == 2)
            System.out.println("Неудовлетворительно");
        else if (num == 3)
            System.out.println("Удовлетворительно");
        else if (num == 4)
            System.out.println("Хорошо");
        else if (num == 5)
            System.out.println("Отлично");
        else
            System.out.println("Некорректный ввод");



/* 5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том,
является ли она гласной (A, E, I, O, U, Y) или согласной.*/

        System.out.println("Введите заглавную букву латинского алфавита: ");
        Scanner scanner3 = new Scanner(System.in);
        String letter = scanner3.next();
        char character = letter.charAt(0);

        switch (character) {
            case 'A', 'E', 'I', 'U':
                System.out.println("Гласная");
                break;

            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z':
                System.out.println("Согласная");
            case 'Y':
                System.out.println("Является и гласной и согласной");
                break;
            default:
                System.out.println("Некорректный ввод");


        }


//6) Напишите программу, которая по введенному символу определяет его тип: цифра, буква или специальный символ.

        System.out.println("Введите символ с клавиатуры: ");

        Scanner scanner4 = new Scanner(System.in);
        String symbol = scanner4.next();
        char character2 = symbol.charAt(0);

        switch (character2) {
            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z',
                 'A', 'E', 'I', 'U', 'Y':
                System.out.println("Заглавная буква");
                break;

            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                System.out.println("Цифра");
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z',
                 'a', 'e', 'i', 'u', 'y':
                System.out.println("Строчная буква");
                break;
            case '-', '+', '*', '/', '?', '!', ',', '.', '"', ':', ';', ' ', '#', '@', '~', '`', ')', '(', '}',
                 '{', '[', ']', '=', '|', '\\', '&', '^', '%', '$':

                System.out.println("Специальный символ");
                break;
            default:
                System.out.println("Некорректный ввод");
        }


/* 7) Напишите программу, которая выводит название операционной системы в зависимости от введенного кода:
1 — Windows, 2 — Linux, 3 — macOS.*/

        System.out.println("Введите цифровой код : 1,2 или 3: ");
        Scanner scanner5 = new Scanner(System.in);
        int code = scanner5.nextInt();

        if (code == 1)
            System.out.println("Windows");
        else if (code == 2)
            System.out.println("Linux");
        else if (code == 3)
            System.out.println("macOS");
        else

            System.out.println("Некорректный ввод");



/* 8) Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека:
"Ребенок", "Подросток", "Взрослый", "Пожилой".*/

        System.out.println("Введите возраст человека: ");
        Scanner scanner6 = new Scanner(System.in);
        int age = scanner6.nextInt();

        if (age < 12) {
            System.out.println("Это ребенок");
        } else if (age >= 12 && age < 18) {
            System.out.println("Это подросток");
        } else if (age >= 18 && age < 60) {
            System.out.println("Это взрослый");
        } else if (age > 60 && age < 100) {
            System.out.println("Пожилой");
        } else {
            System.out.println("Некорректный ввод");
        }



/* 9) Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года:
 "Зима", "Весна", "Лето", "Осень". */

        System.out.println("Введите число месяца от 1 до 12: ");
        Scanner scanner7 = new Scanner(System.in);
        int s = scanner7.nextInt();

        if (s == 1 || s == 2 || s == 12)
            System.out.println("Зима");
        else if (s == 3 || s == 4 || s == 5)
            System.out.println("Весна");
        else if (s == 6 || s == 7 || s == 8)
            System.out.println("Лето");
        else if (s == 9 || s == 10 || s == 11)
            System.out.println("Осень");
        else
            System.out.println("Некорректный ввод");



        /* 10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP) выводит название валюты на русском языке:
         "Доллар США", "Евро", "Британский фунт". */

        System.out.println("Введите код валюты (USD, EUR, GBP)");
        Scanner scanner8 = new Scanner(System.in);
        String id = scanner8.nextLine();

        if (Objects.equals(id, "USD"))
            System.out.println("Доллар США");
        else if (Objects.equals(id, "EUR"))
            System.out.println("Евро");
        else if (Objects.equals(id, "GBP"))
            System.out.println("Британский фунт");
        else
            System.out.println("Некорректное значение");



    }


}




