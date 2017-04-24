package strategyPattern;



import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().length()!=o2.getName().length()){
            return o1.getName().length()-o2.getName().length();
        }else{
            int num1 = o1.getName().toLowerCase().charAt(0);
            int num2 = o2.getName().toLowerCase().charAt(0);
            return num1-num2;
        }
    }
}
