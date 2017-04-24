package pizzaCalories;

public class Dough {

    private static final Double CALORIES=2.0;

    private String flourType;
    private String bakingTehnique;
    private int weight;
    private double calories;

    public Dough(String flourType,String bakingTehnique,int weight){
        this.setFlourType(flourType);
        this.setBakingTehnique(bakingTehnique);
        this.setWeight(weight);
        this.calculationCalories();
    }

    private String getFlourType() {
        return this.flourType;
    }

    private void setFlourType(String flourType) {
        if((!"white".equals(flourType.toLowerCase()))&&(!"wholegrain".equals(flourType.toLowerCase()))){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private String getBakingTehnique() {
        return this.bakingTehnique;
    }

    public double getCalories() {
        return this.calories;
    }

    private void setBakingTehnique(String bakingTehnique) {
        this.bakingTehnique = bakingTehnique;
    }

    private int getWeight() {
        return this.weight;
    }

    private void setWeight(int weight) {
        if(weight<1||weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public void calculationCalories(){
        double caloriesType=1.0;
        if(this.flourType.toLowerCase().equals("white")){
            caloriesType= 1.5;
        }
        double btehniqueCalories = 1.0;
        if(this.bakingTehnique.toLowerCase().equals("crispy")){
            btehniqueCalories = 0.9;
        }else if(this.bakingTehnique.toLowerCase().equals("chewy")){
            btehniqueCalories = 1.1;
        }
        this.calories = CALORIES*this.getWeight()*caloriesType*btehniqueCalories;

    }
}
