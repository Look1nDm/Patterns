package creational.abstractFactory.battleOfClones;

import creational.abstractFactory.interfaces.HeavyCombatVehicle;

public class BOCHeavyCombatVehicle implements HeavyCombatVehicle {
    @Override
    public void shootsAtEnemies() {
        System.out.println("HeavyCombatVehicle destroys enemy buildings for the empire!!!");
    }
}