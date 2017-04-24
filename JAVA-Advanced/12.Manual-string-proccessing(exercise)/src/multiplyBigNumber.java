import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class multiplyBigNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();
        String number2  = reader.readLine();

        BigDecimal num1 = new BigDecimal(number1);
        BigDecimal num2 = new BigDecimal(number2);
        BigDecimal x = new BigDecimal("0");

        x = num1.multiply(num2);

        System.out.println(x);
    }
}
