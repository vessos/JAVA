import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class formatingNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");


        int a = Integer.parseInt(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = Double.parseDouble(numbers[2]);
        String binary = Integer.toBinaryString(a);
        if (binary.length() < 10) {
            while (binary.length() < 10) {
                binary = "0" + binary;
            }
        } else if (binary.length() > 10) {
            binary = binary.substring(0,10);
        }

        System.out.println(String.format("|%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|", a, binary, b, c));

    }
}
