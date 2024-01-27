package creational.builder.model;

public class Fortress {
    private int wallHeight;
    private int capacity;

    public Fortress(int wallHeight, int capacity) {
        this.wallHeight = wallHeight;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "{wallHeight=" + wallHeight +
                ", capacity=" + capacity+"}";
    }
}
