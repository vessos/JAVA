package vehicleExtension;


public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected  void calculateDistance(Double distance){
        Double fuelConsumption = distance*(super.getFuelConsumption()+1.6);
        if(fuelConsumption>super.getFuelQuantity()){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        Double fuel = super.getFuelQuantity()-fuelConsumption;
        super.setFuelQuantity(fuel);
    }

    @Override
    protected void calculateDistance(Double distance, String havePeople) {

    }

    ;

    @Override
    protected void refuel(Double fuel){
        Double fuell = super.getFuelQuantity()+(fuel*0.95);
        if(fuell<0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        super.setFuelQuantity(fuell);
    }
}
