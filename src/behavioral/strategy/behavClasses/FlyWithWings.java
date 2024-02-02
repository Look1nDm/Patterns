package behavioral.strategy.behavClasses;

import behavioral.strategy.behavInterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я могу летать с помощью крыльев");
    }
}
