package HomeWork2;


import java.util.HashMap;
import java.util.Map;

class AnimalType {
    private String animalType;


    public AnimalType(String animalType) {
        this.animalType = animalType;
        System.out.println("Создан тип: " + animalType);
    }

    public void makeSound(String name) {
        if (animalType.equals("Собака")) {
            System.out.println(name + " Гав-гав");
        } else if (animalType.equals("Кошка")) {
            System.out.println(name + " Мяу");
        }
    }
}

class AnimalFactory {
    private static Map<String, AnimalType> animalTypes = new HashMap<>();

    public static AnimalType getType(String animalType) {
        if (!animalTypes.containsKey(animalType)) {
            animalTypes.put(animalType, new AnimalType(animalType));
        }
        return animalTypes.get(animalType);
    }


}

class Animal {
    private String name;
    private AnimalType animalType;

    public AnimalType getAnimalType() {
        return animalType;
    }

    public Animal(String name, String animalType) {
        this.name = name;
        this.animalType = AnimalFactory.getType(animalType);
    }

    public void makeSound() {
        animalType.makeSound(name);
    }
}


public class Flyweight {
    public static void main(String[] args) {
        Animal animal = new Animal("Жучка", "Собака");
        Animal animal1 = new Animal("Шарик", "Собака");
        Animal animal2 = new Animal("Барсик", "Кошка");
        Animal animal3 = new Animal("Мурзик", "Кошка");
        Animal animal4 = new Animal("Бобик", "Собака");

        animal.makeSound();
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal4.makeSound();


        System.out.println(animal.getAnimalType()==animal1.getAnimalType());


    }
}
