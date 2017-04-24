package catLady;

public class Siamese extends Cat {

    private double earSize;

    public Siamese(String name,double earSize) {
        super(name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %.0f",this.name,this.earSize);
    }
}
