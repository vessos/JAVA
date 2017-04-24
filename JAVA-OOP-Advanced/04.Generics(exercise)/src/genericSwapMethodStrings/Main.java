package genericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        Swap swap = new Swap();

        while(n-->0){
            Integer name = Integer.valueOf(reader.readLine());
            swap.addElement(name);
        }
        String[]input = reader.readLine().split(" ");
        swap.swapElement(Integer.valueOf(input[0]),Integer.valueOf(input[1]));
        System.out.println(swap);
    }
}
