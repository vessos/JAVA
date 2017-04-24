package cardGame2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        Deck deck = new Deck();
        while(deck.getAllCards().size()<10){
            String[]input = reader.readLine().split(" of ");
            String rank = input[0];
            String suit = input[1];
            try{
                deck.addCard(new Card(rank,suit));
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

        }
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        for (Card card : deck) {
             if(deck1.getAllCards().size()<5){
               deck1.addCard(card);
             }else{
                deck2.addCard(card);
             }
        }
        Player player1 = new Player(name1,deck1);
        Player player2 = new Player(name2,deck2);

        if(player1.maxCard()>player2.maxCard()){
            System.out.println(player1);
        }else{
            System.out.println(player2);
        }




    }
}
