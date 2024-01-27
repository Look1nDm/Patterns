package creational.abstractFactory.battleOfClones;

import creational.abstractFactory.CreateArmyOfEmpire;
import creational.abstractFactory.interfaces.HeavyCombatVehicle;
import creational.abstractFactory.interfaces.MachineGunner;
import creational.abstractFactory.interfaces.Sith;
import creational.abstractFactory.interfaces.Stormtrooper;

public class BattleOfClonesArmyFactory implements CreateArmyOfEmpire {

    @Override
    public Sith getCommander() {
        return new BOCSith();
    }

    @Override
    public Stormtrooper getStormtrooper() {
        return new BOCStormtrooper();
    }

    @Override
    public HeavyCombatVehicle getHeavyCombatVehicle() {
        return new BOCHeavyCombatVehicle();
    }

    @Override
    public MachineGunner getMachineGunner() {
        return new BOCMachineGunner();
    }
}
