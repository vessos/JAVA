import java.util.Scanner;

public class fillTheMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] index = scanner.nextLine().split(", ");

        int N = Integer.parseInt(index[0]);
        String type =index[1];

        if(type.equals("A")){
            int[][]matrix=typeA(N);
            printMatrix(matrix);
        }else{
            int[][]matrix=typeB(N);
            printMatrix(matrix);
        }

    }
    public static int[][] typeA(int N){
        int[][] matrix = new int[N][N];
        int count=1;

        for (int col = 0; col < N; col++) {
            for (int row = 0; row < N; row++) {
                matrix[row][col]=count;
                count++;
            }
        }
        return matrix;
    }
    public static int[][] typeB(int N){
        int[][] matrix = new int[N][N];
        int count=1;

        for (int col = 0; col < N; col++) {
            if(col%2==0){
                for (int row = 0; row < N; row++) {
                    matrix[row][col]=count;
                    count++;
                }
            }else{
                for (int row = N-1; row >=0; row--) {
                    matrix[row][col]=count;
                    count++;
                }
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][]matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
