package needForSpeed.models;

import needForSpeed.models.cars.Car;
import needForSpeed.models.cars.PerformanceCar;
import needForSpeed.models.cars.ShowCar;
import needForSpeed.models.races.CasualRace;
import needForSpeed.models.races.DragRace;
import needForSpeed.models.races.DriftRace;
import needForSpeed.models.races.Race;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CarManager {

    private HashMap<Integer, Car> cars;
    private HashMap<Integer, Race> races;
    private Garage garage;
    private LinkedHashMap<Integer, Double> winner;

    public CarManager() {
        this.cars = new HashMap<>();
        this.races = new HashMap<>();
        this.garage = new Garage();
        this.winner = new LinkedHashMap<>();
    }


    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        if ("Performance".equals(type)) {
            PerformanceCar car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
            this.cars.put(id, car);
        } else if ("Show".equals(type)) {
            ShowCar car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
            this.cars.put(id, car);
        }
    }

    public String check(int id) {

        return this.cars.get(id).toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        Race race = null;
        switch (type) {
            case "Casual":
                race = new CasualRace(length, route, prizePool);
                break;
            case "Drag":
                race = new DragRace(length, route, prizePool);
                break;
            case "Drift":
                race = new DriftRace(length, route, prizePool);
                break;
        }
        this.races.put(id, race);
    }

    public void participate(int carId, int raceId) {
        boolean isItCarInGarage = false;
        for (Integer id : garage.getParkedCars().keySet()) {
            if (carId == id) {
                isItCarInGarage = true;
            }
        }
        if (!isItCarInGarage) {
            this.races.get(raceId).addParticipants(carId, this.cars.get(carId));
        }

    }

    public String start(int id) {
        if (!races.get(id).getParticipants().isEmpty()) {
            String nameRace = races.get(id).getClass().getName().substring(26);
            int raceLength = races.get(id).getLength();
            for (Integer carId : races.get(id).getParticipants().keySet()) {
                Car car = races.get(id).getParticipants().get(carId);
                double PP = calculatePP(car, nameRace);
                winner.put(carId, PP);
            }
            LinkedHashMap<Integer, Double> sorted = new LinkedHashMap<>();
            if (winner.size() > 3) {
                sorted = winner.entrySet().stream()
                        .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                        .limit(3)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            } else {
                sorted = winner.entrySet().stream()
                        .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }

            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s - %d\n", races.get(id).getRoute(), raceLength));
            int count = 1;

            for (Integer carID : sorted.keySet()) {
                String brand = races.get(id).getParticipants().get(carID).getBrand();
                String model = races.get(id).getParticipants().get(carID).getModel();
                if(count==sorted.size()){
                    builder.append(String.format("%d. %s %s %.0fPP - $%.0f", count, brand, model, sorted.get(carID), races.get(id).getPrizePool(count)));
                }else{
                    builder.append(String.format("%d. %s %s %.0fPP - $%.0f\n", count, brand, model, sorted.get(carID), races.get(id).getPrizePool(count)));
                }

                count++;
            }
            races.remove(id);
            winner= new LinkedHashMap<>();
            return builder.toString();
        }
        return "Cannot start the race with zero participants.";
    }

    public void park(int id) {
        boolean isItrace = false;
        for (Integer raceId : races.keySet()) {
            if (races.get(raceId).getParticipants().containsKey(id)) {
                isItrace = true;
            }
        }
        if (!isItrace) {
            Car car = cars.get(id);
            garage.addCar(id, car);
        }


    }

    public void unpark(int id) {
        if(garage.getParkedCars().containsKey(id)){
            garage.removeCar(id);
        }
    }

    public void tune(int tuneIndex, String addOn) {
        for (Car car : garage.getParkedCars().values()) {
            car.addTune(tuneIndex,addOn);
        }
    }

    public double calculatePP(Car car, String route) {
        double pp = 0.0;
        switch (route) {
            case "CasualRace":
                pp = (car.getHorsepower() / car.getAcceleration())
                        + (car.getSuspension() + car.getDurability());
                break;
            case "DragRace":
                pp = car.getHorsepower() / car.getAcceleration();
                break;
            case "DriftRace":
                pp = car.getSuspension() + car.getDurability();
                break;
        }

        return pp;
    }

//    public static void main(String[] args) {
//        CarManager carManager = new CarManager();
//        carManager.register(1,"Performance","BMW","M92",2013,300,4,150,75);
//        carManager.register(2,"Show","zebra","prr",2015,300,4,150,75);
//        carManager.open(1,"Drag",10,"BeverlyHills",50000);
//        carManager.open(2,"Casual",104,"tree",10000);
//        carManager.participate(1,1);
//        System.out.println(carManager.check(1));
//        System.out.println(carManager.start(1));
//
//        //String debug = "";
//    }
}
