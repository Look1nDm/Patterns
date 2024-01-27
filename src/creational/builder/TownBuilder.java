package creational.builder;

import creational.builder.model.Town;

public abstract class TownBuilder {

    Town town;

    void createTown() {
        town = new Town();
    }
    Town getTown(){
        return town;
    }
    abstract void buildName();

    abstract void buildFortress();

    abstract void buildSawmill();

    abstract void buildTemple();
}
