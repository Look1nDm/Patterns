package behavioral.strategy2.behaviorClass.UseShield;

import behavioral.strategy2.behaviorInterface.ReflectBehavior;

public class ShieldBehavior implements ReflectBehavior {
    @Override
    public void reflection() {
        System.out.println("Отражаю удар щитом, враги не могут ранить меня!");
    }
}
