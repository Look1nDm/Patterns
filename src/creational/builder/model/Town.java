package creational.builder.model;

public class Town {
    private String name;
    private Sawmill sawmill;
    private Fortress fortress;
    private Temple temple;

    public void setName(String name) {
        this.name = name;
    }

    public void setSawmill(Sawmill sawmill) {
        this.sawmill = sawmill;
    }

    public void setFortress(Fortress fortress) {
        this.fortress = fortress;
    }

    public void setTemple(Temple temple) {
        this.temple = temple;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", sawmill=" + sawmill +
                ", fortress=" + fortress +
                ", temple=" + temple +
                '}';
    }
}
