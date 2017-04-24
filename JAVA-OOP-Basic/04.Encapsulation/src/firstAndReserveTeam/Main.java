package firstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARK-Max on 24/02/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            try{
                Person person = new Person(input[0], input[1], Integer.parseInt(input[2]),Double.parseDouble(input[3]));
                persons.add(person);
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

        }

        Team team = new Team("Minior Pernik");

        for (Person person : persons) {
            team.addPlayer(person);
        }

        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",team.getReserveTeam().size());

    }

}
