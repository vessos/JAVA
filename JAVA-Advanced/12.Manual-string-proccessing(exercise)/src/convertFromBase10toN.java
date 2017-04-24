import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class convertFromBase10toN {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]input = reader.readLine().split(" ");
        BigInteger baseN = new BigInteger(input[0]);
        BigInteger number = new BigInteger(input[1]);
        StringBuilder Nnumber = new StringBuilder();

        while(number.compareTo(new BigInteger("0"))>0){
            BigInteger[] result = number.divideAndRemainder(baseN);
            Nnumber.append(result[1]);
            number=result[0];
        }
        System.out.println(Nnumber.reverse());
    }
}
