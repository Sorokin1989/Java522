package ExaminationWork;

import java.util.Scanner;

public class Contact {
    //Уникальный ID (генерируется автоматически)
    //Имя
    //Фамилия
    //Номер телефона
    //Возраст
    static Scanner scanner=new Scanner(System.in);
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
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
        String name= scanner.nextLine();
        System.out.println("Введите фамилию контакта");
        String surname= scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phoneNumber= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Введите возраст");
         age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите пол (Мужской/Женский");
        gender= scanner.nextLine();
        Contact contact=new Contact(name,surname,phoneNumber,age,gender);
        PhoneBook.contacts.add(contact);
        System.out.println("Контакт добавлен!");



    }
}
