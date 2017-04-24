package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Smarthphone smarthphone = new Smarthphone();

        String[] input = reader.readLine().split(" ");
        for (String s : input) {
            try {
                System.out.println(smarthphone.callToOtherPhones(s));
                ;
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        String[] inputSait = reader.readLine().split(" ");
        for (String s : inputSait) {
            try {
                System.out.println(smarthphone.browseInTheWWW(s));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }
}
