package HomeWork2;


interface Taxi{
    void drive();
}


class RealTaxi implements Taxi{

    @Override
    public void drive() {
        System.out.println("Такси везет пассажира");
    }
}

class TaxiApp implements Taxi{
RealTaxi realTaxi;
    @Override
    public void drive() {
        if(realTaxi==null){
            realTaxi=new RealTaxi();
            System.out.println("Вызываем такси через приложение");
        }
        realTaxi.drive();
    }
}






public class Proxy {
    public static void main(String[] args) {
Taxi taxi=new TaxiApp();
taxi.drive();
taxi.drive();

    }
}
