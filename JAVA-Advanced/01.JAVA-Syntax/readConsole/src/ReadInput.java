import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();

        int number1 = scanner.nextInt();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        String word3 = scanner.next();

        int sum = (int)(number1+number2+number3);

        System.out.print(word1 + " " + word2 + " " + word3 + " " + sum);
    }
}
