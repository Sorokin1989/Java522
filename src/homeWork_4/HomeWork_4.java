package homeWork_4;

public class HomeWork_4 {
    public static void main(String[] args) {

        // Задание_1
        int a = 10;
        if (a > 0) {
            System.out.println("Число положительное: " + a);
        } else if (a < 0) {
            System.out.println("число отрицательное: " + a);
        } else {
            System.out.println("Число: " + a);
        }

        // Задание_2

        int b = 11;
        if (b % 2 == 0) {
            System.out.println("Это число четное: " + b);
        } else {
            System.out.println("Это число нечетное: " + b);
        }

        // Задание_3

        int age = 18;
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        // Задание_4
        int c = 12;
        if (c % 3 == 0) {
            System.out.println("Делится на 3");
        } else {
            System.out.println("Не делится на 3");
        }

        // Задание_5

        int t = 105;
        if (t > 100) {
            System.out.println("Кипит");
        } else if (t < 0) {
            System.out.println("Замерзает");
        } else {
            System.out.println("Температура От 0 до 100");
        }

        // Задание_6

        String password = "1234";

        if (password == "1234") {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        // Задание_7

        String status = "admin";
        if (status == ("admin")) {
            System.out.println("Добро пожаловать");
        } else {
            System.out.println("Доступ запрещен");
        }

        // Задание_8

        int hour = 10;
        if (hour > 6 && hour < 22) {
            System.out.println("Сейчас день");
        } else {
            System.out.println("Сейчас ночь");
        }

        // Задание_9

        int month = 12;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Не зима");
        }

        // Задание_10

        int a1 = 7;
        int b1 = 5;
        if (a1 < b1) {
            System.out.println(a1);
        } else if (b1 < a1) {
            System.out.println(b1);
        } else {
            System.out.println("Числа равны");
        }

    }
}

