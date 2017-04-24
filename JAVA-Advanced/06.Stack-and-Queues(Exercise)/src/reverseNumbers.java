import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class reverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers = scanner.nextLine().split(" ");

        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.valueOf(number));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
