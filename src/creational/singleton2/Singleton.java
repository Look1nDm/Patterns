package creational.singleton2;

public class Singleton {
    private static volatile Singleton singleton;

    public static Singleton getInstance(){
        Singleton local = singleton;
        if (local == null) {
            synchronized (Singleton.class){
                local = singleton;
                if (local == null){
                    singleton = local = new Singleton();
                }
            }
        }
        return local;
    }
}
