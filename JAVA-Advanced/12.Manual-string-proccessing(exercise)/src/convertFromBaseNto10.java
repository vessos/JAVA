import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class convertFromBaseNto10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]nums = reader.readLine().split(" ");

        int baseN = Integer.parseInt(nums[0]);
        StringBuilder number = new StringBuilder(nums[1]);

        number.reverse();

        BigInteger sum = new BigInteger("0");
        String[]lines = number.toString().split("");

        for (int i = 0; i <lines.length ; i++) {

            BigInteger numm = new BigInteger(lines[i]);
            BigInteger bN = new BigInteger(String.valueOf(baseN));
            BigInteger result = bN.pow(i);
            BigInteger rezultat =  result.multiply(numm);
            sum = sum.add(rezultat);
//            sum+=(BigInteger)Integer.parseInt(lines[i])*(Math.pow(baseN,i));
        }

        System.out.println(sum);

    }
}
