package ro.fasttrackit.curs10.homework.ex1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasketMain {
    public static void main(String[] args) {

        Basket b = new Basket();

        b.add("mere");
        b.add("pere");
        b.add("cirese");
        b.add("portocale");
        b.add("visine");

        System.out.println(b);

        System.out.println(b.find("cirese"));
        System.out.println(b.remove("cirese"));
        System.out.println(b.remove("nuci"));
        System.out.println(b);
        System.out.println(b.position("pere"));
        System.out.println(b.distinct());
        System.out.println(b.count());
        System.out.println(b.customCount());

    }
}
