import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class naturesPropeth {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[]dimensions =Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = dimensions[0];
        int m = dimensions[1];

        int[][]matrix = new int[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <m ; j++) {
                matrix[i][j]=0;
            }
        }
        String line = "";
        while(!"Bloom Bloom Plow".equals(line= reader.readLine())){

            String[]input = line.split(" ");
            int row = Integer.valueOf(input[0]);
            int col = Integer.valueOf(input[1]);

            matrix = fillMatrix(matrix,row,col);
        }

        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    public static int[][]fillMatrix (int[][]matrix,int row,int col){
        int [][]newMatrix = matrix;

        for (int coll = 0; coll < matrix[0].length ; coll++) {
            if(coll!=col){
                newMatrix[row][coll]+=1;
            }
        }
        for (int roww = 0; roww <matrix.length ; roww++) {
            newMatrix[roww][col]+=1;
        }
        return newMatrix;
    }
}
