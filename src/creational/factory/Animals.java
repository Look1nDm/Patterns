package creational.factory;

import creational.factory.factories.CatFactory;
import creational.factory.factories.DogFactory;
import creational.factory.factories.MonkeyFactory;
import creational.factory.interfaces.Animal;
import creational.factory.interfaces.AnimalFactory;

public class Animals {
    public static void main(String[] args) {
        AnimalFactory animalFactoryDog = createAnimalByKind("Dog");
        Animal dog = animalFactoryDog.createAnimal();
        dog.plowsHisTail();

        AnimalFactory animalFactoryCat = createAnimalByKind("Cat");
        Animal cat = animalFactoryCat.createAnimal();
        cat.plowsHisTail();

        AnimalFactory animalFactoryMonkey = createAnimalByKind("Monkey");
        Animal monkey = animalFactoryMonkey.createAnimal();
        monkey.plowsHisTail();
    }

    static AnimalFactory createAnimalByKind(String kind) {
        if (kind.equalsIgnoreCase("Cat")) {
            return new CatFactory();
        } else if (kind.equalsIgnoreCase("Dog")) {
            return new DogFactory();
        } else if (kind.equalsIgnoreCase("Monkey")) {
            return new MonkeyFactory();
        } else {
            throw new RuntimeException(kind + "is unknown");
        }
    }
}
