package cardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        CardRank[] cardRank = CardRank.values();
        if("Card Ranks".equals(line)){
            System.out.println("Card Ranks:");
            for (CardRank rank : cardRank) {
                System.out.println(rank);
            }
        }
    }
}
