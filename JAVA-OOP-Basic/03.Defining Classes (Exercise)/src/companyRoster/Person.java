package companyRoster;

public class Person {

    private final static int DEFAULT_AGE = -1;

    String name;
    int age;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
