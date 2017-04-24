package vehicles;


public class Car extends Vehicle {



    public Car(Double fuelQuantity,Double litersPerKm){
        super(fuelQuantity,litersPerKm);
    }

    @Override
    protected  void calculateDistance(Double distance){
        Double fuelConsumption = distance*(super.getLitersPerKm()+0.9);
        if(fuelConsumption>super.getFuelQuantity()){
            throw new IllegalArgumentException("Car needs refueling");
        }
        Double fuel = super.getFuelQuantity()-fuelConsumption;
        super.setFuelQuantity(fuel);
    };


}
