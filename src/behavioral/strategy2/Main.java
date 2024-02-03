package behavioral.strategy2;

import behavioral.strategy2.model.*;

public class Main {
    public static void main(String[] args) {
        Player archer = new Archer();
        archer.performWeaponUse();
        archer.performReflectionUse();
        System.out.println();

        Player knight = new Knight();
        knight.performWeaponUse();
        knight.performReflectionUse();
        System.out.println();

        Player rouge = new Rouge();
        rouge.performWeaponUse();
        rouge.performReflectionUse();
        System.out.println();

        Player warrior = new Warrior();
        warrior.performWeaponUse();
        warrior.performReflectionUse();

    }
}
