package creational.builder;

import creational.builder.model.Town;

public class Creator {

    TownBuilder builder;

    public void setBuilder(TownBuilder builder) {
        this.builder = builder;
    }

    Town buildTown(){
        builder.createTown();
        builder.buildName();
        builder.buildFortress();
        builder.buildSawmill();
        builder.buildTemple();
        Town town = builder.getTown();
        return town;
    }
}
