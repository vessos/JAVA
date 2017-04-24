import java.util.Scanner;

public class collectTheCoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[4][];


        for (int row = 0; row < matrix.length; row++) {
            String[] input = scanner.nextLine().split("");
            matrix[row] = new String[input.length];
            for (int col = 0; col < input.length; col++) {
                matrix[row][col] = input[col];
            }
        }

        String[] movement = scanner.nextLine().split("");

        int coin = 0;
        int rowMatrix = 0;
        int colMatrix = 0;
        int wallsHit = 0;

        for (int i = 0; i < movement.length; i++) {

            switch (movement[i]) {

                case "V":
                    if(!(colMatrix>matrix[rowMatrix+1].length-1)){
                        rowMatrix++;

                    }else{
                        wallsHit+=1;
                    }
                    if (rowMatrix >= matrix.length) {

                        rowMatrix = matrix.length - 1;
                        wallsHit += 1;
                    }
                    break;
                case ">":

                    if (colMatrix != matrix[rowMatrix].length-1) {
                        colMatrix++;

                    }else{
                        wallsHit+=1;
                    }
                    break;
                case "<":

                    if (colMatrix!=0) {
                        colMatrix--;
                    }else{
                        wallsHit += 1;
                    }
                    break;
                case "^":

                    if (rowMatrix != 0) {

                        rowMatrix--;

                    }else{
                        wallsHit += 1;
                    }
                    break;

            }

            if (matrix[rowMatrix][colMatrix].equals("$")) {

                coin += 1;

            }

        }

        System.out.println("Coins = " + coin);
        System.out.println("Walls = " + wallsHit);


    }
}
