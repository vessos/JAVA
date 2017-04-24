package mordorPlan;

public class Food {

    private String foodName;
    private int foodPoints;

    public Food(String foodName,int foodPoints){
        this.setFoodName(foodName);
        this.setFoodPoints(foodPoints);
    }

    public String getFoodName() {
        return this.foodName;
    }

    private void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPoints() {
        return this.foodPoints;
    }

    private void setFoodPoints(int foodPoints) {
        this.foodPoints = foodPoints;
    }
}
