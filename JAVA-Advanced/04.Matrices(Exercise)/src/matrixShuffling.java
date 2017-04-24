import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class matrixShuffling {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int x = array[0];
            int y = array[1];

            String[][] matrix = new String[x][y];

            for (int row = 0; row < x; row++) {
                String[] getRow = reader.readLine().split(" ");

                for (int col = 0; col < y; col++) {
                    matrix[row][col] = getRow[col];
                }
            }


            String line = "";
            while (!"END".equals(line = reader.readLine())) {
                String[] commands = line.split(" ");
                if (!"swap".equals(commands[0])) {
                    System.out.println("Invalid input!");
                } else {
                    int row1 = Integer.valueOf(commands[1]);
                    int row2 = Integer.valueOf(commands[3]);
                    int col1 = Integer.valueOf(commands[2]);
                    int col2 = Integer.valueOf(commands[4]);
                    if (row1 >= x || row2 >= x || col1 >= y || col2 >= y) {
                        System.out.println("Invalid input!");
                    } else {
                        String firstElement = matrix[row1][col1];
                        String secondElement = matrix[row2][col2];

                        matrix[row1][col1] = secondElement;
                        matrix[row2][col2] = firstElement;

                        for (String[] strings : matrix) {

                            for (String string : strings) {
                                System.out.print(string + " ");
                            }
                            System.out.println();
                        }
                    }

                }


            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
