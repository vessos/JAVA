package cardCompareTo;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public  Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    private int calculatePow() {
        return this.rank.getPower() + this.suit.getValue();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.rank,this.suit,calculatePow());
    }


    @Override
    public int compareTo(Card o) {
        return calculatePow()-o.calculatePow();
    }
}
