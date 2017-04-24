import java.util.Scanner;

public class maximalSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String []input = scanner.nextLine().split(" ");

        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int i = 0; i <matrix.length ; i++) {
            String[] inputOfNum = scanner.nextLine().split(" ");
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=Integer.parseInt(inputOfNum[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int firstNumber = 0;
        int secondNumber =0;

        for (int row = 0; row <matrix.length-2; row++) {
            for (int col = 0; col <matrix[row].length-2 ; col++) {
                int sum = fillMatrix(row,col,matrix);
                if(sum>maxSum){
                    maxSum=sum;
                    firstNumber=row;
                    secondNumber=col;
                }
            }
        }

        System.out.println("Sum = "+maxSum);
        for (int i = firstNumber; i <firstNumber+3 ; i++) {
            for (int j = secondNumber; j < secondNumber+3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static int fillMatrix(int row,int col,int[][]matrix){
        int sum = 0;
        for (int i = row; i <row+3 ; i++) {
            for (int j = col; j < col+3; j++) {
               sum+= matrix[i][j];
            }
        }
        return sum;
    }

}
