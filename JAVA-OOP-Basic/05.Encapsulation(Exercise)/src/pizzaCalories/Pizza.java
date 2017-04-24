package pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private int numberOfToppings;
    private Dough dough;
    private List<Topping>toppings;

    public Pizza(String name,int numberOfToppings){
        this.setName(name);
        this.setNumberOfToppings(numberOfToppings);
        this.dough = null;
        this.toppings = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()||name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public int getNumberOfToppings(){
        return this.numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings<0||numberOfToppings>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfToppings = numberOfToppings;
    }
    public void addDough (Dough dough){
        this.dough=dough;
    }

    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }

    public double totalCalories(){
        double doughCalories = this.dough.getCalories();

        double toppingsCalories = 0;
        if(!toppings.isEmpty()){
            for (Topping topping : toppings) {
                toppingsCalories+=topping.getCalories();
            }
        }

        return doughCalories+toppingsCalories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",this.getName(),this.totalCalories());
    }
}
