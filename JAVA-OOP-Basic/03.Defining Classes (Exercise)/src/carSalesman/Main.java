package carSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Engine>engines = new HashMap<>();
        List<Car>cars = new ArrayList<>();
        String numbers = "1234567890";

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N ; i++) {

            String[]line = reader.readLine().split(" ");

            Engine engine = null;

            switch (line.length){

                case 4 :
                    engine = new Engine(line[0],Integer.valueOf(line[1]),Integer.valueOf(line[2]),line[3]);
                    break;
                case 3 :
                    String type = String.valueOf(line[2].charAt(0));
                    if(numbers.contains(type)){
                        engine = new Engine(line[0],Integer.valueOf(line[1]),Integer.valueOf(line[2]));
                    }else{
                        engine = new Engine(line[0],Integer.valueOf(line[1]),line[2]);
                    }
                    break;
                case 2 :
                    engine = new Engine(line[0],Integer.valueOf(line[1]));
                    break;
            }
            engines.put(line[0],engine);

        }

        N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {

            String[]input = reader.readLine().split(" ");

            Car car = null;
            String carName = input[0];
            String carTypeEngine = input[1];
            Engine carEngine = engines.get(carTypeEngine);

            switch (input.length){

                case 4 :
                    car = new Car(carName,carEngine,Integer.valueOf(input[2]),input[3]);
                    break;
                case 3 :
                    String type1 = String.valueOf(input[2].charAt(0));
                    if(numbers.contains(type1)){
                        car = new Car(carName,carEngine,Integer.valueOf(input[2]));
                    }else{
                        car = new Car(carName,carEngine,input[2]);
                    }
                    break;
                case 2 :
                    car = new Car(carName,carEngine);
                    break;
            }
            cars.add(car);

        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }


}
