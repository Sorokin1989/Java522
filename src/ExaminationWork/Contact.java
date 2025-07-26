package ExaminationWork;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static ExaminationWork.FileManager.saveContactsToFile;
import static ExaminationWork.PhoneBook.*;

public class Contact {
    static Scanner scanner = new Scanner(System.in);
    static int idCounter = 0;
    private final int id;
    private String name;
    private String surname;
    private long phoneNumber;
    private int age;
    private String gender;
    private static boolean ignoreCase;
    private static boolean found;
    private static List<Contact> contacts;

    public static void resetCounter() {
        idCounter=0;
    }

    public Contact(String name, String surname, long phoneNumber, int age, String gender) {
        this.gender = gender;
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }


    public Contact(int id, String name, String surname, long phoneNumber, int age, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;

        if (id > idCounter) {
            idCounter = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + surname + "|" + phoneNumber + "|" + age + "|" + gender + "\n";
    }

    public static void contactAdd(List<Contact> contacts, String username) {
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию контакта");
        String surname = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        long phoneNumber;
        try {
             phoneNumber = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Номер некорректен!" );
            phoneNumber=0;
            System.out.println("По умолчанию установлен 0");

        }


        System.out.println("Введите возраст");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0 || age > 105) {
                System.out.println("Некорректный возраст. Установка значения по умолчанию 0.");
                age = 0;
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод возраста. Установка значения по умолчанию 0.");
            age = 0;
        }
        System.out.println("Введите пол (Мужской/Женский)");
        String gender = scanner.nextLine();
        if ((!gender.equalsIgnoreCase("Мужской") && !gender.equalsIgnoreCase("Женский"))) {
            System.out.println("Пол некорректен! По умолчанию-- не указан");
            gender = "Не указан";
        } else if (gender.equalsIgnoreCase("Мужской")) {
            gender = "Мужской";
        } else if (gender.equalsIgnoreCase("Женский")) {
            gender = "Женский";
        }

        Contact contact = new Contact(name, surname, phoneNumber, age, gender);
        contacts.add(contact);
        System.out.println("Контакт добавлен!");
        showLogger(currentUser, "add", contact);
        try {
            saveContactsToFile(username, contacts);
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }

    public static void editContact(String username) {
        if (PhoneBook.contacts.isEmpty()) {
            System.out.println("Нет контактов для редактирования");
            return;
        }
        System.out.println("Выберите номер контакта для редактирования: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println(contact.getId() + "| Имя |" + contact.getName() +
                    "| Фамилия |" + contact.getSurname() + "| Телефон |" + contact.getPhoneNumber() +
                    "| Возраст |" + contact.getAge() + "| Пол |" + contact.getGender());
        }
        int targetId;
        try {
            System.out.println("Введите ID контакта для редактирования: ");
            targetId = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
            return;
        }
        Contact contactToEdit = null;
        for (Contact contact:PhoneBook.contacts) {
            if (contact.getId()==targetId) {
                contactToEdit=contact;
                break;
            }
        }
        if (contactToEdit==null) {
            System.out.println("Контакт с таким ID не найден!");
            return;
        }
        System.out.println("Выберите элемент для редактирования: ");
        System.out.println("1 ---> Имя\n" +
                "2 ---> Фамилия\n" +
                "3 ---> Телефон\n" +
                "4 ---> Возраст\n" +
                "5 ---> Пол\n" +
                "6 ---> Назад");
        System.out.print("Введите номер пункта для редактирования: ");
        int select;
        try {
            select = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод!");
            return;
        }

        switch (select) {
            case 1:
                System.out.println("Введите новое имя: ");
                String newName = scanner.nextLine();
                contactToEdit.setName(newName);
                break;
            case 2:
                System.out.println("Введите новую фамилию: ");
                String newSurname = scanner.nextLine();
                contactToEdit.setSurname(newSurname);
                break;
            case 3:
                System.out.println("Введите новый номер телефона: ");
                String newPhoneNumber = scanner.nextLine();
                contactToEdit.setPhoneNumber(Long.parseLong(newPhoneNumber));
                break;
            case 4:
                System.out.println("Введите новый возраст: ");

                try {
                    int newAge = Integer.parseInt(scanner.nextLine());

                    if (newAge < 0 || newAge > 105) {
                        System.out.println("Введите корректный возраст!");
                        return;
                    } else contactToEdit.setAge(newAge);
                } catch (Exception e) {
                    System.out.println("Некорректный возраст!");
                    return;
                }
                break;
            case 5:
                System.out.println("Введите пол (Мужской/Женский): ");
                String newGender = scanner.nextLine();
                contactToEdit.setGender(newGender);
                break;
            case 6:
                System.out.println("Назад");
                return;
            default:
                System.out.println("Некорректное значение!");
                return;
        }
        System.out.println("Контакт обновлен!");
        showLogger(currentUser, "edit", contactToEdit);
        try {
            saveContactsToFile(username, PhoneBook.contacts);
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }

    public static void deleteContactToID() {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список контактов пустой");
            return;
        }
        System.out.println("Выберите контакт для удаления: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println(contact.getId() + "| Имя |" + contact.getName() +
                    "| Фамилия |" + contact.getSurname() + "| Телефон |" + contact.getPhoneNumber() +
                    "| Возраст |" + contact.getAge() + "| Пол |" + contact.getGender());
        }
        int targetId;
        try {
            System.out.println("Введите ID для удаления контакта: ");
            targetId = Integer.parseInt(scanner.nextLine());

        } catch (Exception e) {
            System.out.println("Некорректный ввод. Введите правильное значение!");
            return;
        }
        while (true) {
            System.out.println("Вы уверены?\n" +
                    "1---> Да\n" +
                    "2---> Нет");
            int num;
            try {
                num = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Введите 1 или 2!!!");
                scanner.nextLine();
                continue;
            }
            switch (num) {
                case 1:
                    Contact removedContact = null;
                    for (Contact contact:PhoneBook.contacts) {
                        if (contact.getId()==targetId) {
                            removedContact=contact;
                            break;
                        }
                    }
                    if (removedContact == null) {
                        System.out.println("Контакт с таким ID не найден!");
                        return;
                    }
                    PhoneBook.contacts.remove(removedContact);
                    System.out.println("Контакт " + removedContact.getName() + " " + removedContact.getSurname() + " успешно удален!");
                    showLogger(currentUser, "delete", removedContact);

                    try {
                        saveContactsToFile(PhoneBook.currentUser.getUsername(), PhoneBook.contacts);
                    } catch (IOException e) {
                        System.out.println("Ошибка при сохранении контактов: " + e.getMessage());
                    }
                    if (PhoneBook.contacts.isEmpty()) {
                        resetCounter();
                        System.out.println("Все контакты удалены!");
                    }
                    return;
                case 2:
                    return;
                default:
                    System.out.println("Введите корректное значение!");
            }
        }
    }

    public static void deleteContactToName() {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список контактов пустой");
            return;
        }
        System.out.println("Выберите имя контакта для удаления: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println(contact.getId() + "| Имя |" + contact.getName() +
                    "| Фамилия |" + contact.getSurname() + "| Телефон |" + contact.getPhoneNumber() +
                    "| Возраст |" + contact.getAge() + "| Пол |" + contact.getGender());
        }
        System.out.println("Введите имя контакта для удаления: ");
        String nameToDelete = scanner.nextLine();
        boolean found = false;
        Iterator<Contact> iterator = PhoneBook.contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equalsIgnoreCase(nameToDelete)) {

                while (true) {
                    System.out.println("Вы уверены?\n" +
                            "1---> Да\n" +
                            "2---> Нет");
                    int num;
                    try {
                        num = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Введите 1 или 2!!!");
                        scanner.nextLine();
                        continue;
                    }
                    switch (num) {
                        case 1:
                            iterator.remove();
                            System.out.println("Контакт " + contact.getName() + " " + contact.getSurname() + " успешно удален!");
                            showLogger(currentUser, "delete", contact);
                            try {
                                saveContactsToFile(PhoneBook.currentUser.getUsername(), PhoneBook.contacts);
                            } catch (IOException e) {
                                System.out.println("Ошибка при сохранении контактов: " + e.getMessage());
                            }
                            if (PhoneBook.contacts.isEmpty()) {
                                resetCounter();
                                System.out.println("Все контакты удалены!");
                            }
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Введите корректное значение!");
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Контакт с именем '" + nameToDelete + "' не найден.");
        }
    }


    public static void printContact() {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список пустой!");
            return;
        }
        for (Contact contact : PhoneBook.contacts) {
            System.out.print(contact);
        }
    }

    public static void notRegistr() {
        System.out.println("Введите 0 для отключения учета регистра!\n" +
                "Или 1 для включения!");
        int num = scanner.nextInt();
        scanner.nextLine();
        ignoreCase = false;
        switch (num) {
            case 0:
                ignoreCase = true;
                System.out.println("Режим поиска без учета регистра включен.");
                break;
            case 1:
                ignoreCase = false;
                System.out.println("Режим с учетом регистра включен.");
                break;
            default:
                System.out.println("Введите корректное значение!");
        }
    }

    public static void findContactToName(List<Contact> contacts) {
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        found = false;
        for (Contact contact : contacts) {
            String contactName = contact.getName();
            if (ignoreCase) {
                if (contactName.equalsIgnoreCase(name)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }
            } else {
                if (contactName.equals(name)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }

            }
        }
        if (!found) {
            System.out.println("Такого контакта нет!");
        }
    }

    public static void findContactToSurname(List<Contact> contacts) {
        System.out.println("Введите фамилию контакта: ");
        String surname = scanner.nextLine();
        found = false;
        for (Contact contact : contacts) {
            String contactSurname = contact.getSurname();
            if (ignoreCase) {
                if (contactSurname.equalsIgnoreCase(surname)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }
            } else {
                if (contactSurname.equals(surname)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Такого контакта нет!");
        }
    }

    public static void findContactToPhoneNumber(List<Contact> contacts) {
        System.out.println("Введите номер телефона (Например: 9191234567): \n");
        String phoneNumber = scanner.nextLine();
        found = false;
        for (Contact contact : contacts) {
            String contactPhoneNumber = String.valueOf(contact.getPhoneNumber());
            if (contactPhoneNumber.equals(phoneNumber)) {
                System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                        contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                        contact.getGender());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Такого контакта нет!");
        }
    }

    public static void findContact_Name_Surname_Number(List<Contact> contacts) {
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию контакта: ");
        String surname = scanner.nextLine();
        System.out.println("Введите номер телефона (Например: 9191234567): \n");
        String phoneNumber = scanner.nextLine();
        found = false;
        for (Contact contact : contacts) {
            String contactName = contact.getName();
            String contactSurname = contact.getSurname();
            String contactPhoneNumber = String.valueOf(contact.getPhoneNumber());
            if (ignoreCase) {
                if (contactName.equalsIgnoreCase(name) && contactSurname.equalsIgnoreCase(surname) && contactPhoneNumber.equals(phoneNumber)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }
            } else {
                if (contactName.equals(name) && contactSurname.equals(surname) && contactPhoneNumber.equals(phoneNumber)) {
                    System.out.println("Контакт найден: \n" + contact.getId() + "|" + contact.getName() + "|" +
                            contact.getSurname() + "|" + contact.getPhoneNumber() + "|" + contact.getAge() + "|" +
                            contact.getGender());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Такого контакта нет!");
        }
    }

    public static void filterGenderMan() {
        contacts = getContacts().stream().filter(x -> x.getGender().equalsIgnoreCase("мужской")).
                collect(Collectors.toList());
        if (contacts.isEmpty()) {
            System.out.println("Таких контактов нет!");
        } else {
            for (Contact contact : contacts) {
                System.out.print(contact);
            }
            System.out.println();
        }
    }

    public static void filterGenderWomen() {
        contacts = getContacts().stream().filter(x -> x.getGender().equalsIgnoreCase("женский")).
                collect(Collectors.toList());
        if (contacts.isEmpty()) {
            System.out.println("Таких контактов нет!");
        } else {
            for (Contact contact : contacts) {
                System.out.print(contact);
            }
            System.out.println();
        }
    }

    public static void filterAgeMore() {
        System.out.println("Введите определенный возраст: ");
        try {
            int ageNum = scanner.nextInt();
            scanner.nextLine();
            if (ageNum > 0 && ageNum < 100) {
                contacts = getContacts().stream().filter(x -> x.getAge() > ageNum).collect(Collectors.toList());
                if (contacts.isEmpty()) {
                    System.out.println("Нет контактов старше " + ageNum);
                } else {
                    System.out.println("Контакты найдены: ");
                    for (Contact contact : contacts) {
                        System.out.print(contact);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Введите корректный возраст от 0 до 105!");
            }

        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение!");
            scanner.nextLine();
        }
    }

    public static void filterAgeLess() {
        System.out.println("Введите определенный возраст: ");
        try {
            int ageNum = scanner.nextInt();
            scanner.nextLine();
            if (ageNum > 0 && ageNum < 100) {
                contacts = getContacts().stream().filter(x -> x.getAge() < ageNum).collect(Collectors.toList());
                if (contacts.isEmpty()) {
                    System.out.println("Нет контактов младше " + ageNum);
                } else
                    System.out.println("Контакты найдены: ");
                for (Contact contact : contacts) {
                    System.out.print(contact);
                }
                System.out.println();

            } else {
                System.out.println("Введите корректный возраст от 0 до 99!");
            }
        } catch (Exception e) {
            System.out.println("Введите корректное значение!");
            scanner.nextLine();
        }
    }

    public static void sortToNameAlphabeticalOrder() throws IOException {

        contacts = PhoneBook.getContacts().stream().sorted(Comparator.comparing(Contact::getName)).collect(Collectors.toList());
        System.out.println("Отсортировано по имени в алфавитном порядке: ");
        System.out.println("Контакты найдены: ");
        for (Contact contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static void sortToNameReverseOrder() throws IOException {

        contacts = PhoneBook.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("Отсортировано по имени в обратном порядке: ");
        System.out.println("Контакты найдены: ");
        for (Contact contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static void sortToSurnameAlphabeticalOrder() throws IOException {
        contacts = PhoneBook.getContacts().stream().sorted(Comparator.comparing(Contact::getSurname)).collect(Collectors.toList());
        System.out.println("Отсортировано по фамилии в алфавитном порядке: ");
        System.out.println("Контакты найдены: ");
        for (Contact contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static void sortToSurnameReverseOrder() throws IOException {
        contacts = PhoneBook.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getSurname).reversed())
                .collect(Collectors.toList());
        System.out.println("Отсортировано по фамилии в обратном порядке: ");
        System.out.println("Контакты найдены: ");
        for (Contact contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static void sortToNumber() throws IOException {
        contacts = PhoneBook.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getPhoneNumber)).collect(Collectors.toList());
        System.out.println("Отсортировано по номеру телефона по возрастанию: ");
        System.out.println("Контакты найдены: ");
        for (Contact contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    static void specialSearchContacts() {
        contacts = PhoneBook.getContacts();
        System.out.println("_ -> 1 символ\n" +
                "% -> 0 или N количество символов\n");
        System.out.println("Введите слово для поиска в формате (Ива%) или (Ива_):");
        String word = scanner.nextLine().toLowerCase();
        String regex = convertTemplateToRegex(word);
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Результаты поиска: ");
        boolean find = false;
        for (Contact contact : PhoneBook.getContacts()) {
            String searchStr = contact.getSearchString().toLowerCase();
            Matcher matcher = pattern.matcher(searchStr);
            if (matcher.find()) {
                System.out.println("Контакт найден:\n " + contact);
                find = true;
            }
        }
        if (!find) {
            System.out.println("Совпадений не найдено!");
        }
    }

    public static String convertTemplateToRegex(String template) {
        StringBuilder regex = new StringBuilder();
        for (int i = 0; i < template.length(); i++) {
            char c = template.charAt(i);
            if (c == '%') {
                regex.append(".*");
            } else if (c == '_') {
                regex.append(".");
            } else {
                if ("[](){}.*+?$^|#\\".indexOf(c) != -1) {
                    regex.append("\\");
                }
                regex.append(c);
            }
        }
        return regex.toString();
    }

    public String getSearchString() {
        return name + "|" + surname + "|" + phoneNumber;
    }
}

