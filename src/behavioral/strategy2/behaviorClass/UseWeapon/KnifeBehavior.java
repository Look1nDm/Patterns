package behavioral.strategy2.behaviorClass.UseWeapon;

import behavioral.strategy2.behaviorInterface.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Подкрадываюсь и наношу удар ножом");
    }
}
