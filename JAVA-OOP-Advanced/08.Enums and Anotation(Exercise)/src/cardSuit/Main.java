package cardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        CardSuit[] cardSuit =CardSuit.values();

        if("Card Suits".equals(line)){
            System.out.println("Card Suits:");
            for (CardSuit suit : cardSuit) {
                System.out.printf("Ordinal value: %d; Name value: %s\n",suit.ordinal(),suit);
            }
        }
    }
}
