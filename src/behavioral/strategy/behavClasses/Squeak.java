package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Я могу пищать");
    }
}
