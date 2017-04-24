package comparingObject;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String town;
    private int equalsPeople;
    private int notEquals ;

    public Person(String name,int age,String town){
        this.name = name;
        this.age = age;
        this.town = town;
        this.equalsPeople = 0;
        this.notEquals = 0;
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    private String getTown() {
        return this.town;
    }

    public int getEqualsPeople() {
        return this.equalsPeople;
    }

    public int getNotEquals() {
        return this.notEquals;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getName().equals(o.getName())&&
                this.getAge()==o.getAge()&&
                this.getTown().equals(o.getTown())){
            return this.equalsPeople++;
        }else{
            return this.notEquals++;
        }
    }
}
