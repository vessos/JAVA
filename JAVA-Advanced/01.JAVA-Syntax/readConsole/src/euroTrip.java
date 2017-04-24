import java.math.BigDecimal;
import java.util.Scanner;

public class euroTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kg = scanner.nextDouble();

        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInLeva = new BigDecimal(1.2*kg);
        BigDecimal totalPrice = exchangeRate.multiply(priceInLeva);

        System.out.printf("%.2f marks",totalPrice);

    }
}
