package homeWork_24;

interface Printable {
    void print();
}

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Печатаем книгу!");
    }
}

class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Печатаем журнал!");
    }
}

class Newspaper implements Printable {
    @Override
    public void print() {
        System.out.println("Печатаем газету!");
    }
}

//  ///////////////////////////////////////////////////////////////////
interface Instrument {
    void play();
}

class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Играть на гитаре!");
    }
}

class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Играть на пианино!");

    }
}

class Drums implements Instrument {
    @Override
    public void play() {
        System.out.println("Играть на барабанах!");

    }
}

// ////////////////////////////////////////////////////////////////
interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    private double R;
    private static final double PI = 3.14;

    Circle(double R) {
        if (R > 0) {
            this.R = R;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
    }

    @Override
    public double area() {
        return PI * R * R;
    }

    @Override
    public double perimeter() {
        return 2 * PI * R;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length > 0) {
            this.length = length;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
        if (width > 0) {
            this.width = width;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    private double a;// основание треугольника
    private double b; // 1 сторона треугольника
    private double c; // 2 сторона треугольника
    private double h;// высота треугольника

    public Triangle(double a, double h) {
        if (h > 0 && a > 0) {
            this.h = h;
            this.a = a;
        } else throw new IllegalArgumentException("Число должно быть больше 0");

    }

    public Triangle(double a, double b, double c) {
        if (a > 0) {
            this.a = a;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
        if (b > 0) {
            this.b = b;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
        if (c > 0) {
            this.c = c;
        } else throw new IllegalArgumentException("Число должно быть больше 0");
    }

    @Override
    public double area() {
        return (a * h) / 2;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

// ////////////////////////////////////////////////////////////////////////
interface Movable {
    void moveForward();

    void moveBackWard();

}

class Car implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Машина едет вперёд!");
    }

    @Override
    public void moveBackWard() {
        System.out.println("Машина едет назад!");

    }
}

class Robot implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Робот идет вперед!");
    }

    @Override
    public void moveBackWard() {
        System.out.println("Робот идёт назад!");
    }
}

class Animal implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Животное бежит вперед!");
    }

    @Override
    public void moveBackWard() {
        System.out.println("Животное бежит назад!");
    }
}


public class HomeWork_24 {
    public static void main(String[] args) {
        //1. Интерфейс "Движение"
        //Создай интерфейс Movable с методами:
        //
        //void moveForward();
        //
        //void moveBackward();
        //
        //Создай классы Car, Robot, Animal, которые реализуют этот интерфейс по-своему.
        //
        //
        Car car = new Car();
        car.moveForward();
        car.moveBackWard();
        Robot robot = new Robot();
        robot.moveForward();
        robot.moveBackWard();
        Animal animal = new Animal();
        animal.moveForward();
        animal.moveBackWard();

        //2. Интерфейс "Фигура"
        //Создай интерфейс Shape с методами:
        //
        //double area();
        //
        //double perimeter();
        //
        //Создай классы Circle, Rectangle, Triangle, которые реализуют интерфейс.
        //
        //
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

        Triangle triangle = new Triangle(5, 6);
        Triangle triangle1 = new Triangle(5, 6, 8);
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle1.perimeter());


        // 3. Интерфейс "Музыкальный инструмент"
        //Создай интерфейс Instrument с методом:
        //
        //void play();
        //
        //Реализуй интерфейс в классах: Guitar, Piano, Drums.
        //
        //
        //

        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
        Drums drums = new Drums();
        drums.play();

        //4. Интерфейс "Печатное устройство"
        //Интерфейс Printable:
        //
        //void print();
        //
        //Классы: Book, Magazine, Newspaper.
        //
        //


        //5. Интерфейс "Платёжная система"
        //Интерфейс Payment:
        //
        //void pay(double amount);
        //
        //Реализующие классы: CreditCardPayment, PayPalPayment, CryptoPayment.
    }
}
