import java.util.Scanner;

public class maxSequenceMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String[][] matrix = new String[Integer.valueOf(input[0])][Integer.valueOf(input[1])];

        for (int i = 0; i < matrix.length; i++) {
            String[] index = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = index[j];

            }
        }

        int count = 0;
        String element = "";

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int mCount = countMatrixRow(matrix, row, col);
                if (count <= mCount) {
                    count = mCount;
                    element = matrix[row][col];
                }

            }

        }

        for (int i = 0; i < count; i++) {
            System.out.print(element + ", ");
        }
    }

    public static int countMatrixRow(String[][] matrix, int row, int col) {
        int mCount = 0;
        int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;

        if(row==0){
            for (int i = 1; i < matrix[row].length - col; i++) {
                if (matrix[row][col].equals(matrix[row][col + i])) {
                    count1++;
                } else {
                    break;
                }
            }
        }


        if (mCount <count1) {
            mCount = count1;
        }

        for (int i = 1; i < matrix.length - row; i++) {
            if (matrix[row][col].equals(matrix[row + i][col])) {
                count2++;
            } else {
                break;
            }

        }
        if (mCount <= count2) {
            mCount = count2;
        }

        for (int i = 1, j = 1; i < matrix.length - row && j < matrix[row].length - col; i++, j++) {
            if (matrix[row][col].equals(matrix[row + i][col + j])) {
                count3++;
            } else {
                break;
            }

        }
        if (mCount < count3) {
            mCount = count3;
        }
//        if (col > 0 && row < matrix.length - 1) {
//            for (int i = row + 1, j = col - 1; i < matrix.length && j >= 0; i++, j--) {
//                if (matrix[row][col].equals(matrix[i][j])) {
//                    count4++;
//                } else {
//                    break;
//                }
//
//            }
//            if (mCount < count4) {
//                mCount = count4;
//            }
//        }



        return mCount;
    }
}
