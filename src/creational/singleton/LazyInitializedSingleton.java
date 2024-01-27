package creational.singleton;

public class LazyInitializedSingleton {
    private static volatile LazyInitializedSingleton instance;
    private static String logg;
    private LazyInitializedSingleton(){

    }
    public static synchronized LazyInitializedSingleton getInstance(){
        if (instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    public void addLog(String logInfo){
        logg += logInfo + "\n";
    }

    public void showLogg(){
        System.out.println(logg);
    }
}
