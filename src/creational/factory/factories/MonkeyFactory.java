package creational.factory.factories;

import creational.factory.interfaces.Animal;
import creational.factory.interfaces.AnimalFactory;
import creational.factory.entities.Monkey;

public class MonkeyFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Monkey();
    }
}
