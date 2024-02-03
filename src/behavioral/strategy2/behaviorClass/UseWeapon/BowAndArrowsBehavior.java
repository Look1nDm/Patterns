package behavioral.strategy2.behaviorClass.UseWeapon;

import behavioral.strategy2.behaviorInterface.WeaponBehavior;

public class BowAndArrowsBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Накладываю стрелу и стреляю из лука");
    }
}
