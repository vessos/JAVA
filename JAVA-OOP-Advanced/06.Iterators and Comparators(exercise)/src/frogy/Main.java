package frogy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        Lake<Long>odd = new Lake<>();
        Lake<Long>even = new Lake<>();

        while(!"END".equals(line = reader.readLine())){

            String[]input = line.split("[, ]+");
            for (int i = 0; i <input.length ; i++) {
                if(i%2==0){
                    odd.addElement(Long.parseLong(input[i]));
                }else{
                    even.addElement(Long.valueOf(input[i]));
                }
            }
        }
        List<String> elements = new ArrayList<>();
        for (Long oddElement : odd) {
            elements.add(String.valueOf(oddElement));
        }
        for (Long evenElement : even) {
            elements.add(String.valueOf(evenElement));
        }

        System.out.println(String.join(", ",elements));


    }
}
