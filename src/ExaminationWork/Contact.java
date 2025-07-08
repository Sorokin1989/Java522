package ExaminationWork;

import java.util.Scanner;

public class Contact {
    //Уникальный ID (генерируется автоматически)
    //Имя
    //Фамилия
    //Номер телефона
    //Возраст
    static Scanner scanner = new Scanner(System.in);
    private static int idCounter = 1;
    private static int id;
    private static String name;
    private static String surname;
    private static String phoneNumber;
    private static int age;
    private static String gender;

    public Contact(String name, String surname, String phoneNumber, int age, String gender) {
        Contact.gender = gender;
        id = idCounter++;
        Contact.name = name;
        Contact.surname = surname;
        Contact.phoneNumber = phoneNumber;
        Contact.age = age;
    }

    public static void setName(String name) {
        Contact.name = name;
    }

    public static void setSurname(String surname) {
        Contact.surname = surname;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Contact.phoneNumber = phoneNumber;
    }

    public static void setAge(int age) {
        Contact.age = age;
    }

    public static void setGender(String gender) {
        Contact.gender = gender;
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
        return "id= " + id + ", " + name + ", " + surname + ", " + phoneNumber + ", " + age + ", " + gender;
    }

    public static void contactAdd() {
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию контакта");
        String surname = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Введите возраст");

        try {
            age = scanner.nextInt();
        } catch (Exception e) {
            if (age < 0 || age > 100) {
                System.out.println("Некорректный ввод возраста. Установка значения по умолчанию 0.");
                age = 0;
            }
        }
        scanner.nextLine();
        System.out.println("Введите пол (Мужской/Женский");
        gender = scanner.nextLine();
        if (gender.equalsIgnoreCase("Мужской")) {
            gender = "Мужской";
        }
        if (gender.equalsIgnoreCase("Женский")) {
            gender = "Женский";
        }
        Contact contact = new Contact(name, surname, phoneNumber, age, gender);
        PhoneBook.contacts.add(contact);
        System.out.println("Контакт добавлен!");
    }

    public static void editContact() {
        if (PhoneBook.contacts.isEmpty()) {
            System.out.println("Нет контактов для редактирования");
            return;
        }
        System.out.println("Выберите контакт для редактирования: ");
        for (int i = 0; i < PhoneBook.contacts.size(); i++) {
            Contact contact = PhoneBook.contacts.get(i);
            System.out.println("%d. %s %s, Телефон: %s, Возраст: %d, Пол: %s%n" + i + 1 + contact.getName() +
                    contact.getSurname() + contact.getPhoneNumber() + contact.getAge() + contact.getGender());
            int index = -1;

            try {
                System.out.println("Введите номер контакта: ");
                index = Integer.parseInt(scanner.nextLine()) - 1;
                if (index < 0 || index > PhoneBook.contacts.size()) {
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
            System.out.println("Введите номер пункта для редактирования: ");

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
                    setName(newName);
                    break;
                case 2:
                    System.out.println("Введите новую фамилию: ");
                    String newSurname= scanner.nextLine();
                    setSurname(newSurname);
                    break;
                case 3:
                    System.out.println("Введите новый номер телефона: ");
                    String newPhoneNumber= scanner.nextLine();
                    setPhoneNumber(newPhoneNumber);
                    break;
                case 4:
                    System.out.println("Введите новый возраст: ");
                    int newAge= scanner.nextInt();
                    setAge(newAge);
                    break;
                case 5:
                    System.out.println("Введите пол: ");
                    String newGender= scanner.nextLine();
                    setGender(newGender);
                    break;
                case 6:
                    System.out.println("Назад");
                    return;
                default:
                    System.out.println("Некорректное значение!");



            }
        }
    }
}
