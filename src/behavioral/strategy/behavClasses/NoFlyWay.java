package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.FlyBehavior;

public class NoFlyWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не могу летать вообще");
    }
}
