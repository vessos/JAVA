package pizzaCalories;

public class Topping {

    private static final int CALORIES = 2;

    private String type;
    private double weight;
    private double calories;

    public Topping(String type,double weight){
        this.setType(type);
        this.setWeight(weight);
        this.calculateCalories();
    }

    private String getType() {
        return this.type;
    }

    private void setType(String type) {
        if(!"meat".equals(type.toLowerCase())&&!"veggies".equals(type.toLowerCase())
                &&!"cheese".equals(type.toLowerCase())&&!"sauce".equals(type.toLowerCase())){
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",type));
        }
        this.type = type;
    }

    private double getWeight() {
        return this.weight;
    }

    private void setWeight(double weight) {
        if(weight<1||weight>50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.getType()));
        }
        this.weight = weight;
    }

    public double getCalories() {
        return this.calories;
    }

    public void calculateCalories(){
        double typeCalories=0;
        switch (this.getType().toLowerCase()){
            case "meat":
                typeCalories = 1.2;
                break;
            case "veggies":
                typeCalories = 0.8;
                break;
            case "cheese":
                typeCalories = 1.1;
                break;
            case "sauce":
                typeCalories = 0.9;

        }
        this.calories = CALORIES*typeCalories*this.getWeight();
    }
}
