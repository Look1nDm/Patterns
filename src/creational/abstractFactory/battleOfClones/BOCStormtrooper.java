package creational.abstractFactory.battleOfClones;

import creational.abstractFactory.interfaces.Stormtrooper;

public class BOCStormtrooper implements Stormtrooper {
    @Override
    public void shootsAtEnemies() {
        System.out.println("Stormtrooper storms the enemy's underground labyrinths for the empire!!!");
    }
}
