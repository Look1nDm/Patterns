package creational.builder;

import creational.builder.model.Fortress;
import creational.builder.model.Religion;
import creational.builder.model.Sawmill;
import creational.builder.model.Temple;

public class CreatedTownRome extends TownBuilder{
    @Override
    void buildName() {
        town.setName("Rome");
    }

    @Override
    void buildFortress() {
        town.setFortress(new Fortress(30, 3000));
    }

    @Override
    void buildSawmill() {
        town.setSawmill(new Sawmill(5, 1400));
    }

    @Override
    void buildTemple() {
        town.setTemple(new Temple(560, Religion.CHRISTIANITY));
    }

}
