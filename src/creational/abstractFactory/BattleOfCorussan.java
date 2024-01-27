package creational.abstractFactory;

import creational.abstractFactory.battleOfClones.BattleOfClonesArmyFactory;
import creational.abstractFactory.interfaces.HeavyCombatVehicle;
import creational.abstractFactory.interfaces.MachineGunner;
import creational.abstractFactory.interfaces.Sith;
import creational.abstractFactory.interfaces.Stormtrooper;

public class BattleOfCorussan {
    public static void main(String[] args) {
        CreateArmyOfEmpire armyOfCorussan = new BattleOfClonesArmyFactory();
        Sith sith = armyOfCorussan.getCommander();
        Stormtrooper stormtrooper = armyOfCorussan.getStormtrooper();
        HeavyCombatVehicle heavyCombatVehicle = armyOfCorussan.getHeavyCombatVehicle();
        MachineGunner machineGunner = armyOfCorussan.getMachineGunner();

        System.out.println("Creating army of Corussan");
        sith.goToAttackSoldiers();
        stormtrooper.shootsAtEnemies();
        heavyCombatVehicle.shootsAtEnemies();
        machineGunner.shootsAtEnemies();
    }
}
