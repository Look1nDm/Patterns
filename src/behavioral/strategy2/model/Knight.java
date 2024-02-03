package behavioral.strategy2.model;

import behavioral.strategy2.behaviorClass.UseShield.ShieldBehavior;
import behavioral.strategy2.behaviorClass.UseWeapon.SwordBehavior;

public class Knight extends Player{

    public Knight() {
        weaponBehavior = new SwordBehavior();
        reflectBehavior = new ShieldBehavior();
    }
}
