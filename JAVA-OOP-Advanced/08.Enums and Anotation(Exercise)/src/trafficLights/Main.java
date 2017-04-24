package trafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]input = reader.readLine().split(" ");
        TrafficLight tl = new TrafficLight();

        for (int i = input.length-1; i>=0 ; i--) {
            tl.addLight(input[i]);
        }

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            tl.lightSignal();
            for (Lights lights : tl) {
                System.out.print(lights + " ");
            }
            System.out.println();
        }
    }
}
