package catLady;

public class StreetExtraordinaire extends Cat{

    private double decibelsOfMeows;

    public StreetExtraordinaire(String name,double decibleOfMeows) {

        super(name);
        this.decibelsOfMeows = decibleOfMeows;

    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %.0f",this.name,this.decibelsOfMeows);
    }
}
