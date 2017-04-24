package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Google>peopleWatch = new HashMap<>();
        String line = "";

        while(!"End".equals(line = reader.readLine())){

            String[]input = line.split("\\s+");
            String potrebitel = input[0];

            if(!peopleWatch.containsKey(potrebitel)){
                peopleWatch.put(potrebitel,new Google(potrebitel));
            }

            switch(input[1]){

                case "company":
                    String companyName = input[2];
                    String department = input[3];
                    double salary = Double.valueOf(input[4]);
                    Company company = new Company(companyName,department,salary);
                    peopleWatch.get(potrebitel).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = input[2];
                    String pokemonType = input[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    peopleWatch.get(potrebitel).addPokemons(pokemon);
                    break;
                case "parents":
                    String parentName = input[2];
                    String parentBirthday = input[3];
                    Parents parent = new Parents(parentName,parentBirthday);
                    peopleWatch.get(potrebitel).addParents(parent);
                    break;
                case "children":
                    String childName = input[2];
                    String childBirthday = input[3];
                    Children child = new Children(childName,childBirthday);
                    peopleWatch.get(potrebitel).addChildrens(child);
                    break;
                case "car":
                    String carModel = input[2];
                    Integer carSpeed = Integer.valueOf(input[3]);
                    Car car = new Car(carModel,carSpeed);
                    peopleWatch.get(potrebitel).setCar(car);
                    break;
            }

        }
        String name = reader.readLine();
        System.out.println(peopleWatch.get(name));
    }
}
