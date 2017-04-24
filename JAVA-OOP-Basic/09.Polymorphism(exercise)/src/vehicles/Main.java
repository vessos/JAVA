package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,Vehicle>vehicle = new LinkedHashMap<>();
        String[]inputCar = reader.readLine().split(" ");
        Vehicle car = new Car(Double.valueOf(inputCar[1]),Double.valueOf(inputCar[2]));
        vehicle.put("Car",car);
        String[]inputTruck = reader.readLine().split(" ");
        Vehicle truck = new Truck(Double.valueOf(inputTruck[1]),Double.valueOf(inputTruck[2]));
        vehicle.put("Truck",truck);
        
        int N = Integer.valueOf(reader.readLine());

        while(N-->0){
            String[]input = reader.readLine().split(" ");
            String typeOfVenhicle = input[1];
            String process = input[0];
            Double distance = Double.valueOf(input[2]);

            if("Drive".equals(process)){
                DecimalFormat format = new DecimalFormat("0.#################");
                try {
                    vehicle.get(typeOfVenhicle).calculateDistance(distance);
                    System.out.println(typeOfVenhicle + " travelled "+ format.format(distance)+ " km" );
                }catch (IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }
                
            }else{
                vehicle.get(typeOfVenhicle).refuel(distance);
            }
        }
        for (String s : vehicle.keySet()) {
            System.out.println(String.format("%s: %.2f",s,vehicle.get(s).getFuelQuantity()));
        }
    }
}
