package ro.fasttrackit.curs10_homework.exerc3;

public class Person {

    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Person " + name +
                ", age= " + age +
                ", position= " + position;
    }
}
