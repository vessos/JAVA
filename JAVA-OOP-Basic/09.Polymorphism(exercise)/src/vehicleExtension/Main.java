package vehicleExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Vehicle> venhicles = new LinkedHashMap<>();
        for (int i = 0; i <3 ; i++) {
            String[]inputCar = reader.readLine().split(" ");
            String type = inputCar[0];
            double fuelQuantity = Double.valueOf(inputCar[1]);
            double fuelConsumption = Double.valueOf(inputCar[2]);
            int tankCapacity = Integer.valueOf(inputCar[3]);
            switch(type){
                case"Car":
                    Vehicle car = new Car(fuelQuantity,fuelConsumption,tankCapacity);
                    venhicles.put(type,car);
                    break;
                case"Truck":
                    Vehicle truck = new Truck(fuelQuantity,fuelConsumption,tankCapacity);
                    venhicles.put(type,truck);
                    break;
                case"Bus":
                    Vehicle buss = new Bus(fuelQuantity,fuelConsumption,tankCapacity);
                    venhicles.put(type,buss);
                    break;
            }
        }
        int N = Integer.valueOf(reader.readLine());

        while(N-->0){
            String[]input = reader.readLine().split(" ");
            String typeOfVenhicle = input[1];
            String process = input[0];
            Double distance = Double.valueOf(input[2]);
            switch (typeOfVenhicle){
                case"Car":
                    proccesingVehicles(venhicles, typeOfVenhicle, process, distance);
                    break;
                case"Truck":
                    proccesingVehicles(venhicles, typeOfVenhicle, process, distance);
                    break;
                case"Bus":
                    if("Drive".equals(process)||"DriveEmpty".equals(process)){
                        DecimalFormat format = new DecimalFormat("0.#################");
                        try {
                            venhicles.get(typeOfVenhicle).calculateDistance(distance,process);
                            System.out.println(typeOfVenhicle + " travelled "+ format.format(distance)+ " km" );
                        }catch (IllegalArgumentException iae){
                            System.out.println(iae.getMessage());
                        }

                    }else{
                       try{
                           venhicles.get(typeOfVenhicle).refuel(distance);
                       }catch (IllegalArgumentException iae){
                           System.out.println(iae.getMessage());
                       }

                    }
                    break;
            }

        }
        for (String s : venhicles.keySet()) {
            System.out.println(String.format("%s: %.2f",s,venhicles.get(s).getFuelQuantity()));
        }

    }

    private static void proccesingVehicles(HashMap<String, Vehicle> venhicles, String typeOfVenhicle, String process, Double distance) {
        if("Drive".equals(process)){
            DecimalFormat format = new DecimalFormat("0.#################");
            try {
                venhicles.get(typeOfVenhicle).calculateDistance(distance);
                System.out.println(typeOfVenhicle + " travelled "+ format.format(distance)+ " km" );
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

        }else{
            try{
                venhicles.get(typeOfVenhicle).refuel(distance);
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }
}
