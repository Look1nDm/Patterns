package behavioral.strategy2.model;

import behavioral.strategy2.behaviorClass.UseShield.ThrowAPunchBehavior;
import behavioral.strategy2.behaviorClass.UseWeapon.AxeBehavior;

public class Warrior extends Player{
    public Warrior() {
        weaponBehavior = new AxeBehavior();
        reflectBehavior = new ThrowAPunchBehavior();
    }
}
