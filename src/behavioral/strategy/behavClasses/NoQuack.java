package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Я не могу квакать");
    }
}
