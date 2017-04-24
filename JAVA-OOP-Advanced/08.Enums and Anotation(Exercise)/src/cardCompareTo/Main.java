package cardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        String line4 = reader.readLine();
        Rank rank = Rank.valueOf(line1);
        Suit suit = Suit.valueOf(line2);
        Rank rank1  = Rank.valueOf(line3);
        Suit suit1 = Suit.valueOf(line4);

        Card card = new Card(rank,suit);
        Card card1 = new Card(rank1,suit1);

        if(card.compareTo(card1)>0){
            System.out.println(card);
        }else{
            System.out.println(card1);
        }

    }

}
