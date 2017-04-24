import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shockWave {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]input = reader.readLine().split(" ");

        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        int[][]matrix = new int[n][m];

        for (int row = 0; row <matrix.length ; row++) {

            for (int coll = 0; coll <matrix[0].length ; coll++) {

                matrix[row][coll]=0;
            }

        }
        String line = "";

        while(!"Here We Go".equals(line = reader.readLine())){

            String[]nums = line.split(" ");
            int row1 = Integer.valueOf(nums[0]);
            int coll1 = Integer.valueOf(nums[1]);
            int row2 = Integer.valueOf(nums[2]);
            int coll2 = Integer.valueOf(nums[3]);

            for (int i = row1; i <= row2; i++) {

                for (int j = coll1; j <=coll2 ; j++) {

                    matrix[i][j]+=1;
                }

            }
        }

        for (int[] ints : matrix) {
            for (int p : ints) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
