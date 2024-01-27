package creational.abstractFactory.battleOfClones;

import creational.abstractFactory.interfaces.Sith;

public class BOCSith implements Sith {
    @Override
    public void goToAttackSoldiers() {
        System.out.println("Go to Attack solders for the Empire!!!");
    }
}
