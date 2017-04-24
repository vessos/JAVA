package mood3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" \\| ");

        Character character ;
        String username = input[0];
        String chType = input[1];

        if(chType.equals("Demon")){
            double energy = Double.valueOf(input[2]);
            int level = Integer.valueOf(input[3]);
            character = new Demon(username,level,energy);
            character.generateHashPasword();
            System.out.println(character);

        }else{
            int mana = Integer.valueOf(input[2]);
            int level = Integer.valueOf(input[3]);
            character = new Archangel(username,level,mana);
            character.generateHashPasword();
            System.out.println(character);
        }
    }
}
