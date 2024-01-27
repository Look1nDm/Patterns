package creational.singleton;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton.getInstance().showLogg();
        LazyInitializedSingleton.getInstance().addLog("one");
        LazyInitializedSingleton.getInstance().showLogg();
        LazyInitializedSingleton.getInstance().addLog("two");
        LazyInitializedSingleton.getInstance().showLogg();
        LazyInitializedSingleton.getInstance().addLog("three");
        LazyInitializedSingleton.getInstance().showLogg();
    }
}
