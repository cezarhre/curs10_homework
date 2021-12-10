package ro.fasttrackit.curs10_homework.exerc3;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public List<Person> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public String getManager() {
        for (Person pos : employees) {
            if (pos.getPosition().equals("Manager")) {
                return pos.getName();
            }
        }
        return null;
    }

    public String getPersons(String profession) {
        for (int i = 0; i < employees.size(); i++) {
            if (profession.equals(employees.get(i).getPosition())) {
                return employees.get(i).getName();
            }
        }
        return profession;
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

