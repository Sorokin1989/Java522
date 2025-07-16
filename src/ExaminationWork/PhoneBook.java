package ExaminationWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static ExaminationWork.Contact.*;
import static ExaminationWork.FileManager.*;

public class PhoneBook {
    static Scanner scanner = new Scanner(System.in);
    public static List<User> users;
    static List<Contact> contacts;
    static Contact contact;
    static String USERS_FILE;
    static String fileContact = "contacts.txt";
    private final static String fileLogger = "logger.txt";
    private final static String fileUsersName = "users.txt";
    static User currentUser = null;
    User user = new User("username", "password");


    public static List<Contact> getContacts() {
        return contacts;
    }

    public static void main(String[] args) throws IOException {


        users = FileManager.loadUsers(fileUsersName);


        while (true) {
            try {
                System.out.println("------------------------");
                System.out.println("|Телефонная книга      |\n" +
                        "|1 - Войти             |\n" +
                        "|2 - Зарегистрироваться|\n" +
                        "|3 - Выход             |");
                System.out.println("------------------------");

                int select = scanner.nextInt();
                scanner.nextLine();
                switch (select) {
                    case 1:
                        singIn();
                        break;
                    case 2:
                        signUp();
                        break;
                    case 3:
                        System.out.println("Выход");
                        return;
                    default:
                        System.out.println("Введите правильное значение!");
                }


            } catch (Exception e) {
                System.out.println("Ошибка ввода! Введите число!  " + e.getMessage());
                scanner.next();
            }
        }


    }

