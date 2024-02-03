package behavioral.strategy2.behaviorClass.UseShield;

import behavioral.strategy2.behaviorInterface.ReflectBehavior;

public class DodgeBehavior implements ReflectBehavior {
    @Override
    public void reflection() {
        System.out.println("Уклоняюсь от удара, враги не могут попасть по мне!");
    }
}
