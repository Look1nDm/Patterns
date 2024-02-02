package behavioral.strategy.model;

import behavioral.strategy.behavClasses.FlyWithWings;
import behavioral.strategy.behavClasses.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
