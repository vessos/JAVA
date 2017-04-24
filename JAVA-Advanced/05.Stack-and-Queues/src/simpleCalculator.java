import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack,tokens);

        while(stack.size()>1){
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            if(operator.equals("+")){
                stack.push(String.valueOf(first+second));
            }else{
                stack.push(String.valueOf(first-second));

            }
        }
        System.out.println(stack.pop());
    }
}
