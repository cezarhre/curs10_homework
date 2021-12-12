package ro.fasttrackit.curs10.homework.ex1;

import java.util.*;

public class Basket {

    private final List<String> fruits;

    public Basket() {
         fruits = new ArrayList<>();
    }

    public void add(String newFruit) {
        fruits.add(newFruit);
    }

    public boolean find(String findFruit) {
        return fruits.contains(findFruit);
    }

    public void remove(String outFruit) {
        Iterator<String> iterator = fruits.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(outFruit)) {
                    iterator.remove();
                }
            }
    }

    public int position(String posFruit) {
        int position = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(posFruit)) {
                position = i + 1;
            }
        }
        return position;
    }

    public Collection<String> distinct() {
        Collection<String> basket = new HashSet<>(fruits);
        basket.addAll(fruits);
        return new HashSet<>(fruits);
    }

    public int count(){
        return fruits.size();
    }

    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

    public String toString() {
        return "Basket fruits = " + fruits;
    }
}



