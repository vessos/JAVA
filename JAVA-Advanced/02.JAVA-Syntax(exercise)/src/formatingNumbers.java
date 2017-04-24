import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class formatingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();


        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a,
                String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0"), b, c);
    }
}
