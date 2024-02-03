package behavioral.strategy2.behaviorClass.UseWeapon;

import behavioral.strategy2.behaviorInterface.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Парирую и наношу удар мечом");
    }
}
