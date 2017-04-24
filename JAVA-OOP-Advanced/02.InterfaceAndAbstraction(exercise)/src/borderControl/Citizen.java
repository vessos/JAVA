package borderControl;

public class Citizen extends BasePerson {
    private String name;
    private int age;

    public Citizen(String id, String name, Integer age) {
        super(id);
        this.name = name;
        this.age = age;
    }
}


