import java.util.Scanner;

/**
 * Created by MARK-Max on 19/01/2017.
 */
public class oddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if(input.length%2!=0){
            System.out.println("invalid length");
        }else{
            int []numbers = new int[input.length];
            for (int i = 0; i <input.length ; i++) {
                numbers[i]=Integer.parseInt(input[i]);
            }

            for (int i = 0; i <numbers.length ; i+=2) {
                if(numbers[i]%2==0&&numbers[i+1]%2==0){
                    System.out.printf("%d, %d -> both are even",numbers[i],numbers[i+1]);
                }else if(numbers[i]%2!=0&&numbers[i+1]%2!=0){
                    System.out.printf("%d, %d -> both are odd",numbers[i],numbers[i+1]);
                }else{
                    System.out.printf("%d, %d -> different",numbers[i],numbers[i+1]);
                }
                System.out.println();
            }
        }

    }
}
