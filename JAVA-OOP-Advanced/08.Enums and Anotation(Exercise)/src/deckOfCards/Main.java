package deckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        Rank[]ranks = Rank.values();
        Suit[]suit = Suit.values();
        if("Card Deck".equals(line)){
            for (Suit suit1 : suit) {
                for (Rank rank : ranks) {
                    System.out.println(rank + " of " + suit1);
                }
            }
        }
    }
}
