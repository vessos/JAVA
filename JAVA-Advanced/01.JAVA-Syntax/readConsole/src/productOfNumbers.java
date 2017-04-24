import java.math.BigInteger;
import java.util.Scanner;

public class productOfNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int count = firstNumber;
        BigInteger sum =new BigInteger("1");

        do{
            sum = sum.multiply(new BigInteger(String.valueOf(count)));
            count++;
        }while(count<=secondNumber);
        System.out.printf("product[%s..%s] = %s",firstNumber,secondNumber,sum);
    }
}
