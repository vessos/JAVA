package cardGame2;


public class Player {

    private String name;
    private Deck cards;
    private Card winerCard;

    public Player(String name,Deck deck) {
        this.name= name;
        this.cards =deck;
        this.winerCard =null;
    }


    public int maxCard(){
        int maxCard = 0;
        for (Card card : this.cards) {
            if(maxCard<card.getPower()){
                maxCard= card.getPower();
                this.winerCard = card;
            }
        }
        return maxCard;
    }

    @Override
    public String toString() {
        return String.format("%s wins with %s of %s.",this.name,this.winerCard.getRank(),this.winerCard.getSuit());
    }
}
