package speedRacing;

public class Car {

    private final static double DEFAULT_DISTANCE = 0.0;

    private String model;
    private Double fuelAmount;
    private Double fuelCostfor1Km;
    private Double distance;

    public Car(String model,Double fuelAmount,Double fuelCostfor1Km){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostfor1Km = fuelCostfor1Km;
        this.distance = DEFAULT_DISTANCE;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f",this.model,this.fuelAmount,this.distance);
    }

    public void carTrvaeled (Double amountOfKm){
        if(this.fuelAmount-(this.fuelCostfor1Km*amountOfKm)<0){
            throw  new IllegalArgumentException("Insufficient fuel for the drive");
        }
        this.fuelAmount-=this.fuelCostfor1Km*amountOfKm;
        this.distance +=amountOfKm;
    }

}
