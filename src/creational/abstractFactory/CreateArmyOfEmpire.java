package creational.abstractFactory;

import creational.abstractFactory.interfaces.MachineGunner;
import creational.abstractFactory.interfaces.Sith;
import creational.abstractFactory.interfaces.HeavyCombatVehicle;
import creational.abstractFactory.interfaces.Stormtrooper;

public interface CreateArmyOfEmpire {
    Sith getCommander();

    Stormtrooper getStormtrooper();

    HeavyCombatVehicle getHeavyCombatVehicle();

    MachineGunner getMachineGunner();
}
