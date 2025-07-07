package ExaminationWork;

public class Contact {
    //Уникальный ID (генерируется автоматически)
    //Имя
    //Фамилия
    //Номер телефона
    //Возраст
    private static int idCounter = 1;
    private final int id;
    private final String name;
    private final String surname;
    private final int phoneNumber;
    private final int age;

    public Contact(String name, String surname, int phoneNumber, int age) {
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

    @Override
    public String toString() {
        return "id= " + id + ", " + name + ", " + surname + ", " + phoneNumber + ", " + age;
    }
}
