package creational.builder.model;

public class Sawmill {
    private int workers;
    private int performance;

    public Sawmill(int workers, int performance) {
        this.workers = workers;
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "{workers=" + workers +
                ", performance=" + performance+"}";
    }
}
