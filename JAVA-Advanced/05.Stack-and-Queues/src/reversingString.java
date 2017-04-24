import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by MARK-Max on 20/01/2017.
 */
public class reversingString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character>stack = new ArrayDeque<>();

        for (Character ch : input.toCharArray()) {
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
