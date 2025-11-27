package HomeWork1;


abstract class TransportCreator {
    public abstract Transport createTransport();

    public void move() {
        Transport transport = createTransport();
        transport.move();
    }
}

interface Transport {
    void move();
}

class PlaneCreator extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}

class CarCreator extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class BikeCreator extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new Bike();
    }
}


class Plane implements Transport {

    @Override
    public void move() {
        System.out.println("Самолет летит");
    }
}


class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Машина едет");
    }
}

class Bike implements Transport {

    @Override
    public void move() {
        System.out.println("Велосипед едет");
    }
}


public class FactoryMethod {
    public static void main(String[] args) {

        TransportCreator planeCreator = new PlaneCreator();
        planeCreator.move();


        TransportCreator carCreator = new CarCreator();
        carCreator.move();

        TransportCreator bikeCreator = new BikeCreator();
        bikeCreator.move();

    }
}
