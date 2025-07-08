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
    private final int id;
    private final String name;
    private final String surname;
    private final int phoneNumber;
    private final int age;
    private final String gender;

    public Contact(String name, String surname, int phoneNumber, int age, String gender) {
        this.gender = gender;
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.age = age;
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
    public void contactAdd() {
        System.out.println("Введите имя контакта: ");
        String name= scanner.nextLine();
        System.out.println("Введите фамилию контакта");
        String surname= scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        int phoneNumber= scanner.nextInt();
        System.out.println("Введите возраст");
        int age= scanner.nextInt();
        System.out.println("Введите пол (Мужской/Женский");
        Contact contact=new Contact(name,surname,phoneNumber,age,gender);
        PhoneBook.contacts.add(contact);
        System.out.println("Контакт добавлен!");



    }
}
