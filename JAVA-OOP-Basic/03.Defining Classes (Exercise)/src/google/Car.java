package google;

public class Car {

    private String carModel;
    private Integer carSpeed;

    public Car(){

    }

    public Car(String carModel,Integer carSpeed){
        this.setCarModel(carModel);
        this.setCarSpeed(carSpeed);
    }

    private String getCarModel() {
        return this.carModel;
    }

    private void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    protected Integer getCarSpeed() {
        return this.carSpeed;
    }

    private void setCarSpeed(Integer carSpeed) {
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.getCarModel(),this.getCarSpeed());
    }
}
