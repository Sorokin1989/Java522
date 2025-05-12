package ClassWork;

import java.util.Scanner;

//✅ 1. Калькулятор с выбором операции
//Условие:
//Пользователь вводит два числа и символ операции (+, -, *, /). Выведите результат.
//Цель: условные операторы, арифметика, Scanner.

public class ClassWorkCalculator {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Введите первое и второе число - ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Выберите оператор и нажмите ENTER (+ , - , * , / , %) - ");

            char op = sc.next().charAt(0);
            solve(a, b, op);
        }

        private static int solve(int a, int b, char op) {
            int ans = 0;
            if (op == '+') {
                ans = a + b;
            } else if (op == '-') {
                ans = a - b;

            } else if (op == '*') {
                ans = a * b;

            } else if (op == '/') {
                ans = a / b;
            } else if (op == '%') {
                ans = a % b;
            } else {
                System.out.println("Вы ввели не тот оператор");

            }
            System.out.println("Ваш ответ - " + ans);
            return ans;

        }

    }


