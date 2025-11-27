package ClassWork3;

interface CurrencyConverter{
    double convert(double amount);
}

class EvroToDollar implements CurrencyConverter{

    @Override
    public double convert(double amount) {
        return amount * 1.15;
    }
}

class DollarToRuble implements CurrencyConverter{
CurrencyConverter converter;

    public DollarToRuble(CurrencyConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convert(double amount) {
        double dollar=converter.convert(amount);
        return dollar * 80.8484;
    }
}





public class Classwork3 {
    public static void main(String[] args) {
double evro=1000;
CurrencyConverter converter = new EvroToDollar();
System.out.println(converter.convert(evro));

DollarToRuble dollarToRuble = new DollarToRuble(converter);
System.out.println(dollarToRuble.convert(evro));
    }
}
