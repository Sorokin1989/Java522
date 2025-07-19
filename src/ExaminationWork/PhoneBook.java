package ExaminationWork;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static ExaminationWork.Contact.*;
import static ExaminationWork.FileManager.*;

public class PhoneBook {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner scanner = new Scanner(System.in);
    public static List<User> users;
    static List<Contact> contacts;
    static String fileContact = "contacts.txt";
    private final static String fileLogger = "logger.txt";
    private final static String fileUsersName = "users.txt";
    static User currentUser = null;
    private final Contact contact;

    public PhoneBook(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public static List<Contact> getContacts() {
        return contacts;
    }

    public static void main(String[] args) throws IOException {


        users = FileManager.loadUsers(fileUsersName);


        while (true) {
            try {
                System.out.println(ANSI_BLUE + "------------------------" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "|" + ANSI_RESET + ANSI_GREEN + "   Телефонная книга  " + ANSI_RESET + ANSI_BLUE + " |\n" + ANSI_RESET +
                        ANSI_BLUE + "|" + ANSI_RESET + "1 -" + ANSI_BLUE + " Войти             " + ANSI_RESET + ANSI_BLUE + "|\n" + ANSI_RESET +
                        ANSI_BLUE + "|" + ANSI_RESET + "2 -" + ANSI_RED + " Зарегистрироваться" + ANSI_RESET + ANSI_BLUE + "|\n" + ANSI_RESET +
                        ANSI_BLUE + "|" + ANSI_RESET + "3 -" + ANSI_CYAN + " Выход             " + ANSI_RESET + ANSI_BLUE + "|" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "------------------------" + ANSI_RESET);

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
                       // showLogger(currentUser, "exit",);
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

               // showLogger(currentUser, "user",Contact contact);

                try {
                    loadUserContacts(username);
                } catch (IOException e) {
                    System.out.println("Контактов нет!");
                }
                userMenu();

            } else System.out.println("Пароль неверный!");
        } else System.out.println("Такого пользователя не существует!");
    }

    static void signUp() {
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию пользователя: ");
        String surname = scanner.nextLine();
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
        try {
            users.add(newUser);
            saveUsers(users, fileUsersName);
            System.out.println("Текущий список пользователей: ");
            for (User user : users) {
                System.out.println("Login " + user.getUsername() + " : " + " Password " + user.getPassword());
            }
            saveUser(newUser, userName);
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
                    printLoggerFile(currentUser + "_" + fileLogger);
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

                  //  showLogger(currentUser, "add");
                    break;
                case 2:
                    editContact(currentUser.getUsername());
                  //  showLogger(currentUser, "edit");
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
                            //    showLogger(currentUser, "delete");
                                break;
                            case 2:
                                deleteContactToName();
                             //   showLogger(currentUser, "delete");
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
                    System.out.println();
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
                createFileContact(userName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            contacts = FileManager.loadContact(fileName);
            if (contacts == null) {
                contacts = new ArrayList<>();
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
                    specialSearchContacts();
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
                  //  showLogger(currentUser, "filter");
                    break;
                case 2:
                    System.out.println("2--->только женщины\n");
                    filterGenderWomen();
                 //   showLogger(currentUser, "filter");
                    break;
                case 3:
                    System.out.println("3--->возраст больше n");
                    filterAgeMore();
                 //   showLogger(currentUser, "filter");
                    break;
                case 4:
                    System.out.println("4---> возраст меньше n");
                    filterAgeLess();
                  //  showLogger(currentUser, "filter");
                    break;
                case 5:
                    System.out.println("Назад");
                    return;
                default:
                    System.out.println("Некорректное значение!");
            }
        }
    }

    static void sortContacts() throws IOException {
        while (true) {
            System.out.println("1---> Сортировка по имени: \n" +
                    "2---> Сортировка по фамилии: \n" +
                    "3---> Сортировка по номеру телефона: \n" +
                    "4---> Назад");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    System.out.println("Выберите сортировку: ");
                    System.out.println("1---> Сортировка по имени в алфавитном порядке:\n" +
                            "2---> Сортировка по имени в обратном порядке:\n" +
                            "3---> Назад");
                    int selectNum = scanner.nextInt();
                    scanner.nextLine();

                    switch (selectNum) {
                        case 1:
                            sortToNameAlphabeticalOrder();
                            //showLogger(currentUser, "sort");
                            break;
                        case 2:
                            sortToNameReverseOrder();
                         //   showLogger(currentUser, "sort");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Выберите корректное значение!");
                    }
                    break;
                case 2:
                    System.out.println("Выберите сортировку: ");
                    System.out.println("1---> Сортировка по фамилии в алфавитном порядке:\n" +
                            "2---> Сортировка по фамилии в обратном порядке:\n" +
                            "3---> Назад");
                    selectNum = scanner.nextInt();
                    scanner.nextLine();

                    switch (selectNum) {
                        case 1:
                            sortToSurnameAlphabeticalOrder();
                          //  showLogger(currentUser, "sort");
                            break;
                        case 2:
                            sortToSurnameReverseOrder();
                          //  showLogger(currentUser, "sort");
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Выберите корректное значение!");
                    }
                    break;
                case 3:
                    System.out.println("Сортировка по номеру телефона:");
                    sortToNumber();
                   // showLogger(currentUser, "sort");
                    break;
                case 4:
                    System.out.println("назад");
                    return;
                default:
                    System.out.println("Введите правильное значение!");
            }
        }
    }

    static void showLogger(User user, String messageType, Contact contact) {
        String dirName = "loggers/";
        File dir = new File(dirName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String filename = dirName + user.toString() + "_" + fileLogger;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String message;
            LocalDate now = LocalDate.now();
            LocalTime time = User.getCreationUser().withSecond(0).withNano(0);
            if ("user".equals(messageType)) {
                message = "Пользователь вошел в систему!";
            } else if ("delete".equals(messageType)) {
                message = "Пользователь удалил контакт! "  + contact.getName() + " " + contact.getSurname() + " " +
                        contact.getPhoneNumber();;
            } else if ("add".equals(messageType)) {
                message = "Пользователь добавил контакт " + contact.getName() + " " + contact.getSurname() + " " +
                contact.getPhoneNumber();
            } else if ("edit".equals(messageType)) {
                message = "Пользователь отредактировал контакт " + contact.getName() + " " + contact.getSurname() + " " +
                        contact.getPhoneNumber();;
            } else if ("sort".equals(messageType)) {
                message = "Пользователь сделал сортировку";
            } else if ("filter".equals(messageType)) {
                message = "Пользователь сделал фильтрацию";
            } else if ("exit".equals(messageType)) {
                message = "Пользователь вышел из системы!";
            } else if ("Error".equals(messageType)) {
                message = "Ошибка! Неверный пароль или логин!";
            } else
                message = "Неизвестное сообщение!";
            writer.write("\n" + now + " " + time + " " + currentUser + " " + message);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении логирования!" + e.getMessage());
        }
    }

    public static void printLoggerFile(String filename) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("loggers/" + filename))) {
            String line;
            System.out.println("Содержимое файла логирования: ");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла логирования " + e.getMessage());
        }
    }

    public static String getFileContact() {
        return fileContact;
    }

    public static void setFileContact(String fileContact) {
        PhoneBook.fileContact = fileContact;
    }
}
