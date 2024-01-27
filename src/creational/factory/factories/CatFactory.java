package creational.factory.factories;

import creational.factory.interfaces.Animal;
import creational.factory.interfaces.AnimalFactory;
import creational.factory.entities.Cat;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
