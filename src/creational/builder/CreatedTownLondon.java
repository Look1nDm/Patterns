package creational.builder;

import creational.builder.model.Fortress;
import creational.builder.model.Religion;
import creational.builder.model.Sawmill;
import creational.builder.model.Temple;

public class CreatedTownLondon extends TownBuilder{
    @Override
    void buildName() {
        town.setName("London");
    }

    @Override
    void buildFortress() {
        town.setFortress(new Fortress(25, 1850));
    }

    @Override
    void buildSawmill() {
        town.setSawmill(new Sawmill(3, 570));
    }

    @Override
    void buildTemple() {
        town.setTemple(new Temple(270, Religion.CHRISTIANITY));
    }
}
