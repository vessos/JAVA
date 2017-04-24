package comparingObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        List<Person>list = new ArrayList<>();

        while(!"END".equals(line = reader.readLine())){
            String[]input = line.split(" ");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            String town = input[2];

            Person person = new Person(name,age,town);
            list.add(person);
        }
        int N = Integer.valueOf(reader.readLine());

        Person person  = list.get(N-1);
        for (Person person1 : list) {
            person.compareTo(person1);
        }
        if(person.getEqualsPeople()==1){
            System.out.println("No matches");
        }else{
            System.out.print(person.getEqualsPeople() + " ");
            System.out.print(person.getNotEquals() + " ");
            System.out.print(list.size());
        }

    }
}
