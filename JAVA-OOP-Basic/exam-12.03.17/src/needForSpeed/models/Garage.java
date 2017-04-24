package needForSpeed.models;

import needForSpeed.models.cars.Car;

import java.util.HashMap;

public class Garage {

    private HashMap<Integer,Car> parkedCars;

    public Garage(){
        this.parkedCars = new HashMap<>();
    }

    public HashMap<Integer, Car> getParkedCars() {
        return this.parkedCars;
    }

    public void addCar(int id, Car car){
        this.parkedCars.put(id,car);
    }

    public void removeCar(int id){
        if(parkedCars.containsKey(id)){
            parkedCars.remove(id);
        }
    }
}
