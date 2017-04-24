package cardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String player11 = reader.readLine();
        String player2 = reader.readLine();
        Player player1 = new Player(player11,player2);


        int count = 0;

        while(count<10){
            String[]input = reader.readLine().split(" of ");
            String rank = input[0];
            String suit = input[1];
                try{
                    Card card = new Card(rank,suit);
                    player1.addCard(card);
                    count++;
                }catch (IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }

        }
        player1.max();
        System.out.println(player1);
    }
}
