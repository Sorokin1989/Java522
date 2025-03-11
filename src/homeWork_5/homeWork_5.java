package homeWork_5;

import java.util.Scanner;

public class homeWork_5 {
    public static void main(String[] args) {
        /* 1) Напишите программу, которая проверяет день недели по его номеру
         (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.*/

        System.out.println("Введите день недели от 1 до 7: ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный ввод");
        }



 /* 2)Напишите программу, которая проверяет, какой месяц по номеру введен пользователем
(1 — Январь, 2 — Февраль и т.д.) и выводит его название.*/

        System.out.println("Введите номер месяца от 1 до 12: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {

            default:
                System.out.println("Некорректный ввод");
                break;
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;


        }

/* 3) Напишите программу, которая проверяет номер счета (от 1 до 5)
и выводит текст "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.*/

        System.out.println("Введите номер счета от 1 до 5: ");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();

        switch (number) {
            case 1:
                System.out.println("Выбран первый счет");
                break;
            case 2:
                System.out.println("Выбран второй счет");
                break;
            case 3:
                System.out.println("Выбран третий счет");
                break;
            case 4:
                System.out.println("Выбран четвертый счет");
                break;
            case 5:
                System.out.println("Выбран пятый счет");
                break;
            default:
                System.out.println("Введен некорректный номер ");

        }


/* 4) Напишите программу, которая принимает на вход оценку (целое число от 1 до 5)
 и выводит соответствующую строку: "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".*/


        System.out.println("Введите оценку от 1 до 5: ");

        Scanner scanner2=new Scanner(System.in);
        int num=scanner2.nextInt();

        switch (num) {
            case 1:
                System.out.println("Кол");
                break;
            case 2:
                System.out.println("");
        }



/* 5) Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том,
является ли она гласной (A, E, I, O, U, Y) или согласной.*/


//6) Напишите программу, которая по введенному символу определяет его тип: цифра, буква или специальный символ.


/* 7) Напишите программу, которая выводит название операционной системы в зависимости от введенного кода:
1 — Windows, 2 — Linux, 3 — macOS.*/


/* 8) Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека:
"Ребенок", "Подросток", "Взрослый", "Пожилой".*/


/* 9) Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года:
 "Зима", "Весна", "Лето", "Осень". */


        /* 10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP) выводит название валюты на русском языке: "Доллар США", "Евро", "Британский фунт".
         */
    }

}