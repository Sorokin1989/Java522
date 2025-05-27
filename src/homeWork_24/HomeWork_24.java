package homeWork_24;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double R;
    final double PI;

    Circle(double R) {
        if (R>0) {
            this.R = R;
        }
        this.PI = 3.14;
    }

    @Override
    public double area() {
        return PI*R*R;
    }

    @Override
    public double perimeter() {
        return 2*PI*R;
    }
}
class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        if (length>0) {
            this.length = length;
        }
        if (width>0) {
            this.width = width;
        }
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
class Triangle implements Shape {

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}

// ////////////////////////////////////////////////////////////////////////
interface Movable {
    void moveForward();
    void moveBackWard();

}
class Car implements Movable{
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
class Animal implements Movable{
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
        Car car=new Car();
        car.moveForward();
        car.moveBackWard();
        Robot robot=new Robot();
        robot.moveForward();
        robot.moveBackWard();
        Animal animal=new Animal();
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


        // 3. Интерфейс "Музыкальный инструмент"
        //Создай интерфейс Instrument с методом:
        //
        //void play();
        //
        //Реализуй интерфейс в классах: Guitar, Piano, Drums.
        //
        //
        //
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
