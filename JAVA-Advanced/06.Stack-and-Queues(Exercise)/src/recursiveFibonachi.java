import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursiveFibonachi {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(reader.readLine());

        long number1 = 1;
        long number2 =1;
        long number = 1;

        for (int i = 1; i < N; i++) {

            number = number2+number1;
            number1=number2;
            number2 = number;

        }
        System.out.println(number);
    }
}
