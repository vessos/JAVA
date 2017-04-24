package customEnumAnnotation;

@Custom(type = "Enumeration",categories = "Rank",description = "Provides rank constants for a Card class.")
public enum Rank {
    ACE(14),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),
    EIGHT(8),NINE(9),TEN(10),JACK(11),QUEEN(12),KING(13);

    private int power;
    Rank(int pow){
       this.power = pow;
    }

    public int getPower() {
        return this.power;
    }

    public static void getAnotation(){
        Class e = Rank.class;
        Custom custom  = (Custom)e.getAnnotation(Custom.class);
        System.out.println(String.format("Type = %s, Description = %s",custom.type(),custom.description()));
    }
}