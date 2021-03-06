package me.urbanowicz.samuel.flowerminder.data.store;

import java.util.ArrayList;
import java.util.List;

import me.urbanowicz.samuel.flowerminder.data.Flower;

public class FlowersInMemoryCache implements DataStore.MultipleEntities<Flower> {
    private List<Flower> flowers = new ArrayList<>();

    @Override
    public void save(Flower entity) {
        flowers.add(entity);
    }

    @Override
    public void delete(Flower entity) {
        flowers.remove(entity);
    }

    @Override
    public Iterable<Flower> getAll() {
        return flowers;
    }
}
