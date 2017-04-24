package rawData;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model ,Engine engine,Cargo cargo,List<Tire>tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return this.model;
    }

    public List<Tire> getTires() {
        return this.tires;
    }

    public boolean checkEnginePower(){
        if(this.engine.getEngginePower()>250){
            return true;
        }else{
            return false;
        }

    }

}
