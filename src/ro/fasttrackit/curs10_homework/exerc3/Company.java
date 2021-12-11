package ro.fasttrackit.curs10_homework.exerc3;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public List<Person> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public List<Person> getManager() {
        List<Person> boss = new ArrayList<>();
        for (Person pos : employees) {
            if (pos.getPosition().equals("Manager")) {
                boss.add(pos);
            }
        }
        return boss;
    }

    public List<Person> getPersons(String profession) {
        List<Person> proff = new ArrayList<>();
        for (Person employee : employees) {
            if (profession.equals(employee.getPosition())) {
                proff.add(employee);
            }
        }
        return proff;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person old : employees){
            if(old.getAge() > age){
                result.add(old);
            }
        }
        return result;
    }

    public List<Person> getPerson(String nickName){
        List<Person> result = new ArrayList<>();
        for (Person nick : employees){
            if(nick.getName().contains(nickName)){
                result.add(nick);
            }
        }
        return result;
    }

    public String toString() {
        return "Company employees = " + employees;
    }

    public void add(Person person) {
        employees.add(person);
    }
}

