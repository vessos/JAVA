
public class Labirint {
    public static void main(String[] args) {
        findPath(0, 0,'S');


    }

    private static char[][] lab = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', 'e', ' ', ' ', ' '},


    };

    private static char[]path = new char[lab[0].length*lab.length];
    private static int position = 0;

    private static void findPath(int row, int col,char direction) {
        if (col < 0 || (row < 0) || (col >=lab[0].length) || (row >=lab.length)) {
            return;
        }

        path[position]=direction;
        position++;
        if (lab[row][col] == 'e') {
            printPath(path,1,position-1);
        }
        if (lab[row][col] == ' ') {

            lab[row][col] = 's';
            findPath(row, col - 1,'L');
            findPath(row - 1, col,'U');
            findPath(row, col + 1,'R');
            findPath(row + 1, col,'D');
            lab[row][col] = ' ';
        }
        position--;
    }
    private static void printPath(char[]path,int startPos,int endPos){
        System.out.println("Found path to the exit: ");
        for (int i =startPos; i <=endPos ; i++) {
            System.out.print(path[i]);
        }
        System.out.println();
        for (int i = 0; i <lab.length ; i++) {
            for (int j = 0; j <lab[i].length ; j++) {
                System.out.print(lab[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
