package homeWork_24;



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
