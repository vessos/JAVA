package rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        List<Car>cars = new ArrayList<>();

        for (int i = 0; i <N ; i++) {
            List<Tire> tires = new ArrayList<>();
            String[]car = reader.readLine().split(" ");
            Engine engine = new Engine(Integer.valueOf(car[1]),Integer.valueOf(car[2]));
            Cargo cargo = new Cargo(Integer.valueOf(car[3]),car[4]);
            for (int j = 5; j < car.length-1; j+=2) {
                Tire tire = new Tire(Integer.valueOf(car[j+1]),Double.valueOf(car[j]));
                tires.add(tire);
            }
            Car newCar = new Car(car[0],engine,cargo,tires);
            cars.add(newCar);

        }
        String type = reader.readLine();

        if("fragile".equals(type)){
            for (Car car : cars) {
                for (Tire tire : car.getTires()) {
                    if(tire.isPresure()){
                        System.out.println(car.getModel());
                        break;
                    }
                }
            }
        }else{
            for (Car car : cars) {
                if(car.checkEnginePower()){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}

