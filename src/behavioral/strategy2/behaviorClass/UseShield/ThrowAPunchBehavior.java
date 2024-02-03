package behavioral.strategy2.behaviorClass.UseShield;

import behavioral.strategy2.behaviorInterface.ReflectBehavior;

public class ThrowAPunchBehavior implements ReflectBehavior {
    @Override
    public void reflection() {
        System.out.println("Не могу отразить удар и принимаю его грудью, благо здоровья много!");
    }
}
