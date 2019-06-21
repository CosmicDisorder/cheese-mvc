package org.launchcode.cheesemvc.models;

import java.util.ArrayList;

public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // remove
    public static void remove(String desc) {
        Cheese cheeseToRemove =getByDesc(desc);
        cheeses.remove(cheeseToRemove);
    }

    // getById
    public static Cheese getByDesc(String desc) {

        Cheese theCheese = null;

        for (Cheese candidateCheese : cheeses) {
            if (candidateCheese.getDescription() == desc) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }


}