    static void singIn() throws IOException {
        System.out.println("Введите логин пользователя: ");
        String username = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        Optional<User> userOptional = users.stream().filter(x -> x.getUsername().equals(username)).findFirst();
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                System.out.println("Успешный вход!");
                currentUser = user;
                showLogger(currentUser, "user");

                try {
                    loadUserContacts(username);
                    //loadContact(username);
                } catch (IOException e) {
                    System.out.println("Контактов нет!");
                }
                userMenu();

            }
        }


    }

    static void signUp() {
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию пользователя: ");
        String surname = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Введите логин пользователя: ");
        String userName = scanner.nextLine();

        boolean exists = users.stream().anyMatch(x -> x.getUsername().equals(userName));
        if (exists) {
            System.out.println("Такой логин существует!");
            return;
        }
        System.out.println("Введите пароль: ");
        String password1 = scanner.nextLine();
        System.out.println("Введите пароль еще раз: ");
        String password2 = scanner.nextLine();
        if (!password1.equals(password2)) {
            System.out.println("Пароли не совпадают!");
            return;
        }
        User newUser = new User(userName, password1);

        //saveContactsToFile(userName, new ArrayList<>());
        try {
//            users.clear();
//            users.add(newUser);
            //users.clear();
            users.add(newUser);

            saveUsers(users, fileUsersName);
            System.out.println("Текущий список пользователей: ");
            for (User user : users) {
                System.out.println("Login " + user.getUsername() + " : " + " Password " + user.getPassword());
            }


            saveUser(newUser, userName);
            //saveUserContacts(userName);
            //saveUsers(users,userName);

            //saveContactsToFile(userName, new ArrayList<>());
            System.out.println("Пользователь зарегистрирован! Время регистрации " + User.getCreationUser().withSecond(0).withNano(0));
        } catch (Exception e) {
            System.out.println("Ошибка при сохранении пользователя " + e.getMessage());
        }


    }

    static void userMenu() throws IOException {
        while (true) {
            System.out.println("1---> Контакты\n" +
                    "2---> Поиск\n" +
                    "3---> Фильтрация\n" +
                    "4---> Сортировка\n" +
                    "5---> Логирование\n" +
                    "6---> Назад");

            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    contactsMenu();
                    break;
                case 2:
                    searchContacts();
                    break;
                case 3:
                    filterContacts();
                    break;
                case 4:
                    sortContacts();
                    break;
                case 5:
                    showLogger(currentUser, "user");
                    break;
                case 6:
                    System.out.println("назад");
                    return;
                default:
                    System.out.println("Введите корректное значение!");
            }
        }
    }

    static void contactsMenu() throws IOException {
        while (true) {
            System.out.println("1---> Добавить\n" +
                    "2---> Редактировать\n" +
                    "3---> Удалить\n" +
                    "4---> Отобразить\n" +
                    "5---> Назад");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    contactAdd(contacts, currentUser.getUsername());
                    showLogger(currentUser, "add");
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    while (true) {
                        System.out.println("1---> Удаление по ID\n" +
                                "2---> Удаление по имени\n" +
                                "3---> Назад");
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        switch (num) {
                            case 1:
                                deleteContactToID();
                                showLogger(currentUser, "delete");
                                break;
                            case 2:
                                deleteContactToName();
                                showLogger(currentUser, "delete");
                                break;
                            case 3:
                                System.out.println("Назад");
                                break;
                            default:
                                System.out.println("Введите правильное значение!");
                        }
                        if (num == 3)
                            break;
                    }
                    break;


                case 4:
                    printContact();
                    break;
                case 5:
                    System.out.println("назад");
                    return;
                default:
                    System.out.println("Некорректное значение");
            }

        }
    }

    static void loadUserContacts(String userName) throws IOException {
        String dirName = "contacts/";
        String fileName = dirName + userName + "_" + fileContact;
        File dir = new File(dirName);
        File file = new File(fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file.exists()) {
            contacts = new ArrayList<>();
            try {
                // saveContactsToFile(userName, contacts);
                createFileContact(userName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //
        } else {

            contacts = FileManager.loadContact(fileName);
            if (contacts == null) {
                contacts = new ArrayList<>();
            }

        }
    }


//    static void saveUserContacts(String userName) {
//        saveContactsToFile("contacts/" + userName + "_contacts.txt", contacts);
//    }

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
            scanner.nextLine();

            switch (select) {
                case 0:
                    System.out.println("0---> Регистр OFF\n");
                    notRegistr();
                    break;
                case 1:
                    System.out.println("1---> По имени\n");
                    findContactToName(contacts);
                    break;
                case 2:
                    System.out.println("2---> По фамилии\n");
                    findContactToSurname(contacts);
                    break;
                case 3:
                    System.out.println("3---> По номеру\n");
                    findContactToPhoneNumber(contacts);
                    break;
                case 4:
                    System.out.println("4--->По всем параметрам\n");
                    findContact_Name_Surname_Number(contacts);
                    break;
                case 5:
                    System.out.println("5---> Спец поиск (_ , %)\n"); //надо релизовать!
                    break;
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
                    "4---> возраст меньше n\n" +
                    "5---> Назад");

            int select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    System.out.println("1--->только мужчины\n");
                    filterGenderMan();
                    break;
                case 2:
                    System.out.println("2--->только женщины\n");
                    filterGenderWomen();
                    break;
                case 3:
                    System.out.println("3--->возраст больше n");
                    filterAgeMore();
                    break;
                case 4:
                    System.out.println("4---> возраст меньше n");
                    filterAgeLess();
                    break;
                case 5:
                    System.out.println("Назад");
                    return;
                default:
                    System.out.println("Некорректное значение!");
            }

        }

    }

    static void sortContacts() {
        while (true) {
            System.out.println("1---> Сортировка по имени: \n" +
                    "2---> Сортировка по фамилии: \n" +
                    "3---> Сортировка по номеру телефона: \n" +
                    "4---> Назад");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    System.out.println(" Сортировка по имени");
                    break;
                case 2:
                    System.out.println("Сортировка по фамилии:");
                    break;
                case 3:
                    System.out.println("Сортировка по номеру телефона:");
                    break;
                case 4:
                    System.out.println("назад");
                    return;
                default:
                    System.out.println("Введите правильное значение!");
            }
        }
    }

    static void showLogger(User user, String messageType) {
        String filename = user.toString() + "_" + fileLogger;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {

            String message;
            LocalDate now = LocalDate.now();
            LocalTime time = User.getCreationUser().withSecond(0).withNano(0);
            if ("user".equals(messageType)) {
                message = "Пользователь вошел в систему!";
            } else if ("delete".equals(messageType)) {
                message = "Пользователь удалил контакт!";
            } else if ("add".equals(messageType)) {
                message = "Пользователь добавил контакт";
            } else if ("edit".equals(messageType)) {
                message = "Пользователь отредактировал контакт";
            } else if ("sort".equals(messageType)) {
                message = "Пользователь сделал сортировку";
            } else
                message = "Неизвестное сообщение!";


            writer.write("\n" + now + " " + time + " " + currentUser + " " + message);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении логирования!" + e.getMessage());
        }

    }

    public static String getFileContact() {
        return fileContact;
    }

    public static void setFileContact(String fileContact) {
        PhoneBook.fileContact = fileContact;
    }
}
