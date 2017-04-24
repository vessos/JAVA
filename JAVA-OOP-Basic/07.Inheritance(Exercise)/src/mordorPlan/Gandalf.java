package mordorPlan;


import java.util.ArrayList;
import java.util.List;

public class Gandalf {

    private final static int POINTS = 0;

    private int hapinessPoints;
    private List<Food> foods;

    public Gandalf() {
        this.hapinessPoints = POINTS;
        this.foods = new ArrayList<>();
    }

    public int getHapinessPoints() {
        for (Food food : foods) {
            this.hapinessPoints+=food.getFoodPoints();
        }
        return this.hapinessPoints;
    }
    public void addFood(Food food){
        foods.add(food);
    }
}
