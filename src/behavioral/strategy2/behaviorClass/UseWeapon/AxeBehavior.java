package behavioral.strategy2.behaviorClass.UseWeapon;

import behavioral.strategy2.behaviorInterface.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Размахиваюсь и бью топором");
    }
}
