package speedRacing;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        LinkedHashMap<String,Car>cars = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {

            String[] line = reader.readLine().split(" ");
            String model = line[0];
           Double fuelAmount = Double.valueOf(line[1]);
            Double cost = Double.parseDouble(line[2]);
            Car car = new Car(model,fuelAmount,cost);
            cars.put(car.getModel(),car);
        }

        String input = "";

        while(!"End".equals(input= reader.readLine())){

            String[] raceCar = input.split(" ");

            String model = raceCar[1];
            Double amountOfKm = Double.parseDouble(raceCar[2]);
            try{
                cars.get(model).carTrvaeled(amountOfKm);
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

        }

        for (String s : cars.keySet()) {
            System.out.println(cars.get(s));
        }
    }
}
