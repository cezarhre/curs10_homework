package ro.fasttrackit.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasketMain {
    public static void main(String[] args) {

        Basket b = new Basket();
        b.add("nuci");
        b.add("mere");
        b.add("pere");
        b.add("cirese");
        b.add("portocale");
        b.add("visine");
        b.add("cirese");

        System.out.println(b);

        System.out.println(b.find("portocale"));
        System.out.println(b.distinct());
        b.remove("cirese");
        System.out.println(b);
        System.out.println(b.position("pere"));
        System.out.println(b.count());
        System.out.println(b.customCount());

    }
}
