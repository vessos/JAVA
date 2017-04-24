package animals;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        List<Animals> animals = new ArrayList<>();

        while(!"Beast!".equals(line = reader.readLine())){

            String[] inputProps = reader.readLine().split(" ");
            String type = line;

            String name = inputProps[0];
            int age = Integer.valueOf(inputProps[1]);
            String gender = inputProps[2];
            try{

                switch (type.toLowerCase()){
                    case"cat":
                        Animals cat = new Cat(name,age,gender);
                       // System.out.println(cat);;
                        animals.add(cat);
                        break;
                    case"dog":
                        Animals dog = new Dog(name,age,gender);
                       // System.out.println(dog);;
                        animals.add(dog);
                        break;
                    case"frog":
                        Animals frog = new Frog(name,age,gender);
                        //System.out.println(frog);;
                        animals.add(frog);
                        break;
                    case"tomcat":
                        Animals tomcat = new Tomcat(name,age);
                       // System.out.println(tomcat);;
                        animals.add(tomcat);
                        break;
                    case"kitten":
                        Animals kittens = new Kitten(name,age);
                       // System.out.println(kittens);;
                        animals.add(kittens);
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid input!");

                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

        }

        for (Animals animal : animals) {
            System.out.println(animal);
        }
    }
}
