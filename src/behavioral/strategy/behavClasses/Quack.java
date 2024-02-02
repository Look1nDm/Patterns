package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Я могу квакать");
    }
}
