package creational.abstractFactory.battleOfCorussan;

import creational.abstractFactory.interfaces.HeavyCombatVehicle;

public class CorussanHeavyCombatVehicle implements HeavyCombatVehicle {
    @Override
    public void shootsAtEnemies() {
        System.out.println("HeavyCombatVehicle destroys enemy buildings for the empire!!!");
    }
}
