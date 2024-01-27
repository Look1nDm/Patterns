package creational.abstractFactory.battleOfCorussan;

import creational.abstractFactory.interfaces.Sith;

public class CorussanSith implements Sith {
    @Override
    public void goToAttackSoldiers() {
        System.out.println("Go to Attack solders for the Empire!!!");
    }
}
