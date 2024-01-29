package structural.adapterSecondVersion;

import structural.adapterSecondVersion.model.Database;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterAppToDb();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
