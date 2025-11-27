package HomeWork1;

interface Animal {
    void speak();
}

interface Food {
    void feed();
}

class Lion implements Animal {

    @Override
    public void speak() {
        System.out.println("Рычит");
    }
}

class Beef implements Food {

    @Override
    public void feed() {
        System.out.println("Даем мясо");
    }
}


class Cow implements Animal {

    @Override
    public void speak() {
        System.out.println("Мууууу");
    }
}

class Hay implements Food {

    @Override
    public void feed() {
        System.out.println("Даём сено");
    }
}

class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("Мяу");
    }
}

class Fish implements Food {

    @Override
    public void feed() {
        System.out.println("Даем рыбу");
    }
}

interface AnimalFactory {
    Animal createAnimal();

    Food createFood();
}

class FarmFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {

        return new Cow();
    }

    @Override
    public Food createFood() {
        return new Hay();
    }
}

class HomeFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new Fish();
    }
}

class ZooFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Lion();
    }

    @Override
    public Food createFood() {
        return new Beef();
    }
}

public class AbstactFactory {
    public static void main(String[] args) {
        AnimalFactory farm = new FarmFactory();
        Animal cow = farm.createAnimal();
        Food hay = farm.createFood();

        cow.speak();
        hay.feed();

        AnimalFactory home = new HomeFactory();
        Animal cat = home.createAnimal();
        Food fish = home.createFood();

        cat.speak();
        fish.feed();

        AnimalFactory zoo = new ZooFactory();
        Animal lion = zoo.createAnimal();
        Food beef = zoo.createFood();
        lion.speak();
        beef.feed();

    }
}
