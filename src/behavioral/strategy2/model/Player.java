package behavioral.strategy2.model;

import behavioral.strategy2.behaviorInterface.ReflectBehavior;
import behavioral.strategy2.behaviorInterface.WeaponBehavior;

public abstract class Player {
    WeaponBehavior weaponBehavior;
    ReflectBehavior reflectBehavior;
    public Player() {
    }
    public void performWeaponUse(){
        weaponBehavior.useWeapon();
    }
    public void performReflectionUse(){
        reflectBehavior.reflection();
    }
}
