package ro.fasttrackit.curs10_homework.exerc3;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Person person = new Person("George", 34, "Carpenter");
        Person person1 = new Person("Ion", 40, "Manager");
        Person person2 = new Person("Gigel", 35, "Plummer");
        Person person3 = new Person("Gelu", 38, "Welder");
        Person person4 = new Person("Geo",55,"Plummer");
        Person person5 = new Person("Calin",41,"Manager");

        company.add(person);
        company.add(person1);
        company.add(person2);
        company.add(person3);
        company.add(person4);
        company.add(person5);

        System.out.println(company);
        company.getManager();
        System.out.println(company.getPersons("Plummer"));
        System.out.println(company.getPersonsOlder(35));
        System.out.println(company.getPerson("Ge"));

    }
}
