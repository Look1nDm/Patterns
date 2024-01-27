package creational.factory.entities;

import creational.factory.interfaces.Animal;

public class Monkey implements Animal {
    @Override
    public void plowsHisTail() {
        System.out.println("Plows tail like a monkey");
    }
}
