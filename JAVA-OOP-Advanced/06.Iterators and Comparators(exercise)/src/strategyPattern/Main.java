package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PersonAgeComparator pac = new PersonAgeComparator();
        PersonNameComparator pnc = new PersonNameComparator();
        TreeSet<Person>set1 = new TreeSet<>(pac);
        TreeSet<Person>set2 = new TreeSet<>(pnc);

        int n = Integer.valueOf(reader.readLine());

        while(n-->0){
            String[]input = reader.readLine().split(" ");

            Person person = new Person(input[0],Integer.valueOf(input[1]));
            set1.add(person);
            set2.add(person);
        }

//        set2.stream().sorted(pac).forEach(x-> System.out.println(x.getName() + " " +x.getAge()));
        for (Person person : set2) {
            System.out.println(person);
        }
        for (Person person : set1) {
            System.out.println(person);
        }
    }
}
