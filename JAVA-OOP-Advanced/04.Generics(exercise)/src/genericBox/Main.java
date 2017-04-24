package genericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        while(n-->0){

            Integer value = Integer.valueOf(reader.readLine());
            Box box = new Box(value);
            System.out.println(box);
        }
    }
}

