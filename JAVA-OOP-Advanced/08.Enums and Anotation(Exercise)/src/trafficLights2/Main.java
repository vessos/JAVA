package trafficLights2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        TrafficL[] lights = new TrafficL[input.length];

        for (int i = 0; i < input.length; i++) {
            lights[i] = TrafficL.valueOf(input[i]);
        }

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <lights.length ; j++) {
                lights[j] = lights[j].next();
                System.out.print(lights[j]+ " ");

            }
            System.out.println();
        }

    }
}
