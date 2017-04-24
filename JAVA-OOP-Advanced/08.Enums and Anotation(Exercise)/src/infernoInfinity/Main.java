package infernoInfinity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        HashMap<String,Weapon>weapons = new HashMap<>();
        Class weapon1 = Weapon.class;
        Custom custom = (Custom) weapon1.getAnnotation(Custom.class);

        while(!"END".equals(line = reader.readLine())){

            String[]input = line.split(";");
            String command = input[0];

            switch(command){
                case"Create":
                    int numberOfSockets = TypeOfWeapon.valueOf(input[1]).getNumberOfSockets();
                    Weapon weapon = new Weapon(input[2],input[1],numberOfSockets);
                    weapons.put(input[2],weapon);
                    break;
                case"Add":
                    weapons.get(input[1]).addGems(Integer.valueOf(input[2]),TypeOfGems.valueOf(input[3]));
                    break;
                case"Remove":
                    weapons.get(input[1]).removeGems(Integer.valueOf(input[2]));
                    break;
                case"Compare":
                    if(weapons.get(input[1]).compareTo(weapons.get(input[2]))<0){
                        System.out.println(weapons.get(input[2]) + String.format(" (Item Level: %.1f)",weapons.get(input[2]).getItemLevel()) );
                    }else{
                        System.out.println(weapons.get(input[1])+ String.format(" (Item Level: %.1f)",weapons.get(input[1]).getItemLevel()) );
                    }
                    break;
                case"Print":
                    System.out.println(weapons.get(input[1]));
                    break;
                case "Author":
                    System.out.println("Author: " + custom.author());
                    break;
                case "Revision":
                    System.out.println("Revision: " + custom.revision());
                    break;
                case "Description":
                    System.out.println("Class description: " + custom.description());
                    break;
                case "Reviewers":
                    System.out.println("Reviewers: " + String.join(", ",custom.reviewers()));
                    break;

            }
        }
    }
}
