package homeWork_22;

public class HomeWork_22 {
    public static void main(String[] args) {
        //Задание 1 — Наследование и инкапсуляция
        //Создай класс Employee с полями name, age, id.
        //Сделай так, чтобы поле id было уникальным для каждого нового сотрудника.
        //Добавь геттеры и сеттеры, при этом:
        //Возраст можно установить только в диапазоне от 18 до 65.
        //Имя не должно быть пустым.
        //Создай класс Manager, который наследуется от Employee и добавь ему поле department
        Manager manager = new Manager("Дмитрий", 36, "Отдел маркетинга");
        Manager manager1 = new Manager("Владимир", 32, "Отдел финансов");
        Manager manager2 = new Manager("Николай", 25, "Отдел персонала");


        //  manager.setName("");
        // manager.setAge(20);

        System.out.println(manager.getId() + " " + manager.getName() + " "
                + manager.getAge() + " " + manager.getDepartment());

        System.out.println(manager1.getId() + " " + manager1.getName() + " "
                + manager1.getAge() + " " + manager1.getDepartment());

        System.out.println(manager2.getId() + " " + manager2.getName() + " "
                + manager2.getAge() + " " + manager2.getDepartment());

        System.out.println();


        //
        //
        //Задание 2 — Статические поля и методы
        //Создай класс User, который хранит количество всех созданных пользователей (static count).
        //Каждый раз при создании объекта User, count должен увеличиваться.
        //Добавь static метод getCount() для получения общего числа пользователей.
        //Добавь static блок инициализации, который выводит сообщение при первом запуске класса.
        //

        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User.getCount();


        //
        //Задание 3 — Проверка валидности данных и вывод
        //Создай класс Person с полями name, age.
        //Добавь метод boolean isValid() — возвращает true, если:
        //имя не null и не пустое
        //возраст > 0
        //Добавь метод printInfo(), который выводит имя и возраст только если данные валидны.
        //

        System.out.println();
        Person person = new Person("Дмитрий", 36);
        Person person1 = new Person("Владимир", 23);
        Person person2 = new Person("Николай", 33);

        System.out.println(person.isValid());
        System.out.println(person1.isValid());
        System.out.println(person2.isValid());

        person.printInfo();
        person1.printInfo();
        person2.printInfo();

        //
        //Задание 4 — Использование final и проверок
        //Создай класс Passport с полями:
        //final String number — номер паспорта (неизменяемый)
        //String nationality
        //Добавь конструктор, геттеры.
        //Создай класс Citizen, у которого есть поле Passport passport.
        //Добавь метод, который печатает паспортные данные гражданина.

        Passport passport = new Passport("12344546", "Русский");
        Citizen citizen = new Citizen(passport);
        System.out.println();

        citizen.printInfo();


    }
}

class Employee {
    protected String name;
    protected int age;
    protected int id;
    public static int count;

    static {
        count = 1;
    }

    Employee(String name, int age) {
        this.name = name;
        if (age > 0 && age < 100)
            this.age = age;
        else this.age = 18;
        this.id = count++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65)
            this.age = age;
    }

    public int getId() {
        return id;
    }

}

class Manager extends Employee {
    private String department;


    Manager(String name, int age, String department) {
        super(name, age);
        if (department != null && !department.isBlank()) {
            this.department = department;
        } else
            this.department = " ";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isBlank()) {
            this.department = department;
        }
    }
}

class User {
    static int count;


    static {
        count = 0;
        System.out.println("Создание пользователей");
    }

    User() {
        count++;
    }

    static void getCount() {
        System.out.println("Количество созданных пользователей: " + count);
    }

}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isValid() {
        if (name != null && !name.isBlank() && age > 0) {
            return true;
        }
        return false;
    }

    public void printInfo() {
        if (isValid()) {
            System.out.println(name + " " + age);
        }
    }
}


class Passport {
    private final String number;
    private String nationality;

    Passport(String number, String nationality) {
        this.number = number;
        if (nationality != null && !nationality.isBlank()) {
            this.nationality = nationality;
        } else
            this.nationality = " ";
    }


    public String getNumber() {
        return number;
    }

    public String getNationality() {
        return nationality;
    }
}

class Citizen {
    private Passport passport;

    public Citizen(Passport passport) {
        this.passport = passport;
    }

    public void printInfo() {
        System.out.println("Паспорт №: " + passport.getNumber());
        System.out.println("Национальность: " + passport.getNationality());
    }

}

