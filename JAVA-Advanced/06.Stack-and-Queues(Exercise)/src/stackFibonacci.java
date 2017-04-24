import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class stackFibonacci {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(reader.readLine());

        ArrayDeque<Long>stack = new ArrayDeque<>();

        long number1=1L;
        long number2 =1L;


        stack.push(number1);
        stack.push(number2);

        for (int i = 1; i < N; i++) {
            number1 = stack.pop();
            number2=stack.peek();
            long Sum = number1+number2;
            stack.push(number1);
            stack.push(Sum);

        }
        System.out.println(stack.pop());

    }
}
