package cardCompareTo;

public enum Suit {
    CLUBS(0),DIAMONDS(13),HEARTS(26),SPADES(39);

    private int value;
    Suit(int val){
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
