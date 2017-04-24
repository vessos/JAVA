package multiplyImplementation;

public class Citizen implements Person,Birthable,Identifiable {
    private String name;
    private Integer age;
    private String id;
    private String birthDay;

    public Citizen(String name, Integer age, String id, String birthDay) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDay(birthDay);
    }

    @Override
    public String getName() {
        return null;
    }

    private void setName(String name){
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return null;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getBirthdate() {
        return null;
    }

    private void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String getId() {
        return null;
    }

    private void setId(String id) {
        this.id = id;
    }
}
