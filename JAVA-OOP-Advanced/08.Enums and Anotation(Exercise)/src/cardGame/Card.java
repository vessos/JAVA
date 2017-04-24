package cardGame;

public class Card {
    private Rank rank;
    private Suit suit;

    public  Card(String name1, String name2){
        this.setRank(name1);
        this.setSuit(name2);
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setRank(String name1) {
       try{
           this.rank = Rank.valueOf(name1);
       }catch (IllegalArgumentException iae){
           throw new IllegalArgumentException("No such card exists.");
       }

    }

    public void setSuit(String name2) {
        try{
            this.suit = Suit.valueOf(name2);
        }catch (IllegalArgumentException iae){
            throw new IllegalArgumentException("No such card exists.");
        }

    }

    public int calculatePow() {
        return this.rank.getPower() + this.suit.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s of %s.",this.rank,this.suit);
    }
}
