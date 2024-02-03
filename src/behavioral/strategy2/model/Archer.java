package behavioral.strategy2.model;

import behavioral.strategy2.behaviorClass.UseShield.WasteBehavior;
import behavioral.strategy2.behaviorClass.UseWeapon.BowAndArrowsBehavior;

public class Archer extends Player{
    public Archer() {
        weaponBehavior = new BowAndArrowsBehavior();
        reflectBehavior = new WasteBehavior();
    }
}
