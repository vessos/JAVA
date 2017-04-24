import java.util.Scanner;

public class squaresInMatrix {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        String[][] matrix = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int i = 0; i <matrix.length ; i++) {
            String[] indexofchar = scanner.nextLine().split(" ");
            for (int j = 0; j <matrix[i].length ; j++) {
                matrix[i][j]=indexofchar[j];
            }
        }

        int count =0;

        for (int row = 0; row <matrix.length-1 ; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                if(matrix[row][col].equals(matrix[row][col+1])&&
                        matrix[row][col].equals(matrix[row+1][col])&&
                        matrix[row][col].equals(matrix[row+1][col+1])){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
