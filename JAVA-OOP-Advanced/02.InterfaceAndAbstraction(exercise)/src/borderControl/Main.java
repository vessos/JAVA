package borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<BasePerson> persons = new ArrayList<>();
        BasePerson person;
        String line = "";
        while (!"End".equals(line = reader.readLine())) {

            String[] input = line.split(" ");
            if (input.length == 2) {
                String model = input[0];
                String id = input[1];
                person = new Robot(id, model);
                persons.add(person);
            } else {
                String name = input[0];
                Integer age = Integer.valueOf(input[1]);
                String id = input[2];
                person = new Citizen(id, name, age);
                persons.add(person);
            }
        }
        String num = reader.readLine();

        for (BasePerson basePerson : persons) {
            if (basePerson.checkId(num)) {
                System.out.println(basePerson.getId());
            }
        }


    }
}
