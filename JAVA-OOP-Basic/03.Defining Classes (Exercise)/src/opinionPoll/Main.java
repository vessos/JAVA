package opinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        List<Person>persons = new ArrayList<>();

        for (int i = 0; i <N ; i++) {

            String[] people = reader.readLine().split(" ");
            String name = people[0];
            int age = Integer.parseInt(people[1]);

            Person person = new Person(name,age);
            persons.add(person);
        }
         persons.stream()
                 .filter(p->p.getAge()>30)
                 .sorted((a,b)->a.getName().compareTo(b.getName()))
                 .forEach(x-> System.out.println(x));
    }
}

