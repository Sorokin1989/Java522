package TestLessons;

public class TestLessons {
    public static void main(String[] args) {
        //Задание 1: Базовое наследование
        //Описание:
        //Создайте класс Animal с полями name и species.
        // Добавьте метод makeSound(), который выводит сообщение о том, что животное издает звук.
        // Создайте подкласс Dog, который наследует Animal, и переопределите метод makeSound(),
        // чтобы он выводил "Woof!". В main() создайте объект Dog и вызовите его метод.

        Animall animal = new Animall();
        animal.makeSound();
        Animall.Dogg dogg = new Animall.Dogg();
        dogg.makeSound();

        //Задание 2: Наследование с дополнительными полями
        //Описание:
        //Создайте класс Vehicle с полями brand и year.
        // Создайте подкласс Car, добавьте поле numberOfDoors.
        // Реализуйте конструкторы и метод displayInfo(), который выводит всю информацию
        // о транспортном средстве. В main() создайте объект Car и выведите его данные.

        Car car = new Car("Хёндэ", "2019", 4);
        Car car1 = new Car("Лада", "2023", 5);
        Car car2 = new Car("Нива", "2024", 4);
        Car car3 = new Car("Лансер", "2022", 5);
        Car car4 = new Car("Хавал", "2021", 4);
        car.displayInfo();
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        car4.displayInfo();

        //Задание 3: Переопределение методов
        //Описание:
        //Создайте класс Shape с методом calculateArea(), возвращающим 0. Создайте подклассы:
        //
        //Rectangle с полями width и height, переопределите метод для вычисления площади.
        //Circle с полем radius, переопределите метод для вычисления площади.
        //В main() создайте объекты этих классов и вызовите их методы.

        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(5);

        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());

        //Задание 4: Множественное наследование через интерфейсы
        //Описание:
        //Создайте интерфейс Flyable с методом fly().
        //Создайте класс Bird, реализующий интерфейс, и добавьте поле species. В методе fly() выведите сообщение о том, что птица летит.
        //
        //Создайте класс Penguin, который наследует от Bird, но переопределяет метод так, чтобы он выводил, что пингвин не умеет летать.
        //
        //В основном классе создайте объекты и вызовите методы.
        Bird bird = new Bird();
        Penguin penguin = new Penguin();
        bird.fly();
        penguin.fly();

        //Задание 5: Абстрактные классы
        //Описание:
        //Создайте абстрактный класс Employee с полями имя и зарплата,
        // а также абстрактным методом calculateBonus().
        //
        //Создайте подклассы:
        //
        //Manager — бонус 20% от зарплаты.
        //Developer — бонус 10% от зарплаты.
        //В основном классе создайте объекты этих классов и выведите их бонусы.

        Manager manager = new Manager("Владимир", 10000);
        Developer developer = new Developer("Дмитрий", 1000000);
        System.out.println(manager.calculateBonus());
        System.out.println(developer.calculateBonus());


    }

}

class Animall {
    String name;
    String species;

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }

    static class Dogg extends Animall {

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

}

abstract class Vehicle {
    protected String brand;
    protected String year;

    public Vehicle(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void displayInfo();


}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        System.out.println(brand + " " + year + " " + numberOfDoors);

    }
}

class Shape {

    double s;


    public int calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return (int) (s = width * height);
    }

}

class Circle extends Shape {
    final double PI = 3.14;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (s = PI * radius * radius);
    }
}

interface Flyable {
    public void fly();


}

class Bird implements Flyable {
    String species;

    @Override
    public void fly() {
        System.out.println("Птица летает!");

    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("пингвин не умеет летать");
    }
}


abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

}

class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}

class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.1;
    }
}

