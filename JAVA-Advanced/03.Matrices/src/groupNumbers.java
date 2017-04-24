import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MARK-Max on 18/01/2017.
 */
public class groupNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(0,new ArrayList<>());
        matrix.add(1,new ArrayList<>());
        matrix.add(2,new ArrayList<>());

        for (String s : input) {
            int currentNumber = Integer.parseInt(s);
            matrix.get(Math.abs(currentNumber%3)).add(currentNumber);
        }

        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");

            }
            System.out.println();
        }
    }
}
