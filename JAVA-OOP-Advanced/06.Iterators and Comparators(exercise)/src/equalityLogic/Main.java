package equalityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person>set1 = new TreeSet<>();
        HashSet<Person>set2 = new HashSet<>();

        int n = Integer.valueOf(reader.readLine());

        while(n-->0){
            String[]input = reader.readLine().split(" ");
            Person person = new Person(input[0],Integer.valueOf(input[1]));
            set1.add(person);
            set2.add(person);

        }

        System.out.println(set1.size());
        System.out.println(set2.size());
    }
}
