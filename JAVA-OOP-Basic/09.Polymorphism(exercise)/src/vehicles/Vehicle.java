package vehicles;

public  class Vehicle {

    private Double fuelQuantity;
    private Double litersPerKm;

    public Vehicle(Double fuelQuantity, Double litersPerKm){

        this.fuelQuantity= fuelQuantity;
        this.litersPerKm = litersPerKm;
    }

    protected Double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }


    protected Double getLitersPerKm() {
        return this.litersPerKm;
    }

    protected void setLitersPerKm(Double fuelComsumtion) {
        this.litersPerKm = fuelComsumtion;
    }

    protected  void calculateDistance(Double distance){
        Double fuelConsumption = distance*this.litersPerKm;
        if(fuelConsumption<fuelQuantity){
            throw new IllegalArgumentException("Vehicle needs refueling");
        }
        this.fuelQuantity-=fuelConsumption;
    };
    protected void refuel(Double fuel){
        this.fuelQuantity+=fuel;
    }
}

