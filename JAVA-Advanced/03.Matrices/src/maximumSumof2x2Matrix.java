import java.util.Scanner;

/**
 * Created by MARK-Max on 18/01/2017.
 */
public class maximumSumof2x2Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int[][] numbers = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int row = 0; row <numbers.length ; row++) {
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col <numbers[row].length; col++) {
                numbers[row][col]=Integer.parseInt(reminder[col]);
            }
        }
        int maxSum =Integer.MIN_VALUE;
        int startRow = 0;
        int startCol=0;

        for (int row = 0; row <numbers.length-1 ; row++) {
            for (int col = 0; col <numbers[row].length-1 ; col++) {
                int sum = numbers[row][col]+
                        numbers[row][col+1]+
                        numbers[row+1][col]+
                        numbers[row+1][col+1];
                if(sum>maxSum){
                    maxSum=sum;
                    startRow=row;
                    startCol=col;
                }
            }
        }

        System.out.println(numbers[startRow][startCol]+" "+numbers[startRow][startCol+1]);
        System.out.println(numbers[startRow+1][startCol]+" "+numbers[startRow+1][startCol+1]);
        System.out.println(maxSum);


    }
}
