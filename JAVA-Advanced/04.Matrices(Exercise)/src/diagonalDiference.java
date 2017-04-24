import java.util.Scanner;

/**
 * Created by MARK-Max on 18/01/2017.
 */
public class diagonalDiference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] inputNumber = scanner.nextLine().split(" ");
            for (int col = 0; col < n; col++) {
                matrix[row][col]=Integer.parseInt(inputNumber[col]);
            }
        }
        int sum1 =0;
        int sum2 =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    sum1+=matrix[i][j];
                }if(j==n-i-1){
                    sum2+=matrix[i][j];
                }
            }
        }

        int sum =Math.abs(sum1-sum2);

        System.out.println(sum);


    }
}
