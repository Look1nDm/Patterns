package behavioral.strategy.model;

import behavioral.strategy.behavInterfaces.FlyBehavior;
import behavioral.strategy.behavInterfaces.QuackBehavior;

public abstract class Duck {
    public Duck() {
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("Я могу плавать");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
