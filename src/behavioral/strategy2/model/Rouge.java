package behavioral.strategy2.model;

import behavioral.strategy2.behaviorClass.UseShield.DodgeBehavior;
import behavioral.strategy2.behaviorClass.UseWeapon.KnifeBehavior;

public class Rouge extends Player{
    public Rouge() {
        weaponBehavior = new KnifeBehavior();
        reflectBehavior = new DodgeBehavior();
    }
}
