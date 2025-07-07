package ExaminationWork;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PhoneBook {
    static Scanner scanner=new Scanner(System.in);
    static List<User> users;
    static List<Contact> contacts;
    static final String USERS_FILE = "users.txt";

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

                int select= scanner.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Войти");
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
        String username=scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password=scanner.nextLine();

        Optional<User> userOptional=users.stream().filter(x->x.getUsername().equals(username)).findFirst();
        if (userOptional.isPresent()) {
            User user=userOptional.get();
            if (user.getPassword().equals(password)) {
                System.out.println("Успешный вход!");

            }
        }
    }
}
