package creational.abstractFactory.battleOfCorussan;

import creational.abstractFactory.interfaces.MachineGunner;

public class CorussanMachineGunner implements MachineGunner {
    @Override
    public void shootsAtEnemies() {
        System.out.println("MachineGunner destroys enemy enemy force for the Empire!!!");
    }
}
