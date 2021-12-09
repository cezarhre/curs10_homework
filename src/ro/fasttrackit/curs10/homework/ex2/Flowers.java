package ro.fasttrackit.curs10.homework.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Flowers {
    private List<String> flowers;

    public Flowers() {
        flowers = new ArrayList<>();
    }

    public Collection<String> getAll() {
        Collection<String> buquet = new HashSet<>();
        buquet.addAll(flowers);
        return buquet;
    }

    public void add(String newFlower) {
        flowers.add(newFlower);
    }

    public boolean remove(String remFlower) {
        for (String flower : flowers) {
            if (flower.equals(remFlower)) {
                flowers.remove(flower);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Buquet flowers = " + flowers;
    }
}

