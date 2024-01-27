package creational.builder;

import creational.builder.model.Town;

public class BuildTownRunner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setBuilder(new CreatedTownRome());
        Town town = creator.buildTown();
        System.out.println(town);

        Creator creator1 = new Creator();

        creator1.setBuilder(new CreatedTownLondon());
        Town town1 = creator1.buildTown();
        System.out.println(town1);
    }
}
