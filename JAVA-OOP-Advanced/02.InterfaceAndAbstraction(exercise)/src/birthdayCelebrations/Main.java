package birthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<BasePerson> persons = new ArrayList<>();
        BasePerson individ;
        String line = "";
        while (!"End".equals(line = reader.readLine())) {

            String[] input = line.split(" ");
            switch (input[0]) {
                case "Citizen":
                    String name = input[1];
                    Integer age = Integer.valueOf(input[2]);
                    String id = input[3];
                    String birthday = input[4];
                    individ = new Citizen(name, birthday, id, age);
                    persons.add(individ);
                    break;
                case "Pet":
                    String namePet = input[1];
                    String birthdayPet = input[2];
                    individ = new Pet(namePet, birthdayPet);
                    persons.add(individ);
                    break;
                default:
                    break;
            }
        }
        String num = reader.readLine();
        boolean isItBirthday=false;

        for (BasePerson basePerson : persons) {
            if (basePerson.checkBirthday(num)) {
                System.out.println(basePerson.getBirthDay());
                isItBirthday = true;
            }
        }
        if(!isItBirthday){
            System.out.println("");
        }

    }
}
