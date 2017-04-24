package coffeeMashine;

public enum CoffeeSize {
    SMALL(50,50),NORMAL(100,75),DOUBLE(200,100);

    private int weight;
    private int price;

    CoffeeSize(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWeight() {
        return this.weight;
    }
}
