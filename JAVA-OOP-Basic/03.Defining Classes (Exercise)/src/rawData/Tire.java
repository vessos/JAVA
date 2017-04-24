package rawData;

public class Tire {

    private Integer tireAge;
    private Double tirePressure;

    public Tire(Integer age,Double pressure){
        this.tireAge = age;
        this.tirePressure = pressure;
    }

    public Double getTirePressure() {
        return this.tirePressure;
    }

    public boolean isPresure(){
        if(this.tirePressure<1){
            return true;
        }else{
            return false;
        }
    }
}
