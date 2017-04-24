package vehicleExtension;


public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void calculateDistance(Double distance) {
        Double fuelConsumption = distance*(super.getFuelConsumption()+0.9);
        if(fuelConsumption>super.getFuelQuantity()){
            throw new IllegalArgumentException("Car needs refueling");
        }
        Double fuel = super.getFuelQuantity()-fuelConsumption;
        super.setFuelQuantity(fuel);
    }

    @Override
    protected void calculateDistance(Double distance, String havePeople) {

    }

    @Override
    protected void refuel(Double fuel) {
        Double fuell = super.getFuelQuantity()+fuel;
        if(fuell<0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(fuell>super.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.setFuelQuantity(fuell);

    }
}
