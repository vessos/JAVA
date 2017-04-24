import java.util.Scanner;

/**
 * Created by MARK-Max on 19/03/2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" n = ");
        int n = input.nextInt();
        long factorial = factorial(n);
        System.out.printf(" %d! = %d%n " , n, factorial);
        input.close();
    }

    private static long factorial(int n) {
        if(n<2){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
