import java.util.Scanner;

/**
 * Created by MARK-Max on 18/01/2017.
 */
public class matrixOfPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]input = scanner.nextLine().split("\\s+");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        String [][]matrix = new String[num1][num2];

        char ch = 'a';

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                char chr = (char)((int)(ch)+row);
                char chc = (char)((int)(ch)+col+row);
                matrix[row][col]= (String)(chr+""+chc+""+chr);
            }

        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}
