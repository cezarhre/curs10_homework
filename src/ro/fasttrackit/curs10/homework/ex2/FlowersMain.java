package ro.fasttrackit.curs10.homework.ex2;

public class FlowersMain {
    public static void main(String[] args) {

        Flowers flower1 = new Flowers();

        flower1.add("lalea");
        flower1.add("crizantema");
        flower1.add("trandafir");
        flower1.add("nufar");

        System.out.println(flower1);
        System.out.println(flower1.getAll());
        System.out.println(flower1.remove("lalea"));
        System.out.println(flower1);

    }
}
