package ExaminationWork;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static ExaminationWork.FileManager.saveContactsToFile;
import static ExaminationWork.PhoneBook.currentUser;
import static ExaminationWork.PhoneBook.getContacts;

public class Contact {
    //Уникальный ID (генерируется автоматически)
    //Имя
    //Фамилия
    //Номер телефона
    //Возраст
    static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String surname;
    private String phoneNumber;
    private int age;
    private String gender;
    private String username;
    private static boolean ignoreCase;
    private static boolean found;
    private static List<Contact> contacts;

    public Contact(String name, String surname, String phoneNumber, int age, String gender) {
        this.gender = gender;
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        // this.user=user;

    }

//    public static void setUser(User user) {
//        Contact.user = user;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public String getPhoneNumber() {
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
        return id + ". " + name + "|" + surname + "|" + phoneNumber + "|" + age + "|" + gender + "\n";
    }


//    public String getUsername() {
//        return user.getUsername();
//    }

    public static void contactAdd(List<Contact> contacts, String username) {
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию контакта");
        String surname = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0 || age > 100) {
                System.out.println("Некорректный возраст. Установка значения по умолчанию 0.");
                age = 0;
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод возраста. Установка значения по умолчанию 0.");
            age = 0;
        }
        System.out.println("Введите пол (Мужской/Женский");
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
//saveContactsToFile(user.getUsername(), contacts);
        try {
            saveContactsToFile(username, contacts);
        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
        //saveContactsToFile(contacts,user.getUsername());


    }

    public static void editContact() {
        if (PhoneBook.contacts.isEmpty()) {
            System.out.println("Нет контактов для редактирования");
            return;
        }
        System.out.println("Выберите контакт для редактирования: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println("ID" + (i + 1) + "| Имя |" + contact.getName() +
                    "| Фамилия |" + contact.getSurname() + "| Телефон |" + contact.getPhoneNumber() +
                    "| Возраст |" + contact.getAge() + "| Пол |" + contact.getGender());
        }
        int index = -1;

        try {
            System.out.println("Введите номер контакта: ");
            index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index < 0 || index >= PhoneBook.contacts.size()) {
                System.out.println("Неправильный индекс!");
                return;
            }

        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
            return;
        }
        Contact contactToEdit = PhoneBook.contacts.get(index);

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
                contactToEdit.setPhoneNumber(newPhoneNumber);
                break;
            case 4:
                System.out.println("Введите новый возраст: ");

                try {
                    int newAge = Integer.parseInt(scanner.nextLine());

                    if (newAge < 0 || newAge > 100) {
                        System.out.println("Введите корректный возраст!");
                        return;
                    } else contactToEdit.setAge(newAge);
                } catch (Exception e) {
                    System.out.println("Некорректный возраст!");
                    return;
                }

                break;
            case 5:
                // scanner.nextLine();
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


    }


    public static void deleteContactToID() throws IOException {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список контактов пустой");
            return;
        }
        System.out.println("Выберите контакт для удаления: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println("ID " + (i + 1) + " Имя " + contact.getName() + " Фамилия " + contact.getSurname() +
                    " Телефон " + contact.getPhoneNumber() +
                    " Возраст " + contact.getAge() + " Пол " + contact.getGender());

        }
        int index = -1;
        try {
            System.out.println("Введите номер для удаления контакта: ");
            index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index < 0 || index >= PhoneBook.contacts.size()) {
                System.out.println("Некорректный номер. введите правильное значение!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод. Введите правильное значение!");
            return;
        }
        Contact removedContact = PhoneBook.contacts.remove(index);
        System.out.println("Контакт " + removedContact.getName() + removedContact.getSurname() + "успешно удален!");
        saveContactsToFile(PhoneBook.currentUser.getUsername(), PhoneBook.contacts);
    }

    public static void deleteContactToName() throws IOException {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список контактов пустой");
            return;
        }
        System.out.println("Выберите имя контакта для удаления: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println("ID " + (i + 1) + " Имя " + contact.getName() + " Фамилия " + contact.getSurname() +
                    " Телефон " + contact.getPhoneNumber() +
                    " Возраст " + contact.getAge() + " Пол " + contact.getGender());
        }
        System.out.println("Введите имя контакта для удаления: ");
        String nameToDelete = scanner.nextLine();
        boolean found = false;
        Iterator<Contact> iterator = PhoneBook.contacts.iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equalsIgnoreCase(nameToDelete)) {
                iterator.remove();
                System.out.println("Контакт " + contact.getName() + " " + contact.getSurname() + " успешно удален!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Контакт с именем '" + nameToDelete + "' не найден.");
        }
        saveContactsToFile(PhoneBook.currentUser.getUsername(), PhoneBook.contacts);

    }


    public static void printContact() {
        if (PhoneBook.contacts == null || PhoneBook.contacts.isEmpty()) {
            System.out.println("Список пустой!");
            return;
        }

        System.out.println(PhoneBook.contacts + "\n");
        System.out.println();
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


//        if (num.equals("0")) {
//            ignoreCase=true;
//            System.out.println("Режим поиска без учета регистра включен.");
//        } else if (num.equals("1"))
//            ignoreCase=false;
//            System.out.println("Режим с учетом регистра включен.");
//        }
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
            String contactPhoneNumber = contact.getPhoneNumber();
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
            String contactPhoneNumber = contact.getPhoneNumber();

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
            System.out.println(contacts);
        }
    }

    public static void filterGenderWomen() {
        contacts = getContacts().stream().filter(x -> x.getGender().equalsIgnoreCase("женский")).
                collect(Collectors.toList());
        if (contacts.isEmpty()) {
            System.out.println("Таких контактов нет!");
        } else {
            System.out.println(contacts);
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
                    System.out.println("Контакты найдены:\n" + contacts);
                }
            }  else {
                System.out.println("Введите корректный возраст от 0 до 99!");
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
            if (ageNum>0&&ageNum<100) {
                contacts=getContacts().stream().filter(x->x.getAge()<ageNum).collect(Collectors.toList());
                if (contacts.isEmpty()) {
                    System.out.println("Нет контактов младше " + ageNum);
                }
                else System.out.println("Контакты найдены: \n" + contacts);
            }
            else {
                System.out.println("Введите корректный возраст от 0 до 99!");
            }
        } catch (Exception e) {
            System.out.println("Введите корректное значение!");
            scanner.nextLine();
        }

    }
    public static void sortToNameAlphabeticalOrder() throws IOException {

        contacts=PhoneBook.getContacts().stream().sorted(Comparator.comparing(Contact::getName)).collect(Collectors.toList());
        System.out.println("Отсортировано по имени в алфавитном порядке: ");
        System.out.println(contacts);
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static void sortToNameReverseOrder() throws IOException {

        contacts = PhoneBook.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("Отсортировано по имени в обратном порядке: ");
        System.out.println(contacts);
        saveContactsToFile(currentUser.getUsername(), contacts);
    }





    public static  void sortToSurnameAlphabeticalOrder() throws IOException {
        contacts=PhoneBook.getContacts().stream().sorted(Comparator.comparing(Contact::getSurname)).collect(Collectors.toList());
        System.out.println("Отсортировано по фамилии в алфавитном порядке: ");
        System.out.println(contacts);
        saveContactsToFile(currentUser.getUsername(), contacts);
    }

    public static  void sortToSurnameReverseOrder() throws IOException {
        contacts = PhoneBook.getContacts().stream()
                .sorted(Comparator.comparing(Contact::getSurname).reversed())
                .collect(Collectors.toList());
        System.out.println("Отсортировано по фамилии в обратном порядке: ");
        System.out.println(contacts);
        saveContactsToFile(currentUser.getUsername(), contacts);
    }


    public static void sortToNumber() {

    }
}


