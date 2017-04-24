package dependencyInjection;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.setAnimal(new Human("Petko",23));
        restaurant.eat();

    }
}
