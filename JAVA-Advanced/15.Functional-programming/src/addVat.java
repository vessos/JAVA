import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class addVat {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String []input = reader.readLine().split(", ");
        ArrayList<Double>numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Double.valueOf(s));
        }
        UnaryOperator<Double>vat = (n)->n*1.2;

        System.out.println("Prices with VAT:");

        for (Double number : numbers) {
            Double vN = vat.apply(number);
            String num1 = String.format("%.2f",vN).replaceAll("\\.",",");
            System.out.println(num1);
        }
    }
}
