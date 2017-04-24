package coffeeMashine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    private List<Coffee>coffees;
    private int coin;

    public CoffeeMachine() {
        this.coffees = new ArrayList<>();
        this.coin = 0;
    }

    public void buyCoffee(String size ,String type){
        CoffeeSize coffeeSize = CoffeeSize.valueOf(size.toUpperCase());
        CoffeeType coffeeType = CoffeeType.valueOf(type.toUpperCase());
        if(coffeeSize.getPrice()<=this.coin){
            this.coin=0;
            coffees.add(new Coffee(coffeeSize,coffeeType));
        }
    }
    public void insertCoin(String coin){
        Coin coins = Coin.valueOf(coin.toUpperCase());
        this.coin+=coins.getValues();
    }

    public Iterable<Coffee> coffeesSold(){
        return coffees;
    }
}
