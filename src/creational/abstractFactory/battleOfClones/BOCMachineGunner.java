package creational.abstractFactory.battleOfClones;

import creational.abstractFactory.interfaces.MachineGunner;

public class BOCMachineGunner implements MachineGunner {

    @Override
    public void shootsAtEnemies() {
        System.out.println("MachineGunner destroys enemy enemy force for the Empire!!!");
    }
}
