package genericCountMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Box<? super Double>box = new BoxImpl<>();
        while(n-->0){
            Double element = Double.valueOf(reader.readLine());
            box.addElement(element);
        }
        Double compareElement = Double.valueOf(reader.readLine());
        box.compare(compareElement);

        System.out.println(box);
    }
}
