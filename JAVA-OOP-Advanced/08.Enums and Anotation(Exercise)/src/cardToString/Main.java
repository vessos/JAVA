package cardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line1 = reader.readLine();
        String line2 = reader.readLine();
        Rank rank = Rank.valueOf(line1);
        Suit suit = Suit.valueOf(line2);

        Card card = new Card(rank,suit);


        System.out.println(card);
    }
}
