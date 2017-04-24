package equalityLogic;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash*17+this.age;
        hash = hash *17+this.name.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person person  = (Person)obj;
        if(!this.name.equals(person.name)){
            return false;
        }
        if(this.age!=person.age){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person o) {
       if(this.name.equals(o.name)){
           return this.age-o.age;
       }
       return this.name.compareTo(o.name);
    }
}
