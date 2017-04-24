package cardGame2;

public class Card {
    private Rank rank;
    private Suit suit;
    private int power;

    public Card(String rank, String suit) {
        this.setRank(rank);
        this.setSuit(suit);
        this.calculatePower();
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getPower() {
        return this.power;
    }

    private void setRank(String rank){
        try{
            this.rank = Rank.valueOf(rank);
        }catch (IllegalArgumentException eee){
            throw new IllegalArgumentException("No such card exists.");
        }

    }

    public Suit getSuit() {
        return this.suit;
    }

    private void setSuit(String suit){
        try{
            this.suit = Suit.valueOf(suit);
        }catch (IllegalArgumentException eee){
            throw new IllegalArgumentException("No such card exists.");
        }
    }

    private void calculatePower(){
        this.power = this.getRank().getPower()+this.getSuit().getValue();
    }


}

