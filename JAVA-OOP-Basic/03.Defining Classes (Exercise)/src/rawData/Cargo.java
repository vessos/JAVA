package rawData;


public class Cargo {

    private Integer cargoWeight;
    private String cargoType;

    public Cargo(Integer cargoWeight,String cargoType){
        this.cargoWeight = cargoWeight;
        this.setCargoType(cargoType);
    }

    public String getCargoType() {
        return this.cargoType;
    }

    private void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}
