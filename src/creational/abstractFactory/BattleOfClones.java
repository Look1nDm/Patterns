package creational.abstractFactory;

import creational.abstractFactory.battleOfCorussan.BattleOfCorussanArmyFactory;
import creational.abstractFactory.interfaces.HeavyCombatVehicle;
import creational.abstractFactory.interfaces.MachineGunner;
import creational.abstractFactory.interfaces.Sith;
import creational.abstractFactory.interfaces.Stormtrooper;

public class BattleOfClones {
    public static void main(String[] args) {
        CreateArmyOfEmpire armyOfEmpire = new BattleOfCorussanArmyFactory();
        Sith sith = armyOfEmpire.getCommander();
        Stormtrooper stormtrooper = armyOfEmpire.getStormtrooper();
        HeavyCombatVehicle heavyCombatVehicle = armyOfEmpire.getHeavyCombatVehicle();
        MachineGunner machineGunner = armyOfEmpire.getMachineGunner();

        System.out.println("Creating army of Clones");
        sith.goToAttackSoldiers();
        stormtrooper.shootsAtEnemies();
        heavyCombatVehicle.shootsAtEnemies();
        machineGunner.shootsAtEnemies();
    }
}

