package animals;


public abstract class Animals {


    private String name;
    private int age;
    private String gender;

    public Animals(String name,int age,String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    protected String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    protected int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    protected String getGender() {
        return this.gender;
    }

    protected void setGender(String gender) {
        if(gender==null||gender.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s",this.name,this.age,this.gender);
    }

    protected abstract String produceSound();
}

