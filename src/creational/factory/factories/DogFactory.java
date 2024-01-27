package creational.factory.factories;

import creational.factory.interfaces.Animal;
import creational.factory.interfaces.AnimalFactory;
import creational.factory.entities.Dog;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
