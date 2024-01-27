package creational.builder.model;

public class Temple {
    private int capacity;
    private Religion religion;

    public Temple(int capacity, Religion religion) {
        this.capacity = capacity;
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "{capacity=" + capacity +
                ", religion=" + religion+"}";
    }
}
