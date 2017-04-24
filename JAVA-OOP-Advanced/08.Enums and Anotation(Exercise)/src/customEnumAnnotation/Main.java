package customEnumAnnotation;

import createCustomAnotation.Weapon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line  = reader.readLine();

        if("Rank".equals(line)){
            Rank.getAnotation();
        }else{
            Suit.getAnotation();
        }
    }
}
