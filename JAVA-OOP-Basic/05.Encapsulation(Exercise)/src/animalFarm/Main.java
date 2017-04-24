package animalFarm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> chickenProperty = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            chickenProperty.add(reader.readLine());
        }
        String name = chickenProperty.get(0);
        Integer age = Integer.parseInt(chickenProperty.get(1));

        try{
            Chicken chicken = new Chicken(name,age);
            System.out.println(chicken.toString());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }


}
