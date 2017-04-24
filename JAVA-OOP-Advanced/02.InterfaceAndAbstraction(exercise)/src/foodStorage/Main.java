package foodStorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        HashMap<String,Buyer> buyers = new HashMap<>();
        Buyer buyer;

        for (int i = 0; i <n ; i++) {

            String[]line = reader.readLine().split(" ");
            if(line.length==4){
                buyer = new Citizen(line[0],Integer.valueOf(line[1]),line[2],line[3]);
                buyers.put(line[0],buyer);

            }else{
                buyer = new Rebel(line[0],Integer.valueOf(line[1]),line[2]);
                buyers.put(line[0],buyer);
            }
        }
        String input = "";
        while(!"End".equals(input=reader.readLine())){

            String name = input;

            for (String s : buyers.keySet()) {
                if(name.equals(s)){
                    buyers.get(s).BuyFood();
                }
            }
        }

        Integer food = 0;
        for (String s : buyers.keySet()) {
            food+=buyers.get(s).getFood();

        }
        System.out.println(food);
    }
}
