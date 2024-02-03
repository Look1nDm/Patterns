package behavioral.strategy2.behaviorClass.UseShield;

import behavioral.strategy2.behaviorInterface.ReflectBehavior;

public class WasteBehavior implements ReflectBehavior {
    @Override
    public void reflection() {
        System.out.println("Отхожу на дистанцию при приближении врага!");
    }
}
