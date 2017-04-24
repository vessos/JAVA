package vehicleExtension;


public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    protected double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected double getFuelConsumption() {
        return this.fuelConsumption;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected int getTankCapacity() {
        return this.tankCapacity;
    }

    private void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected abstract void calculateDistance(Double distance);

    protected abstract void calculateDistance(Double distance,String havePeople);

    protected abstract void refuel(Double fuel);
}
