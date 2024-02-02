package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.FlyBehavior;

public class FlyRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Летаю на ракете!");
    }
}
