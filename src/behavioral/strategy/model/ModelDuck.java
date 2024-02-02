package behavioral.strategy.model;

import behavioral.strategy.behavClasses.NoFlyWay;
import behavioral.strategy.behavClasses.Squeak;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new NoFlyWay();
        quackBehavior = new Squeak();
    }
}
