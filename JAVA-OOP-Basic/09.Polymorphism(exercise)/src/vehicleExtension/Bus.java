package vehicleExtension;


public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    protected void calculateDistance(Double distance) {

    }

    @Override
    protected void calculateDistance(Double distance,String havePeople) {
        Double fuelConsumption = 0.0;
        if("DriveEmpty".equals(havePeople)){
            fuelConsumption = distance*(super.getFuelConsumption());
        }else if("Drive".equals(havePeople)){
            fuelConsumption = distance*(super.getFuelConsumption()+1.4);
        }
        if(fuelConsumption>super.getFuelQuantity()){
            throw new IllegalArgumentException("Bus needs refueling");
        }
        Double fuel = super.getFuelQuantity()-fuelConsumption;
        super.setFuelQuantity(fuel);
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
