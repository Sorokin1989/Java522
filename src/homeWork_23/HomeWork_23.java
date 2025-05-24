package homeWork_23;

public class HomeWork_23 {
    public static void main(String[] args) {
        //1. Финальный класс
        //Задание:
        //Создай финальный класс MathConstants, в котором будут финальные переменные PI и E.
        //Попробуй создать от него наследника. Объясни, что произошло и почему.

        // выходит ошибка (Cannot inherit from final 'homeWork_23.MathConstants')
        //нельзя наследоваться от класса с ключевым словом final.
        //final значит последний класс, у которого не может быть наследников.
        //

        //2. Переопределение метода (Overriding)
        //Задание:
        //Создай класс Animal с методом speak(), который выводит "Животное издает звук".
        //Создай класс Dog, который наследует Animal и переопределяет метод speak() — пусть выводит "Собака лает".
        //Создай объект Animal и Dog и вызови метод speak() у каждого.
        //

        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.speak();
        dog.speak();

        //3. Наследование
        //Задание:
        //Создай класс Person с полями name и age.
        //Создай подкласс Student, добавь поле university.
        //Создай конструкторы и методы для вывода полной информации.
        //Создай объект Student и выведи данные.

        Student student = new Student("Дмитрий", 20, "Московский Государственный Университет");
        student.printInfo();

        //
        //4. Абстрактный класс
        //Задание:
        //Создай абстрактный класс Shape с абстрактным методом getArea() и обычным методом printInfo().
        //Создай класс Circle, который наследует Shape и реализует метод getArea().
        //Создай объект Circle и выведи площадь круга.

        Circle circle = new Circle(10);
        circle.printInfo();

        //
        //
        //5. Абстрактный метод + массив объектов
        //Задание:
        //Создай абстрактный класс Employee с методом calculateSalary().
        //Создай два подкласса: FullTimeEmployee и PartTimeEmployee, каждый со своей реализацией зарплаты.
        //Создай массив Employee[] и заполни его объектами разных классов. Выведи зарплату каждого.
        //
        Employee[] employees = new Employee[6];
        employees[0] = new FullTimeEmployee("Дмитрий", 8, 500);
        employees[1] = new FullTimeEmployee("Владимир", 8, 400);
        employees[2] = new FullTimeEmployee("Николай", 8, 450);
        employees[3] = new PartTimeEmployee("Владислав", 8, 450);
        employees[4] = new PartTimeEmployee("Мария", 8, 550);
        employees[5] = new PartTimeEmployee("Екатерина", 8, 350);
        System.out.println();
        employees[0].calculateSalary();
        employees[1].calculateSalary();
        employees[2].calculateSalary();
        employees[3].calculateSalary();
        employees[4].calculateSalary();
        employees[5].calculateSalary();


        //
        //6. int[] arr = {9,1,7,2,8,4,5,0,2};
        //
        //Отсортировать массив
        //Нельзя использовать готовое решение
    }
}

final class MathConstants {
    final double PI;
    final double E;

    MathConstants(double pi, double e) {
        PI = pi;
        E = e;
    }
}

//class A extends MathConstants {
//}

class Animal {
    public void speak() {
        System.out.println("Животное издаёт звук");
    }

}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Собака лает");
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }
}

class Student extends Person {
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;


    }

    public void printInfo() {
        System.out.println(getName() + " " + getAge() + " " + getUniversity());

    }
}

abstract class Shape {
    abstract double getArea();

    double square;

    void printInfo() {
        System.out.println("Площадь фигуры: ");
    }


}

class Circle extends Shape {
    double R;
    final double PI;

    Circle(double R) {
        this.PI = 3.14;
        this.R = R;
    }

    @Override
    double getArea() {
        return square = PI * R * R;
    }

    @Override
    void printInfo() {
        System.out.println("Площадь круга: " + getArea());

    }
}

abstract class Employee {
    final int WorkDaysOfMonth = 22;
    double standardHourlyRate;
    int numberOfWorkingHoursPerDay;
    double salary;
    String name;

    public Employee(String name, double standardHourlyRate, int numberOfWorkingHoursPerDay ) {
        if (standardHourlyRate>0) {
            this.standardHourlyRate = standardHourlyRate;
        }
        if (numberOfWorkingHoursPerDay>0) {
            this.numberOfWorkingHoursPerDay = numberOfWorkingHoursPerDay;
        }
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {


    public FullTimeEmployee(String name, double standardHourlyRate, int numberOfWorkingHoursPerDay ) {
        super(name, standardHourlyRate, numberOfWorkingHoursPerDay );
    }

    @Override
    void calculateSalary() {
        salary = standardHourlyRate * (double) numberOfWorkingHoursPerDay * WorkDaysOfMonth;
        System.out.println(name + " " + "Зарплата: " + salary + " рублей");

    }
}

class PartTimeEmployee extends Employee {


    public PartTimeEmployee(String name, double standardHourlyRate, int numberOfWorkingHoursPerDay) {
        super(name,standardHourlyRate, numberOfWorkingHoursPerDay);
    }

    @Override
    void calculateSalary() {
        salary = standardHourlyRate * ((double) numberOfWorkingHoursPerDay * WorkDaysOfMonth / 2);
        System.out.println(name + " " + "Зарплата: " + salary + " рублей");

    }
}
