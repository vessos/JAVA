package cardGame2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card>,Comparable<Card> {

    private List<Card>allCards;

    public Deck() {
        this.allCards = new ArrayList<>();
    }

    public List<Card> getAllCards() {
        return this.allCards;
    }

    public void addCard(Card card){
        if(this.compareTo(card)==0){
            throw new IllegalArgumentException("Card is not in the deck.");
        }
        this.allCards.add(card);
    }

    @Override
    public Iterator<Card> iterator() {
        return new iterrCard();
    }

    @Override
    public int compareTo(Card o) {
        for (Card allCard : allCards) {
            if(allCard.getRank()==o.getRank()&&
                    allCard.getSuit()==o.getSuit()){
                return 0;
            }
        }
        return 1;
    }


    private final class iterrCard implements Iterator<Card>{

        private int index;

        private iterrCard(){
          this.index = 0;
        }
        @Override
        public boolean hasNext() {
            return allCards.size()-this.index>0;
        }

        @Override
        public Card next() {
            return allCards.get(index++);
        }
    }
}
