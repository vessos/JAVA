package birthdayCelebrations;

public class Citizen extends BasePerson {
    private String id;
    private int age;

    public Citizen(String name,String birthday,String id,Integer age) {
        super(name,birthday);
        this.id= name;
        this.age = age;
    }
}
