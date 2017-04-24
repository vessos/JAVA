package cardGame;

@Custom(type = "Enumeration",categories = "Suit",description ="Provides suit constants for a Card class." )
public enum Suit {
    CLUBS(0),DIAMONDS(13),HEARTS(26),SPADES(39);

    private int value;
    Suit(int val){
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }

    public static void getAnotation(){
        Class e = Suit.class;
        Custom custom  = (Custom)e.getAnnotation(Custom.class);
        System.out.println(String.format("Type = %s, Description = %s",custom.type(),custom.description()));
    }
}
