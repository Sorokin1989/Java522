package LessonsTest;

interface Vehicle {
    default void start() {
        System.out.println("Двигатель запустился");
    }

    default void stop() {
        System.out.println("Двигатель остановился");
    }

    int getNumberOfWheels();
}

class Car implements Vehicle {
    //  @Override
    //  public void start() {
    //  }
//
    //  @Override
    //  public void stop() {
//
    //  }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}                           //(4 колеса)

class Bike implements Vehicle {

//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }

    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}

class Truck implements Vehicle {

    //   @Override
    //   public void start() {
//
    //   }
//
    //   @Override
    //   public void stop() {
//
    //   }

    @Override
    public int getNumberOfWheels() {
        return 6;
    }
}


public class LessonTest3 {
    public static void main(String[] args) {

//Задание 3: Интерфейс Vehicle и классы транспортных средств
//Описание:
//
//Создайте интерфейс Vehicle с методами:
//
//void start()
//void stop()
//int getNumberOfWheels()
//Реализуйте классы:
//
//Car (4 колеса)
//Bike (2 колеса)
//Truck (больше 4 колес)
//В каждом классе реализуйте методы, выводящие сообщение о запуске/остановке, а также возвращающие число колес.
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println(car.getNumberOfWheels());
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        System.out.println(bike.getNumberOfWheels());
        Truck truck = new Truck();
        truck.start();
        truck.stop();
        System.out.println(truck.getNumberOfWheels());
    }

}

