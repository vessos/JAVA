package coffeeMashine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        CoffeeMachine cm = new CoffeeMachine();
        while(!"END".equals(line = reader.readLine())){

            String[] input = line.split(" ");
            if(input.length==1){
               cm.insertCoin(input[0]);
            }else{
                cm.buyCoffee(input[0],input[1]);
            }

        }
        for (Coffee coffee : cm.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
