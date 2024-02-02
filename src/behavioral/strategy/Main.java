package behavioral.strategy;

import behavioral.strategy.behavClasses.FlyRocket;
import behavioral.strategy.model.Duck;
import behavioral.strategy.model.MallardDuck;
import behavioral.strategy.model.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();
        System.out.println();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocket());
        modelDuck.performFly();
    }
}
