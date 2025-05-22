package homeWork_22;

public class HomeWork_22 {
    public static void main(String[] args) {
        //Задание 1 — Наследование и инкапсуляция
        //Создай класс Employee с полями name, age, id.
        //Сделай так, чтобы поле id было уникальным для каждого нового сотрудника.
        //Добавь геттеры и сеттеры, при этом:
        //Возраст можно установить только в диапазоне от 18 до 65.
        //Имя не должно быть пустым.
        //Создай класс Manager, который наследуется от Employee и добавь ему поле department.

        Manager manager = new Manager("Дмитрий", 36);
        Manager manager1 = new Manager("Владимир", 32);
        Manager manager2 = new Manager("Николай", 25);

        //  manager.setName("");
        // manager.setAge(20);


        System.out.print(manager.getName() + " ");
        System.out.print(manager.getAge() + " ");
        System.out.println(manager.getId() + " ");

        System.out.print(manager1.getName() + " ");
        System.out.print(manager1.getAge() + " ");
        System.out.println(manager1.getId() + " ");

        System.out.print(manager2.getName() + " ");
        System.out.print(manager2.getAge() + " ");
        System.out.println(manager2.getId() + " ");


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
        //
        //Задание 4 — Использование final и проверок
        //Создай класс Passport с полями:
        //final String number — номер паспорта (неизменяемый)
        //String nationality
        //Добавь конструктор, геттеры.
        //Создай класс Citizen, у которого есть поле Passport passport.
        //Добавь метод, который печатает паспортные данные гражданина.
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
    String department;


    Manager(String name, int age) {
        super(name, age);
    }
}

class User {
    static int count;


    static {
        count = 0;

    }

    User() {
        count++;
    }

    static void getCount() {
        System.out.println("Количество созданных пользователей: " + count);

    }

}