package vehicles;

public class Truck extends Vehicle {

    public Truck(Double fuelQuantity,Double litersPerKm){
        super(fuelQuantity,litersPerKm);
    }

    @Override
    protected  void calculateDistance(Double distance){
        Double fuelConsumption = distance*(super.getLitersPerKm()+1.6);
        if(fuelConsumption>super.getFuelQuantity()){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        Double fuel = super.getFuelQuantity()-fuelConsumption;
        super.setFuelQuantity(fuel);
    };

    @Override
    protected void refuel(Double fuel){
        Double fuell = super.getFuelQuantity()+(fuel*0.95);
        super.setFuelQuantity(fuell);
    }
}
