package ExaminationWork;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PhoneBook {
    static Scanner scanner = new Scanner(System.in);
    static List<User> users;
    static List<Contact> contacts;
    static final String USERS_FILE = "users.txt";
    private final static String fileContact = "contacts.txt";
    private final static String fileLogger = "logger.txt";
    private final static String fileUserName = "username.txt";

    public static void main(String[] args) {

        // users = FileManager.loadUsers(USERS_FILE);


        while (true) {
            try {
                System.out.println("------------------------");
                System.out.println("|Телефонная книга      |\n" +
                        "|1 - Войти             |\n" +
                        "|2 - Зарегистрироваться|\n" +
                        "|3 - Выход             |");
                System.out.println("------------------------");

                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                        singIn();
                        break;
                    case 2:
                        System.out.println("Регистрация");
                        break;
                    case 3:
                        System.out.println("Выход");
                        return;
                    default:
                        System.out.println("Введите правильное значение!");
                }


            } catch (Exception e) {
                System.out.println("Ошибка ввода! Введите число!  ");
                scanner.next();
            }
        }


    }

    static void singIn() {
        System.out.println("Введите имя пользователя: ");
        String username = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        Optional<User> userOptional = users.stream().filter(x -> x.getUsername().equals(username)).findFirst();
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                System.out.println("Успешный вход!");

            }
        }


    }

    static void userMenu() {
        while (true) {
            System.out.println("1---> Контакты\n" +
                    "2---> Поиск\n" +
                    "3---> Фильтрация\n" +
                    "4---> Сортировка\n" +
                    "5---> Логирование\n" +
                    "6---> Назад");

            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("контакты");

                    break;
                case 2:
                    System.out.println("поиск");
                    break;
                case 3:
                    System.out.println("фильтрация");
                case 4:
                    System.out.println("сортировка");
                case 5:
                    System.out.println("логирование");
                case 6:
                    System.out.println("назад");
                    break;
                default:
                    System.out.println("Введите корректное значение!");
            }
        }
    }

    static void contactsMenu() {
        while (true) {
            System.out.println("1---> Добавить\n" +
                    "2---> Удалить\n" +
                    "3---> Редактировать\n" +
                    "4---> Отобразить\n" +
                    "5---> Назад");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Добавить");
                    break;
                case 2:
                    System.out.println("Удалить");
                    break;
                case 3:
                    System.out.println("Редактировать");
                    break;
                case 4:
                    System.out.println("Отобразить");
                    break;
                case 5:
                    System.out.println("назад");
                    break;
                default:
                    System.out.println("Некорректное значение");
            }

        }
    }

    static void searchContacts() {
        while (true) {
            System.out.println("0---> Регистр OFF\n" +
                    "1---> По имени\n" +
                    "2---> По фамилии\n" +
                    "3---> По номеру\n" +
                    "4--->По всем параметрам\n" +
                    "5---> Спец поиск (_ , %)\n" +
                    "6---> Назад");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("0---> Регистр OFF\n");
                    break;
                case 2:
                    System.out.println("1---> По имени\n");
                    break;
                case 3:
                    System.out.println("3---> По номеру\n");
                    break;
                case 4:
                    System.out.println("4--->По всем параметрам\n");
                    break;
                case 5:
                    System.out.println("5---> Спец поиск (_ , %)\n");
                case 6:
                    System.out.println("Назад");
                    return;
                default:
                    System.out.println("Введите корректное значение");
            }
        }
    }

    static void filterContacts() {
        while (true) {
            System.out.println("1--->только мужчины\n" +
                    "2--->только женщины\n" +
                    "3---> возраст больше n\n" +
                    "4---> возраст меньше n");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("1--->только мужчины\n");
                    break;
                case 2:
                    System.out.println("2--->только женщины\n");
                    break;
                case 3:
                    System.out.println("3--->возраст больше n");
                    break;
                case 4:
                    System.out.println("4---> возраст меньше n");
                    break;
                default:
                    System.out.println("Некорректное значение!");
            }

        }

    }

    static void sortContacts() {

    }

    static void showLogger() {

    }

}
