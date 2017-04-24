package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name1;
    private String name2;
    private List<Card> cardCollections;
    private int maxResult;
    private Card card;

    public Player(String name,String name2){
        this.name1 = name;
        this.name2 = name2;
        this.cardCollections = new ArrayList<>();
        this.maxResult = 0;
    }

    public int getMaxResult() {
        return this.maxResult;
    }

    public void addCard (Card card){
        if(isItCard(card)){
            throw new IllegalArgumentException("Card is not in the deck.");
        }
        this.cardCollections.add(card);
    }

    private boolean isItCard(Card card) {
        for (Card cardCollection : cardCollections) {
            if (card.getRank().equals(cardCollection.getRank())&& card.getSuit().equals(cardCollection.getSuit())) {
                return true;
            }
        }
        return false;
    }

    public Card max(){
        int maxResult = 0;
        int index = 0;
        Card card = null;
        for (int i = 0; i <cardCollections.size() ; i++) {
            if(maxResult<cardCollections.get(i).calculatePow()){
                maxResult = cardCollections.get(i).calculatePow();
                card = cardCollections.get(i);
                index = i;
            }
        }

        this.maxResult =index;
        return this.card = card;
    }

    @Override
    public String toString() {
        String name;
        if(this.maxResult<6){
           name = this.name1;
        }else{
            name = this.name2;
        }
        return name + " wins with " + this.card;
    }
}
