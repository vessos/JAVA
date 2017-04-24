package cardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line1 = reader.readLine();
        String line2 = reader.readLine();

        Rank rank = Rank.valueOf(Rank.class,line1);
        Suit suit = Suit.valueOf(line2);

        int power = rank.getPower()+suit.getValue();

        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,power);
    }
}
