package homeWork_5;


import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите букву (A-Z): ");
            String input = scanner.nextLine().toUpperCase(); // Приведем введенную строку к верхнему регистру

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Ошибка: Пожалуйста, введите одну букву от A до Z.");
            } else {
                char letter = input.charAt(0); // Получаем введенную букву
                if ("AEIOUY".indexOf(letter) != -1) {
                    System.out.println("Буква '" + letter + "' является гласной.");
                } else {
                    System.out.println("Буква '" + letter + "' является согласной.");
                }
            }
            scanner.close(); // Закрываем сканер
        }
    }

