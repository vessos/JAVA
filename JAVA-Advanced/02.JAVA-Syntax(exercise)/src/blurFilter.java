import java.util.Scanner;

public class blurFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blurAmount = Integer.parseInt(scanner.nextLine());

        String []input = scanner.nextLine().split(" ");

        long[][]matrix = new long[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int i = 0; i <matrix.length ; i++) {
            String[] fillMatrix = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=Integer.parseInt(fillMatrix[j]);
            }
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int row11 = Integer.parseInt(coordinates[0]);
        int col11 = Integer.parseInt(coordinates[1]);

        int leftRow = Math.max(row11-1,0);
        int rightRow=Math.min(row11+1,matrix.length-1);
        int upColl = Math.max(col11-1,0);
        int downColl=Math.min(col11+1,matrix[0].length-1);

        matrix=fillMatrix(leftRow,upColl,rightRow,downColl,matrix,blurAmount);

        for (long[] ints : matrix) {
            for (long anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
    public static long[][]fillMatrix(int row1,int col1,int row2,int col2,long[][]matrix,int blurAmount){
        for (int row = row1; row <=row2 ; row++) {
            for (int col = col1; col <=col2; col++) {
                matrix[row][col]+=blurAmount;

            }
        }
        return matrix;
    }






}
