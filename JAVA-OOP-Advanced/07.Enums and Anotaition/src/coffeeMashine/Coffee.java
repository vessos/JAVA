package coffeeMashine;

public class Coffee {
    private CoffeeSize coffeeSize;
    private CoffeeType coffeType;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.coffeeSize = size;
        this.coffeType = type;
    }

    @Override
    public String toString() {
        String size = String.valueOf(this.coffeeSize.toString().charAt(0));
        size += this.coffeeSize.toString().toLowerCase().substring(1);

        String type = String.valueOf(this.coffeType.name().charAt(0));
        type+=this.coffeType.name().substring(1).toLowerCase();
        return size + " " + type;
    }
}
