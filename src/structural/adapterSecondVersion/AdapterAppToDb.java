package structural.adapterSecondVersion;

import structural.adapterSecondVersion.model.Database;

public class AdapterAppToDb extends Application implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
