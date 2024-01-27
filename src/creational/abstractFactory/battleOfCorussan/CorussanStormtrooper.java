package creational.abstractFactory.battleOfCorussan;

import creational.abstractFactory.interfaces.Stormtrooper;

public class CorussanStormtrooper implements Stormtrooper {
    @Override
    public void shootsAtEnemies() {
        System.out.println("Stormtrooper storms the enemy's underground labyrinths for the empire!!!");
    }
}
