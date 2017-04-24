package pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line = "";
        Boolean isItExeption = false;

        while (!"END".equals(line = reader.readLine()) && !isItExeption) {
            String[] input = line.split(" ");

            switch (input[0]) {
                case "Pizza":
                    String pizzaType = input[1];
                    int topping = Integer.valueOf(input[2]);

                    try {
                        Pizza pizza = new Pizza(pizzaType, topping);
                        String[] doughInput = reader.readLine().split(" ");
                        String flour = doughInput[1];
                        String backers = doughInput[2];
                        int doughWeight = Integer.valueOf(doughInput[3]);
                        Dough dough = new Dough(flour, backers, doughWeight);
                        pizza.addDough(dough);


                        for (int i = 0; i < topping; i++) {

                            String[] toppingInput = reader.readLine().split(" ");
                            String toppingType = toppingInput[1];
                            double toppingWeight = Double.valueOf(toppingInput[2]);

                            Topping topping1 = new Topping(toppingType, toppingWeight);
                            pizza.addTopping(topping1);
                        }
                        System.out.println(pizza);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                        isItExeption = true;
                    }
                    break;
                case "Dough":
                    try{
                        String []doughInput = line.split(" ");
                        String flour = doughInput[1];
                        String backers = doughInput[2];
                        int doughWeight = Integer.valueOf(doughInput[3]);
                        Dough dough = new Dough(flour, backers, doughWeight);
                        System.out.println(String.format("%.2f",dough.getCalories()));
                    }catch (IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Topping":
                    try{
                        String[] toppingInput = line.split(" ");
                        String toppingType = toppingInput[1];
                        double toppingWeight = Double.valueOf(toppingInput[2]);
                        Topping topping1 = new Topping(toppingType, toppingWeight);
                        System.out.println(String.format("%.2f",topping1.getCalories()));
                    }catch(IllegalArgumentException iae){
                        System.out.println(iae.getMessage());
                    }

                    break;
            }
        }






    }
}
